package produtos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Produtos {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		HashMap hm = new HashMap();
		String chave;
		String valor;
		
		System.out.println("Digite o nome do produto (chave): ");
		chave = reader.readLine();
		
		System.out.println("Digite a descrição do produto (valor): ");
		valor = reader.readLine();
		
		hm.put(chave, valor);
		
		System.out.println("Produto (" + hm.get(chave) + ") adicionado com sucesso.");
		
		System.out.println("\nDigite a chave do produto que deseja buscar: ");
		chave = reader.readLine();
		
		System.out.println("\nProduto (" + hm.get(chave) +") encontrado com sucesso.");
		
		System.out.println("\nDigite a chave do produto que deseja remover: ");
		chave = reader.readLine();
		
		hm.remove(chave);
		
		System.out.println("Produto (" + chave + ") removido com sucesso.");
		
		reader.close();
		
	}
}
