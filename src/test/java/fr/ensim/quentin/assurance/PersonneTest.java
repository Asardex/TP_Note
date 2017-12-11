package fr.ensim.quentin.assurance;

import static org.junit.Assert.*;

import java.util.GregorianCalendar;

import org.junit.Test;

public class PersonneTest {

	@Test
	public void testPersonne() {
		Personne p = new Personne("Quentin", "Brossier", new GregorianCalendar());
		assertNotNull(p);
	}
	
	
	@Test
	public void testObtenirContrats() {
		Personne p = new Personne("Quentin", "Brossier", new GregorianCalendar());
		p.creerContrat(TypeContrat.Auto);
		assertNotNull(p.obtenirContrats().get(0));
	}
	
	@Test
	public void testObtenirContratsAuto() {
		Personne p = new Personne("Quentin", "Brossier", new GregorianCalendar());
		p.creerContrat(TypeContrat.Auto);
		assertNotNull(p.obtenirContratsAuto().get(0));
	}
	
	@Test
	public void testCreerContrat() {
		Personne p = new Personne("Quentin", "Brossier", new GregorianCalendar());
		p.creerContrat(TypeContrat.Auto);
		assertEquals(1, p.obtenirContrats().size());
	}





}
