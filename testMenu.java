package menu;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class testMenu {
	
	/**
     * Programme principal
     * @param args argument non utilis�
     */
    public static void main(String[] args) {
    	
    	Scanner entree = new Scanner (System.in);
    			
    	File file = new File("Menu.txt");
    	String nouvelle_entree;
    	String reponse = "O";
    	boolean continuer = true;
    	int e = 1;
        System.out.println(file.getAbsolutePath());
        
        System.out.println("Bonjour, nous allons cr�er un menu." + "\n" + "Commen�ons par les entr�es : ");
        
        Menu.ecrire("Menu.txt", "Entr�es : ");
        while(continuer) {
			System.out.println("Entr�e " + e);
        	nouvelle_entree = entree.nextLine();
        	e++;
            
            Menu.ecrire("Menu.txt", nouvelle_entree);
            System.out.println("Continuer sur les entr�es ? (O/N)");
            reponse = entree.nextLine();
            if(!reponse.equalsIgnoreCase("O")) {
            	 Menu.ecrire("Menu.txt", "\n");
            	 continuer = false;
            }
        }
        
        System.out.println("Passons aux plats : ");
        Menu.ecrire("Menu.txt", "Plats : ");
        int p = 1;
        continuer = true;
        while(continuer) {
			System.out.println("Plat " + p);
        	nouvelle_entree = entree.nextLine();
        	p++;
            
            Menu.ecrire("Menu.txt", nouvelle_entree);
            
            System.out.println("Continuer sur les plats ? (O/N)");
            reponse = entree.nextLine();
            if(reponse.equalsIgnoreCase("O")) {
            	
            } else if(reponse.equalsIgnoreCase("N")) {
            	Menu.ecrire("Menu.txt", "\n");
            	continuer = false;
            } else {
            	System.out.println("Nous n'avons pas compris la r�ponse.");
            	break;
            }
        }
                
        System.out.println("Passons aux desserts : ");
        Menu.ecrire("Menu.txt", "Plats : ");
        int d = 1;
        continuer = true;
        while(continuer) {
			System.out.println("Dessert " + d);
        	nouvelle_entree = entree.nextLine();
        	p++;
            
            Menu.ecrire("Menu.txt", nouvelle_entree);
            
            System.out.println("Continuer sur les desserts ? (O/N)");
            reponse = entree.nextLine();
            if(reponse.equalsIgnoreCase("O")) {
            	
            } else if(reponse.equalsIgnoreCase("N")) {
            	Menu.ecrire("Menu.txt", "\n");
            	continuer = false;
            } else {
            	System.out.println("Nous n'avons pas compris la r�ponse.");
            	break;
            }
        }
        
        System.out.println("Voil� le menu que vous avez saisi : ");
        Menu.lecture("Menu.txt");
        
        
    }   	

}
