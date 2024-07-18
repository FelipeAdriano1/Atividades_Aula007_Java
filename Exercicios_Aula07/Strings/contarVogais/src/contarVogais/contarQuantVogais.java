package contarVogais;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class contarQuantVogais {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String palavra;
		int numVogais = 0;
		
		System.out.println("Digite uma palavra: ");
		palavra = reader.readLine();
		reader.close();
		
		palavra = palavra.toLowerCase();
		
		for (int i = 0; i < palavra.length(); i++) {
			
			if(palavra.charAt(i) == 'a' || palavra.charAt(i) == 'e' || palavra.charAt(i) == 'i' || palavra.charAt(i) == 'o' || palavra.charAt(i) == 'u') {
				numVogais++;
				
				System.out.println("\nNúmero de vogais: " 
				+ numVogais + "\nVogal: " + palavra.charAt(i) + "\nPosição da vogal: " + i);
			}
		}
	}
}
