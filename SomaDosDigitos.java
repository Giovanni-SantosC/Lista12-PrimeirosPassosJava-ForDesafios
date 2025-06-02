package lista12;

import java.util.Scanner;

public class SomaDosDigitos {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os Digitos Para Ser Somado:");
		int numero = sc.nextInt();
		
		int soma = 0;
		int numeroOriginal = numero;
		
		if(numero < 0) {
			numero  = -numero;
		}
		else if(numero == 0) {
			soma = 0;
		}
		
		String DigitoNumero = String.valueOf(numero);
		
		for(int contagem = 0; contagem < DigitoNumero.length();contagem++) {
		
			int digito = Character.getNumericValue(DigitoNumero.charAt(contagem));
			soma += digito;
		}
		
		System.out.println("A Soma Dos Digitos de " + numeroOriginal + " é " + soma);
		
		sc.close();
	}
	
}
