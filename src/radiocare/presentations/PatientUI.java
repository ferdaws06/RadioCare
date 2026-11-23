package radiocare.presentations;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

import radiocare.controllers.PatientController;
import radiocare.entities.Patient;

public class PatientUI {
	private PatientController controller=new PatientController ();
	private Scanner sc=new Scanner(System.in);
	private DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	// menu principal 
	 public void menu() {
	        int choix = -1;
	        do {
	            System.out.println("\n=== GESTION DES PATIENTS ===");
	            System.out.println("1. Ajouter");
	            System.out.println("2. Modifier");
	            System.out.println("3. Supprimer");
	            System.out.println("4. Rechercher par CIN (fiche)");
	            System.out.println("5. Rechercher par prenom");
	            System.out.println("6. Rechercher par nom");
	            System.out.println("7. Lister tous");
	            System.out.println("0. Retour");
	            System.out.print("Choix : ");
	            try {
	            choix = Integer.parseInt(sc.nextLine());

	            if (choix == 1) ajouter();
	            else if (choix == 2) modifier();
	            else if (choix == 3) supprimer();
	            else if (choix == 4) afficherFiche();
	            else if (choix==5) rechercherParPrenom();
	            else if (choix==6) rechercherParNom();
	            else if (choix == 7) lister();
	            }catch (NumberFormatException e) {
					System.out.println("Erreur : il faut saisir un nombre.");
				    choix=-1;
				} catch (DateTimeParseException e) {
					System.out.println("Erreur : date invalide (format jj/mm/aaaa).");
				}
	        } while (choix != 0);
	    }
	
	 private void ajouter() {
		 System.out.println("-----Ajout d'un patient-----");
		 
		 System.out.println("CIN matricule : ");
		 int cIN_Matricule=sc.nextInt();
		 sc.nextLine();
		 
		 System.out.println("Nom : ");
		 String nom=sc.nextLine();
		 
		 System.out.println("Prenom : ");
		 String prenom=sc.nextLine();
		 
		 System.out.println("Date de naissance : ");
		 String texteDate = sc.nextLine();
		 LocalDate DateNaissance = LocalDate.parse(texteDate, format);   // pour changer le texte de type string en local date 
		 
		 System.out.println("Telephone : ");
		 int Téléphone=sc.nextInt();
		 sc.nextLine();
		 
		 System.out.println("Email : ");
		 String Email=sc.nextLine();
		 
		 System.out.println("Numero d'assurance : ");
		 int NumAssurance=sc.nextInt();
		 sc.nextLine();
		 
		 System.out.println(controller.ajouter(nom, prenom, cIN_Matricule, DateNaissance, Téléphone, Email, NumAssurance));
	 }
	 
	 private void modifier() {
		 
       System.out.println("-----Modification d'un patient-----");
       System.out.println("saisir le CIN de patient à modifier : ");
       int cIN_matricule=sc.nextInt();
       sc.nextLine();
       Patient p=controller.rechercherCIN(cIN_matricule);
       if (p==null) {
    	   System.out.println("ce patient n'existe pas !");
    	   return;
       }
       // lorsque la modification echoue on garde les valeurs ancienne
        String ancienNom = p.getNom();
		String ancienPrenom = p.getPrenom();
		LocalDate ancienneDate = p.getDateNaissance();
		int ancienTel = p.getTéléphone();
		String ancienEmail = p.getEmail();
		int ancienneAss = p.getNumAssurance();
		 
		 System.out.println(" nouveau CIN du patient ");
		 int CIN_Matricule=sc.nextInt();
		 sc.nextLine();
		 if(CIN_Matricule != 0) {
			 p.setCIN_Matricule(CIN_Matricule);
		 }
		 
		 System.out.println("Nouveau nom : ");
		 String nom=sc.nextLine();
		 if (!nom.equals("")) {
			 p.setNom(nom);
		 }
		 
		 System.out.println("Nouveau prenom : ");
		 String prenom=sc.nextLine();
		 if (!prenom.equals("")) {
			 p.setPrenom(prenom);
		 }
		 
		 System.out.println("Nouvelle date de naissance : ");
		 String texteDate = sc.nextLine();
		 LocalDate DateNaissance = LocalDate.parse(texteDate, format);   // pour changer le texte de type string en local date 
		 if (DateNaissance != null) {
			 p.setDateNaissance(DateNaissance);
		 }
		 
		 System.out.println("Nouveau Telephone : ");
		 int Téléphone=sc.nextInt();
		 sc.nextLine();
		 if (Téléphone != 0) {
			 p.setTéléphone(Téléphone);
		 }
		 
		 System.out.println("Nouvel email : ");
		 String Email=sc.nextLine();
		 if (!Email.equals("")) {
			 p.setEmail(Email);
		 }
		 
		 System.out.println("Nouveau numero d'assurance : ");
		 int NumAssurance=sc.nextInt();
		 sc.nextLine();
		 if (NumAssurance != 0) {
			 p.setNumAssurance(NumAssurance);
		 }
		System.out.println(controller.modifier(p));
		if (controller.modifier(p).startsWith("erreur")) {
			p.setNom(ancienNom);
			p.setPrenom(ancienPrenom);
			p.setDateNaissance(ancienneDate);
			p.setTéléphone(ancienTel);
			p.setEmail(ancienEmail);
			p.setNumAssurance(ancienneAss);
			System.out.println("Les anciennes valeurs ont été conservées.");
		}
	
		 }
	  private void supprimer() {
		  System.out.println("saisir le CIN du patient à supprimer");
		  int cin=sc.nextInt();
		  sc.nextLine();
		  Patient p =controller.rechercherCIN(cin);
		  if (p==null) {
			  System.out.println("le patient avec ce cin n'existe pas");
		  }
		  else {controller.supprimer(p);}
	  }
	  private void afficherListe(ArrayList liste) {
		    if (liste.isEmpty()) {
		        System.out.println("Aucun patient trouvé.");
		    } else {
		        for (int i = 0; i < liste.size(); i++) {
		            Patient p = (Patient) liste.get(i);   // cast : la liste n'est pas typée
		            System.out.println(p);                // appelle toString() de Patient
		        }
		    }
		}
	 private void rechercherParNom() {
		 System.out.println("nom du patient à rechercher : ");
		 String nom =sc.nextLine();
		 afficherListe(controller.rechercherNom(nom));
		}
	 private void rechercherParPrenom() {
		 System.out.println("prenom du patient à rechercher : ");
		 String prenom=sc.nextLine();
		 afficherListe(controller.rechercherPrenom(prenom));
		}
	 private void afficherFiche() {
		
		        System.out.print("CIN du patient à afficher : ");
		        int cin = sc.nextInt();
		        sc.nextLine();

		        Patient p = controller.rechercherCIN(cin);
		        if (p == null) {
		            System.out.println("le patient avec ce CIN n'existe pas");
		        } else {
		            afficherFiche(p);
		        }
		   
	 }
	 private void lister() {
		 afficherListe(controller.listerTous());
	 }
	 
	 // affichge de fiche de patient 
	 public void afficherFiche(Patient p) {
		 System.out.println("=============Fiche Patient==========");
		 System.out.println("Cin : " + p.getCIN_Matricule());
		 System.out.println("Nom : "+p.getNom());
		 System.out.println("Prenom : "+p.getPrenom());
		 System.out.println("Date naissance : "+p.getDateNaissance());
	     System.out.println("Téléphone : "+p.getTéléphone());
	     System.out.println("Email : "+p.getEmail());
	     System.out.println("Numero d'assurance : "+p.getNumAssurance());
	     System.out.println("Solde du compte : "+p.getSoldeCompte());
	     
	     System.out.println("-----Historique des examens d'imagerie-----");
	     int [] examens = p.getHistoriqueExamensIDs();
	     if (examens.length==0) {
	    	 System.out.println("ce patient n'a fait aucun examen avant ");
	     }
	     else {
	    	 for (int i=0;i<examens.length;i++) {
	    		 System.out.println(examens[i]);
	    	 }
	     }
	     System.out.println("=================================");
	 }
		 
		 
		 
		
		 
		 
		 
		 
		 
		 
		 
		 
	


}
