package lista12;

import java.util.Scanner;
import java.lang.Math;

public class Ex7NumerosPrimos {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numeros Primos: ");
		System.out.println("Digite o Inicio do Valor: ");
		int valorInicio = sc.nextInt();
		System.out.println("Digite O Final Do Valor: ");
		int valorFinal = sc.nextInt();
		
		
		for(int numero = valorInicio;numero <= valorFinal;numero++) {
			
			if(primo(numero)) {
				System.out.println(numero + " ");
			}
	}
		sc.close();
}
	public static boolean primo(int numero){
		if (numero <= 1) {
			return false;
		}
		for(int contagem = 2; contagem <= Math.sqrt(numero);contagem++) {
			if(numero % contagem == 0) {
				return false;
			} 
		}
		return true;
		
	}
	
	
	
}
