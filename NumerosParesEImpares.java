package lista12;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class NumerosParesEImpares {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		List<Integer> numeros = new ArrayList<>();
		int quantidadePares = 0;
		int quantidadeImpares = 0;
		
		System.out.println("Digite a quantidade de números que você deseja inserir: ");
		int quantidadeTotal = sc.nextInt();
		
		System.out.println("Digite os " + quantidadeTotal + " números:");
		
		for (int contagem = 0; contagem < quantidadeTotal; contagem++) {
			System.out.println("Número "+ (contagem + 1) + ":");
			int numero = sc.nextInt();
			numeros.add(numero);
		}
		
		for(int numero : numeros) {
			if(numero % 2 == 0) {
				quantidadePares++;
			}
			else {
				quantidadeImpares++;
			}
			
		}
		
		System.out.println("Resultados:");
		System.out.println("A Quantiade de Números Pares: "+ quantidadePares);
		System.out.println("A Quantidade de Números Impares: "+ quantidadeImpares);
		
		sc.close();
	}
	
}
