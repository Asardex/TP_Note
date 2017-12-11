package fr.ensim.quentin.assurance;

import static org.junit.Assert.*;

import java.util.GregorianCalendar;

import org.junit.Test;

public class CompagineAssuranceTest {

	@Test
	public void testCompagineAssurance() {
		CompagineAssurance compa = new CompagineAssurance("2LB2G");
		assertNotNull(compa);
	}

	@Test
	public void testAjouterUnePersonne() {
		CompagineAssurance compa = new CompagineAssurance("2LB2G");
		Personne p = new Personne("Quentin", "Brossier", new GregorianCalendar());
		compa.AjouterUnePersonne(p);
		assertNotNull(compa.GetPersonne(0));
	}
	
	@Test
	public void testObtenirNombreDeClients() {
		CompagineAssurance compa = new CompagineAssurance("2LB2G");
		Personne p = new Personne("Quentin", "Brossier", new GregorianCalendar());
		compa.AjouterUnePersonne(p);
		p.creerContrat(TypeContrat.Auto);
		assertEquals(1, compa.obtenirNombreDeClients());
	}

	@Test
	public void testObtenirNombreDeProspects() {
		CompagineAssurance compa = new CompagineAssurance("2LB2G");
		Personne p1 = new Personne("Quentin", "Brossier", new GregorianCalendar());
		Personne p2 = new Personne("Lea", "Brossier", new GregorianCalendar());
		Personne p3 = new Personne("Tommy", "Brossier", new GregorianCalendar());
		compa.AjouterUnePersonne(p1);
		compa.AjouterUnePersonne(p2);
		compa.AjouterUnePersonne(p3);
		p1.creerContrat(TypeContrat.Auto);
		assertEquals(2, compa.obtenirNombreDeProspects());
	}


}
