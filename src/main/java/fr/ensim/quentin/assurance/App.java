package fr.ensim.quentin.assurance;

import java.util.Date;
import java.util.GregorianCalendar;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Personne Quentin = new Personne("Quentin", "Brossier", new GregorianCalendar(1996, 10, 14));
        Personne Antoine = new Personne("Antoine", "Colin", new GregorianCalendar(1996, 5, 27));
        Personne Hugo = new Personne("Hugo", "Sergent", new GregorianCalendar(1995, 12, 1));
        Personne Kilian = new Personne("Kilian", "Sanchez", new GregorianCalendar(1997, 3, 6));
        Personne Marine = new Personne("Marine", "Bouvet", new GregorianCalendar(1995, 8, 21));
       
        CompagineAssurance compa = new CompagineAssurance("2LB2G");
        
        System.out.println("La compagnie d'assurance " + compa + " a actuellement " 
        		+ compa.obtenirNombreDeClients() + " clients, dont " 
        		+ compa.obtenirNombreDeContrats() + " contrats valides, ainsi que " 
        		+ compa.obtenirNombreDeProspects() + " clients en prospection.");
        
        compa.AjouterUnePersonne(Quentin);
        compa.AjouterUnePersonne(Antoine);
        compa.AjouterUnePersonne(Hugo);
        compa.AjouterUnePersonne(Kilian);
        compa.AjouterUnePersonne(Marine);
        
        System.out.println("La compagnie d'assurance " + compa + " a actuellement " 
        		+ compa.obtenirNombreDeClients() + " clients, dont " 
        		+ compa.obtenirNombreDeContrats() + " contrats valides, ainsi que " 
        		+ compa.obtenirNombreDeProspects() + " clients en prospection.");

        Quentin.creerContrat(TypeContrat.Auto);
        Quentin.creerContrat(TypeContrat.MRH);
        Antoine.creerContrat(TypeContrat.Prevoyance);
        Marine.creerContrat(TypeContrat.Auto);
      
        System.out.println("La compagnie d'assurance " + compa + " a actuellement " 
        		+ compa.obtenirNombreDeClients() + " clients, dont " 
        		+ compa.obtenirNombreDeContrats() + " contrats valides, ainsi que " 
        		+ compa.obtenirNombreDeProspects() + " clients en prospection.");
        
        System.out.println( "See you soon!" );
    }
}
