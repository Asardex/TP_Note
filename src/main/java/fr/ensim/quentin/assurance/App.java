package fr.ensim.quentin.assurance;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println( "Hello World!" );
    	
        Scanner sc;
        String nom, prenom;
        GregorianCalendar dateNaissance = new GregorianCalendar();
        boolean continuer = true, continuer2 = true;
        Personne p;
        CompagineAssurance compa = new CompagineAssurance("2LB2G");
        
        do {
        	System.out.println("Bonjour, bienvenue chez " + compa + ". Veuillez vous inscrire dans notre liste (-1 pour arrêter) :"
        			+ "\nDonnez votre prénom :");
        	sc = new Scanner(System.in);
        	if(!sc.hasNextInt()) {
            	prenom = sc.nextLine();
            	
            	System.out.println("Bonjour " + prenom + ". Veuillez donner votre nom :");
            	sc = new Scanner(System.in);
            	nom = sc.nextLine();
            	
            	System.out.println("Vous donnerez votre date de naissance plus tard.");
            	p = new Personne(prenom, nom, dateNaissance);
            	compa.AjouterUnePersonne(p);
    			System.out.println("Creation personne");
            	
            	do {
            		System.out.println("Voulez vous souscrire à un nouveau contrat ? (-1 pour dire non)");
                	sc = new Scanner(System.in);
                	if(!sc.hasNextInt()) {
                		do {
                			System.out.println("A quel type de contrat voulez vous soucrire ? (0:auto, 1:prevoyance, 2: MRH)");
                			sc = new Scanner(System.in);
                		}while(!sc.hasNextInt());
                		switch(sc.nextInt()) {
                		case 0:
                			p.creerContrat(TypeContrat.Auto);
                			System.out.println("Creation contrat Auto");
                			break;
                		case 1:
                			p.creerContrat(TypeContrat.Prevoyance);
                			System.out.println("Creation contrat Prevoyance");
                			break;
                		case 2:
                			p.creerContrat(TypeContrat.MRH);
                			System.out.println("Creation contrat MRH");
                			break;
            			default:
            				System.out.println("Aucun contract de créé.");
            				break;
                		}
                	}else {
                		if(sc.nextInt() == -1)
                			continuer2 = false;
                	}
            	}while(continuer2);
        	}
        	else {
        		if(sc.nextInt() == -1)
        			continuer = false;
        	}
        }while(continuer);
        
        sc.close();
        
        System.out.println("La compagnie d'assurance " + compa + " a actuellement " 
        		+ compa.obtenirNombreDeClients() + " clients, dont " 
        		+ compa.obtenirNombreDeContrats() + " contrats valides, ainsi que " 
        		+ compa.obtenirNombreDeProspects() + " clients en prospection.");
        
    	System.out.println( "See you soon!" );
    	/*
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
        
        System.out.println( "See you soon!" );*/
    }
}
