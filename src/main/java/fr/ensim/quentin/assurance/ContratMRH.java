package fr.ensim.quentin.assurance;

import java.util.ArrayList;
import java.util.List;

public class ContratMRH extends Contrat {

	ContratMRH() {
		contratValide = false;
	}
	
	@Override
	public Contrat creationContrat() {
		nbContrat++;
		this.numeroContrat = "MRH-" + nbContrat;
		this.contratValide = true;
		return this;
	}

	@Override
	public List<String> determinerGaranties() {
		List<String> garanties = new ArrayList<String>();
		garanties.add(new String("Incendies"));
		garanties.add("Vitres");
		garanties.add("Inondation");
		garanties.add("Responsabilité Civile");
		return garanties;
	}

	@Override
	public double determinerCotisation() {
		return 100.0;
	}

	@Override
	public String toString() {
		return "Contrat MRH";
	}

}
