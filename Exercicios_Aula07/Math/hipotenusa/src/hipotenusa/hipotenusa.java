package hipotenusa;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class hipotenusa {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int cat1;
		int cat2;
		
		System.out.println("Digite o valor do cateto 1: ");
		cat1 = Integer.parseInt(reader.readLine());
		
		
		System.out.println("Digite o valor do cateto 2: ");
		cat2 = Integer.parseInt(reader.readLine());
		reader.close();
		
		double hipo = 0.0;
		
		hipo = (cat1 * cat1) + (cat2 *cat2);
		hipo = Math.sqrt(hipo);
		
		System.out.println("\nHipotenusa do triângulo retângulo: " + hipo);
		
	}
}
