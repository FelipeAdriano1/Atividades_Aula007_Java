package StringBuilder;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArrayToString {

	public static void main(String[] args) {
		
		String[] palavras = new String[3];
		
		palavras[0] = "cachorro";
		palavras[1] = "janela";
		palavras[2] = "poste";
		
		System.out.println("Concatenando palavras do vetor...\n");
		
		for(int i = 0; i < palavras.length; i++) {
			StringBuilder sb = new StringBuilder(palavras[i]);
			
			System.out.print(sb.toString());
		}
		
		System.out.println("\n\nPalavras concatenadas !");
	}
}
