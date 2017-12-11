package fr.ensim.quentin.assurance;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Personne {
	private boolean estUnClient;
	private String nom;
	private String prenom;
	private Date dateDeNaissance;
	private List<Personne> membreFamille = new ArrayList<Personne>();
	private List<Contrat> contrats = new ArrayList<Contrat>();
	
	Personne(String prenom, String nom, Date dateDeNaissance) {
		estUnClient = false;
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.membreFamille.clear();
		this.contrats.clear();
	}
	
	Personne(String prenom, String nom, Date dateDeNaissance, List<Personne> membreFamille) {
		estUnClient = false;
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.membreFamille.clear();
		this.contrats.clear();
		for(Personne p : membreFamille)
			this.membreFamille.add(p);
	}
	
	public boolean estClient() {
		return estUnClient;
	}
	
	public String obtenirNomComplet() {
		return prenom + " " + nom;
	}
	
	public Date obtenirDateDeNaissance() {
		return dateDeNaissance;
	}
	
	public Contrat creerContrat(TypeContrat typeContrat) {
		Contrat contrat;
		switch(typeContrat) {
		case Auto:
			contrat = new ContratAuto();
			break;
		case Prevoyance:
			contrat = new ContratPrevoyance();
			break;
		case MRH:
			contrat = new ContratMRH();
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
