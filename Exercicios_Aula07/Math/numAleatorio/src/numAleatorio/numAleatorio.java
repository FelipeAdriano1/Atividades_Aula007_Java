package numAleatorio;
import java.util.Random;

public class numAleatorio {

	public static void main(String[] args) {
		
		Random numAleatorio = new Random();
		
		System.out.println("Número aleatório de 1 a 100: " + numAleatorio.nextInt(100));
	}
}
