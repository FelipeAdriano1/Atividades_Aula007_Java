package inserirString;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class inserirString {

	public static void main(String[] args) throws IOException{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Digite a primeira palavra: ");
		StringBuilder sb = new StringBuilder(reader.readLine());
		
		System.out.println("\nConjunto de palavras: " + sb.toString());
		System.out.println("\nInserindo a palavra poste depois de " + sb.toString() + "...");
		
		sb.insert(8, " poste");
		
		System.out.println("\nConjunto de palavras: " + sb.toString());
		System.out.println("\nInserindo a palavra janela depois de cachorro e antes de poste...");
		
		sb.insert(8, " janela");
		
		System.out.println("\nConjunto de palavras: " + sb.toString());
	}
}
