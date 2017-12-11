package fr.ensim.quentin.assurance;

import java.util.ArrayList;
import java.util.List;

public class ContratPrevoyance extends Contrat {

	ContratPrevoyance() {
		contratValide = false;
	}
	
	@Override
	public Contrat creationContrat() {
		nbContrat++;
		this.numeroContrat = "Prev-" + nbContrat;
		this.contratValide = true;
		return this;
	}

	@Override
	public List<String> determinerGaranties() {
		List<String> garanties = new ArrayList<String>();
		garanties.add(new String("Accidents de la vie"));
		garanties.add("Maladie");
		garanties.add("Mutuelle");
		return garanties;
	}

	@Override
	public double determinerCotisation() {
		return 75.0;
	}

	@Override
	public String toString() {
		return "Contrat Prevoyance";
	}

}
