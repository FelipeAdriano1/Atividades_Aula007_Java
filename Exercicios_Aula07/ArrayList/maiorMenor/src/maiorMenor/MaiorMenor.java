package maiorMenor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MaiorMenor {

	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<>();
		Random rand = new Random();
		int maior = 0;
		int menor = 100;
		
		for(int i = 0; i < 10; i++) {
			lista.add(rand.nextInt(100));
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println(lista.get(i));		
		}
		
		for(int i = 0; i < lista.size(); i++) {
			
			if(lista.get(i) > maior) {
				maior = lista.get(i);
			}
			else if(lista.get(i) < menor) {
				menor = lista.get(i);
			}
		}
		
		System.out.println("\nMaior : " + maior + "\nMenor: " + menor);
	}
}
