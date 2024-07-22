package contarFrequencia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class ContarFrequencia {

	public static void main(String[] args) throws IOException {
		
		String textoExemplo = "Dias ensolarados, sorvetes derretendo e risadas, risadas à beira-mar.";
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		HashMap hm = new HashMap();
		String alvo;
		int quant = 0;
		
		textoExemplo = textoExemplo.toLowerCase();
		
		textoExemplo = textoExemplo.replace(".", " ");
		textoExemplo = textoExemplo.replace(",", "");
		
		String[] texto = textoExemplo.split(" ");
		
		System.out.println(textoExemplo + "\n");
		
		System.out.println("Digite a palavra que quer contar a frequência: ");
		alvo = reader.readLine();
		reader.close();
		
		for(int i = 0; i < texto.length; i++) {
			if(texto[i].contains(alvo)) {
				quant = quant + 1;
			}
		}
		
		hm.put(alvo, quant);
		
		System.out.println("\nNúmero de vezes que a palavra se repete no texto: " + hm.get(alvo));
	}
}
