package contato;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Contato {

	public static void main(String[] args) throws IOException{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		HashMap hm = new HashMap();
		String nome;
		long telefone;
		
		System.out.println("Digite o nome do contato (chave): ");
		nome = reader.readLine();
		
		System.out.println("\nDigite o telefone do contato (valor): ");
		telefone = Integer.parseInt(reader.readLine());
		
		hm.put(nome, telefone);
		
		System.out.println("\nDigite o nome do contato que deseja encontrar: ");
		nome = reader.readLine();
		
		for(int i = 0; i < hm.size(); i++) {
			if(hm.containsKey(nome)) {
				System.out.println("\nContato encontrado. \nTelefone: (" + hm.get(nome) + ")");
			}
		}
	}
}
