package somaMediaVetor;
import java.util.Random;

public class somaMediaVetor {

	public static void main(String[] args) {
		
		Random numeros = new Random();
		int soma = 0;
		Integer media;
		
		Integer[] nums = new Integer[10];
		
		System.out.println("Valores do vetor: ");
		for(int i = 0; i < nums.length; i++) {
			
			nums[i] = numeros.nextInt(1000);
			System.out.println(nums[i]);
		}
		
		for(int i = 0; i < nums.length; i++) {
			
			soma += nums[i];
		}
		
		System.out.println("\nSoma dos valores do vetor: " + soma);
		
		media = soma / nums.length;
		System.out.println("\nMédia dos valores do vetor: " + media);
	}
}
