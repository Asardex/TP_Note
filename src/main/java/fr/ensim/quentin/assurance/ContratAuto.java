package fr.ensim.quentin.assurance;

import java.util.ArrayList;
import java.util.List;

public class ContratAuto extends Contrat {

	ContratAuto() {
		contratValide = false;
	}
	
	@Override
	public Contrat creationContrat() {
		nbContrat++;
		this.numeroContrat = "Auto-" + nbContrat;
		this.contratValide = true;
		return this;
	}

	@Override
	public List<String> determinerGaranties() {
		List<String> garanties = new ArrayList<String>();
		garanties.add(new String("Accidents"));
		garanties.add("Bris de glace");
		garanties.add("Responsabilité Civile");
		return garanties;
	}

	@Override
	public double determinerCotisation() {
		return 150.0;
	}

	@Override
	public String toString() {
		return "Contrat Auto";
	}
}
