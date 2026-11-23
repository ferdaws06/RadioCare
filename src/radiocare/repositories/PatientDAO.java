package radiocare.repositories;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import radiocare.entities.Patient;

public class PatientDAO {
	private static final String  fichier ="patients.json";
	private Gson gson =new GsonBuilder().setPrettyPrinting().create();
	                                     // fichier bien lisible 
	private ArrayList liste=new ArrayList();
	
	
	public PatientDAO() {
		charger();	//lors du la construction d'un patient on charge tout les donnes dans la liste  							
	 }
	
	private void charger() {
		File f =new File(fichier);
		if(!f.exists()) {
			return;
		}
		try(Reader r= new FileReader(f)){ // reader lire la fichier Json
			Patient[] tab=gson.fromJson(r, Patient[].class);/** traduire texte (depuis le reader r ) grace a fromJson 
																*et le mettre dans un format 
																*table de patiient
																*/
			if (tab!=null) {
				for(int i=0;i<tab.length;i++) {
					liste.add(tab[i]);
				}
			}
																
		}catch(IOException e) {//input/output exceptoon 
			System.out.println("Erreur de lecture:"+e.getMessage());
			}
			
		}
		
	private void sauvgarder() {
		Patient[] tab=new Patient[liste.size()];
		for(int i=0;i<tab.length;i++) {
			tab[i]=(Patient) liste.get(i);
		}
		try( Writer w=new FileWriter(fichier)){
			gson.toJson(tab,w);
		}catch(IOException e) {
			System.out.println("Erreur d'ecriture:"+e.getMessage());
		}
		                          	
	}
	
	
	//*****crud*****//
	
	public void save(Patient p) {
		liste.add(p);
		sauvgarder();	
	}
	
	public Patient findByCin(int cin) {
		for(int i=0;i<liste.size();i++) {
			Patient p=(Patient) liste.get(i);
			if(p.getCIN_Matricule()==cin) {
				return p;
			}
		}
		return null;
	}
	
	public ArrayList findAll() {
		return liste;
	}
		
	public void update(Patient P) {
		for(int i=0;i<liste.size();i++) {
			Patient p=(Patient) liste.get(i);
			if(p.getCIN_Matricule()==P.getCIN_Matricule()) {
				liste.set(i, p);
				sauvgarder();
				
			}
			
		}	
	}
	
	
	public void delete(int cin) {
		for(int i=0;i<liste.size();i++) {
			Patient p=(Patient) liste.get(i);
			if(p.getCIN_Matricule()==cin) {
				liste.remove(i);
				sauvgarder();
				
	        }
		
		}
	}
	
	}






        