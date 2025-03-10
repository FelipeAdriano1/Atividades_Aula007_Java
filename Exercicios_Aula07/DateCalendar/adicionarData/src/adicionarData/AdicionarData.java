package adicionarData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class AdicionarData {

	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		Calendar cal1 = Calendar.getInstance();
		Integer dia;
		
		cal1.set(Calendar.DAY_OF_MONTH, 10);
		cal1.set(Calendar.MONTH, 05);
		cal1.set(Calendar.YEAR, 2024);
		
		System.out.println("Digite o número de dias que quer adicionar a data (" + cal1.getTime() 
		+ "): ");
		
		dia = Integer.parseInt(reader.readLine());
		reader.close();
		
		cal1.add(Calendar.DAY_OF_MONTH, dia);
		
		System.out.println("\nData após a inserção de " + dia + ": " + cal1.getTime());
		
	}
}
