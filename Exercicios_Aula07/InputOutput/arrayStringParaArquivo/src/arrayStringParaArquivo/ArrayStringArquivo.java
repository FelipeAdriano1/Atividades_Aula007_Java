package arrayStringParaArquivo;

import java.io.*;

public class ArrayStringArquivo {

	public static void main(String[] args) throws IOException {
		
		String texto = "No auge do sol, o verão se desvela, Um abraço ardente da estação mais bela. Os dias se alongam, preguiçosos e quentes, E o mundo se veste de cores reluzentes.";
		System.out.println("Texto: " + texto + "\n");
		texto = texto.toLowerCase();
		texto = texto.replace(",", "");
		texto = texto.replace(".", "");
		
		String[] novoTexto = texto.split(" ");
		
		BufferedWriter escrever = new BufferedWriter(new FileWriter("StringToTXT.txt"));
		
		System.out.println("Escrevendo o texto separado por palavras no arquivo...");
		
		for(int i = 0; i < novoTexto.length; i++) {
			
			escrever.write(novoTexto[i]);
			escrever.newLine();
		}
		escrever.close();
	}
}
