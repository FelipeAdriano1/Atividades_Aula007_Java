package localizaCaracter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class localizarChar {

	public static void main(String[] args) throws IOException{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String palavra;
		char buscar;
		
		System.out.println("Digite uma palavra: ");
		palavra = reader.readLine();
		
		palavra = palavra.toLowerCase();
		
		System.out.println("Digite a letra a ser buscada: ");
		buscar = (char) reader.read();
		reader.close();
		
		for (int i = 0; i < palavra.length(); i++) {
			
			if(palavra.charAt(i) == buscar) {
				
				System.out.println("\nPrimeira ocorrência do caracter (" + buscar + 
						") foi encontrado na posição " + i + " da palavra (" + palavra + ").");
				break;
			}
		}
	}
}
