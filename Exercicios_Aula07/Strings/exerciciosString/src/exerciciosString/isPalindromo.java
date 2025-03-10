package exerciciosString;

import java.util.Arrays;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class isPalindromo {
	public static void main(String[] args) throws IOException {
        
		String s;
		String auxiliar;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Insira uma palavra: ");
		s = reader.readLine();
		reader.close();
		
		s = s.toLowerCase();
		
	    StringBuilder sb = new StringBuilder(s);
	    sb.reverse();
	    
	    auxiliar = sb.toString();
	    
	    if(auxiliar.equals(s)) {
	    	System.out.println("\nA palavra é um palíndromo.");
	    }
	    else {
	    	System.out.println("\nA palavra não é um palíndromo.");
	    }
    }
}
