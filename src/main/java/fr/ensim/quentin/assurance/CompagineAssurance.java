package fr.ensim.quentin.assurance;

import java.util.ArrayList;
import java.util.List;

public class CompagineAssurance {
	private String nom;
	private List<Personne> clients = new ArrayList<Personne>();
	
	CompagineAssurance(String nom, Personne premierClient) {
		this.nom = nom;
		this.clients.add(premierClient);
	}
	
	public int obtenirNombreDeClients() {
		int nbClients = 0;
		for(Personne p : clients) {
			if(p.estClient())
				nbClients++;
		}
		return nbClients;
	}
	
	public int obtenirNombreDeProspects() {
		return clients.size()-obtenirNombreDeClients();
	}
	
	public int obtenirNombreDeContrats() {
		int nbContratsValide = 0;
		for(Personne p : clients) {
			if(p.estClient()) {
				for(Contrat c : p.obtenirContrats()) {
					if(c.contratValide)
						nbContratsValide++;
				}
			}
		}
		return nbContratsValide;
	}
	
	public String toString() {
		return nom;
	}
	
	
}