package removerVogais;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class removerVogaisPalavra {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Digite a palavra: ");
		StringBuilder sb = new StringBuilder(reader.readLine());
		
		for(int i = 0; i < sb.length(); i++) {
			
			if(sb.charAt(i) == 'a' || sb.charAt(i) == 'e' || sb.charAt(i) == 'i' || sb.charAt(i) == 'o' || sb.charAt(i) == 'u') {
				sb.deleteCharAt(i);
			}
		}
		
		System.out.println("\nPalavra depois de deletar vogais: \n" + sb.toString());
	}
}
