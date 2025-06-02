package lista12;

import java.util.Scanner;

public class Ex8SomaNumerosPares {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		int somaTotalNumerosPares = 0;
		
		System.out.println("Soma Dos Digitos Digitados: ");
		System.out.println("Digite o Inicio Do Intervalo:");
		int inicioIntervalo = sc.nextInt();
		System.out.println("Digite o Final do Intervalo: ");
		int finalIntervalo = sc.nextInt();
		
		for(int numero = inicioIntervalo;numero <= finalIntervalo;numero++) {
			
			if(numero % 2 == 0) {
				
				int numeroParAtual = numero;
				int somaDigitosParAtual = 0;
				
				while(numeroParAtual > 0) {
					int digito = numeroParAtual % 10;
					somaDigitosParAtual += digito;
					numeroParAtual /= 10;
				}
				somaTotalNumerosPares += somaDigitosParAtual;
			}
		}
		 
		System.out.println(somaTotalNumerosPares);
		
		System.out.println();
		sc.close();
	}
	
}
