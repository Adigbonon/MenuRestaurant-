package menu;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Menu {
	
	private static Scanner entree = new Scanner(System.in);   

	public static void lecture(String nomFichier) {
		String ligne;
		int indice = 0;
		
		try {
			//déclaration et création de l'objet fichier
			FileReader reader = new FileReader(nomFichier);
			BufferedReader buffer = new BufferedReader(reader);
			
			boolean read = true;
			
			do {
				indice ++;
				ligne = buffer.readLine();
				if(ligne == null) {
					read = false;
	            }
				System.out.print(indice +" - " + ligne + "\n");
				
			} while(read);
			
			buffer.close();
			
		} catch(IOException ex) {
			System.out.println("Fichier introuvable");;
		}
	}
	
	public static void ecrire(String fichierDest, String ligne_a_ecrire) {
		String ligne;
		try {
			//déclaration et création des objets
			System.out.println(ligne_a_ecrire);
			String newLine = System.lineSeparator() + ligne_a_ecrire;
			System.out.println(newLine);
			/*FileWriter writer = new FileWriter(fichierDest);
			
			ligne = new BufferedReader(new FileReader(fichierDest)).readLine();
			if(ligne != null) {
				writer.write(newLine);
			}*/
			//déclaration et création des objets
			PrintWriter writer = new PrintWriter(new FileWriter(fichierDest));
			writer.println(newLine);
			
			writer.close();
			
		} catch(IOException ex) {
			System.out.println("Fichier introuvable");
		}
	}
	
	

}
