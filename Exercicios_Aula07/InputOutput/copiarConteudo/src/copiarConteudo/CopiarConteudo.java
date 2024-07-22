package copiarConteudo;

import java.io.*;

public class CopiarConteudo {

	public static void main(String[] args) {
		
		try {
			String caminho;
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Digite o caminho do arquivo a ser lido: ");
			caminho = reader.readLine();
			
			BufferedReader ler = new BufferedReader(new FileReader(caminho));
			BufferedWriter escrever = new BufferedWriter(new FileWriter("Copiado.txt"));
			String texto;
			
			while((texto = ler.readLine()) != null) {
				
				System.out.println("Linha: " + texto);
				escrever.write(texto);
				escrever.newLine();
			}
			ler.close();
			escrever.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
