package fr.ensim.quentin.assurance;

import java.util.List;

public abstract class Contrat {
	protected static int nbContrat = 0;
	protected String numeroContrat;
	protected boolean contratValide;
	
	public abstract Contrat creationContrat();
	public abstract List<String> determinerGaranties();
	public abstract double determinerCotisation();	
	public abstract String toString();
}
