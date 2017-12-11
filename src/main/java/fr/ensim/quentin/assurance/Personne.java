package fr.ensim.quentin.assurance;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Personne {
	private boolean estUnClient;
	private String nom;
	private String prenom;
	private GregorianCalendar dateDeNaissance;
	private List<Personne> membreFamille = new ArrayList<Personne>();
	private List<Contrat> contrats = new ArrayList<Contrat>();
	
	Personne(String prenom, String nom, GregorianCalendar dateDeNaissance) {
		estUnClient = false;
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.membreFamille.clear();
		this.contrats.clear();
	}
	
	public boolean estClient() {
		return estUnClient;
	}
	
	public String obtenirNomComplet() {
		return prenom + " " + nom;
	}
	
	public GregorianCalendar obtenirDateDeNaissance() {
		return dateDeNaissance;
	}
	
	public Contrat creerContrat(TypeContrat typeContrat) {
		Contrat contrat;
		switch(typeContrat) {
		case Auto:
			contrat = new ContratAuto();
			contrats.add(contrat.creationContrat());
			estUnClient = true;
			break;
		case Prevoyance:
			contrat = new ContratPrevoyance();
			contrats.add(contrat.creationContrat());
			estUnClient = true;
			break;
		case MRH:
			contrat = new ContratMRH();
			contrats.add(contrat.creationContrat());
			estUnClient = true;
			break;
		default:
			contrat = null;
			break;
		}
		return contrat;
	}
	
	public void resilierContrat(Contrat contrat) {
		return;
	}
	
	public void resilierContrat(String str) {
		return;
	}
	
	public List<Contrat> obtenirContrats() {
		return contrats;
	}
	
	public List<Contrat> obtenirContratsAuto() {
		List<Contrat> contratAutos = new ArrayList<Contrat>();
		for(Contrat c : this.contrats) {
			if(c.numeroContrat.contains("Auto") && c.contratValide)
				contratAutos.add(c);
		}
		return contratAutos;
	}
	
	public List<Contrat> obtenirContratsMRH() {
		List<Contrat> contratMRH = new ArrayList<Contrat>();
		for(Contrat c : this.contrats) {
			if(c.numeroContrat.contains("MRH") && c.contratValide)
				contratMRH.add(c);
		}
		return contratMRH;
	}
	
	public String toString() {
		return obtenirNomComplet() + " né(e) le " + dateDeNaissance + (estClient() ? " est un client." : " n'est pas un client.");
	}
}
