package WrapperClasses;

public class StringToInt {

	public static void main(String[] args) {
		
		String[] valores = new String[5];
		
		valores[0] = "10";
		valores[1] = "45";
		valores[2] = "12";
		valores[3] = "87";
		valores[4] = "23";
		
		Integer[] valoresInt = new Integer[valores.length];
		
		for(int i = 0; i < valoresInt.length; i++) {
			
			valoresInt[i] = Integer.parseInt(valores[i]);
		}
		
		System.out.println("Imprimindo valores do vetor após a conversão de String > Integer.\n");
		for(int i = 0; i < valoresInt.length; i++) {
			
			System.out.println(valoresInt[i]);
		}
	}
}
