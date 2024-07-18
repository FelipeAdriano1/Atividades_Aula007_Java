package maiorValor;
import java.util.Random;

public class MaiorValor {

	public static void main(String[] args) {
		
		int[] numeros = new int[5];
		Random aleatorio = new Random();
		
		System.out.println("Lotando o vetor com valores aleatórios...");
		for(int i = 0; i < numeros.length; i++) {
			
			numeros[i] = aleatorio.nextInt(100);
		}
		
		System.out.println("\nVetor de inteiro com valores aleatórios: \n");
		for(int i = 0; i < numeros.length; i++) {
			
			System.out.println(numeros[i]);
		}
		
		int auxiliar = 0;
		int maiorValor = 0;
		
		for(int i = 0; i < numeros.length; i++) {
			auxiliar = numeros[i];
			
			if (auxiliar > maiorValor) {
				maiorValor = auxiliar;
			}
		}
		
		System.out.println("\nMaior valor: " + maiorValor);
	}
}
