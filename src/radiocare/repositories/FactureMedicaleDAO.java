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

import radiocare.entities.FactureMedicale;
import radiocare.entities.Patient;

public class FactureMedicaleDAO  {
	private static final String  fichier ="factures.json";
	private Gson gson =new GsonBuilder().setPrettyPrinting().create();
	                                     // fichier bien lisible 
	private ArrayList liste=new ArrayList();
	
	
	public FactureMedicaleDAO() {
		charger();	//lors du la construction d'un patient on charge tout les donnes dans la liste  							
	 }
	
	private void charger() {
		File f =new File(fichier);
		if(!f.exists()) {
			return;
		}
		try(Reader r= new FileReader(f)){ // reader lire la fichier Json
			FactureMedicale[] tab=gson.fromJson(r, FactureMedicale[].class);/** traduire texte (depuis le reader r ) grace a fromJson 
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
		FactureMedicale[] tab=new FactureMedicale[liste.size()];
		for(int i=0;i<tab.length;i++) {
			tab[i]=(FactureMedicale) liste.get(i);
		}
		try( Writer w=new FileWriter(fichier)){
			gson.toJson(tab,w);
		}catch(IOException e) {
			System.out.println("Erreur d'ecriture:"+e.getMessage());
		}
		                          	
	}
	//crud 
	public void save(FactureMedicale facture) {
		liste.add(facture);
		sauvgarder();	
	}
	
	public FactureMedicale findByNum(int num) {
		for(int i=0;i<liste.size();i++) {
			FactureMedicale facture=(FactureMedicale) liste.get(i);
			if(facture.getNumFacture()==num) {
				return facture;
			}
		}
		return null;
	}
	
	public ArrayList findAll() {
		return liste;
	}
		
	public void update(FactureMedicale facture) {
		for(int i=0;i<liste.size();i++) {
			FactureMedicale Facture=(FactureMedicale) liste.get(i);
			if(facture.getNumFacture()==Facture.getNumFacture()) {
				liste.set(i, Facture);
				sauvgarder();
				
			}
			
		}	
	}
	
	
	public void delete(int num) {
		for(int i=0;i<liste.size();i++) {
			FactureMedicale facture=(FactureMedicale) liste.get(i);
			if(facture.getNumFacture()==num) {
				liste.remove(i);
				sauvgarder();
				
	        }
		
		}
	}
	
	
	
}

