package lerArquivo;

import java.io.*;

public class LerArquivo {

	public static void main(String[] args) throws IOException {
		
		BufferedWriter escrever = new BufferedWriter(new FileWriter("exemplo.txt"));
		escrever.write("Olá, estou escrevendo neste arquivo txt através de Java.");
		escrever.newLine();
		escrever.write("Esta é uma nova linha escrita através de Java.");
		escrever.close();
		
		BufferedReader ler = new BufferedReader(new FileReader("exemplo.txt"));
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String linha;
		String texto;
		
		while((linha = ler.readLine()) != null) {
			System.out.println(linha);
		}
		ler.close();
	}
}
