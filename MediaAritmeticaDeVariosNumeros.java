package lista12;

import java.util.Scanner;

public class MediaAritmeticaDeVariosNumeros {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		double soma  = 0;
		int contador = 0;
		double numero = 0;
		boolean continuar = true;
		
		System.out.println("Digite Numeros para calcular a média(Digite um Número Negativo para Parar):");
		
		for(;continuar;) {
			System.out.println("Digite um Número: ");
			numero = sc.nextDouble();
			
			if(numero < 0) {
				continuar = false;
				break;
			}
			else {
				soma +=numero;
				contador++;
			}
			
		}
		
		if(contador > 0) {
			double media = soma / contador;
			System.out.println("A Média dos Números Positivos é: "+ media);
		}
		else {
			System.out.println("Nenhum Número Positivo foi Digitado.");
		}
		
		sc.close();
 	}
	
	
}
