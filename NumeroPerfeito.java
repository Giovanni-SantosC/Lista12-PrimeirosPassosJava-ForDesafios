package lista12;

import java.util.Scanner;

public class NumeroPerfeito {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Verificar se o Numero e Perfeito: ");
		System.out.println("Digite o Seu Numero: ");
		int numero = sc.nextInt();
		int acumuladora = 0;
		
		for(int contagem = 1; contagem < numero; contagem++) {
			
			if(numero % contagem == 0) {
				
			acumuladora += contagem;
				
			}
		}
		if(numero == acumuladora) {
			System.out.println("Seu Numero " + acumuladora + " é Perfeito!");
		}
		
		else {
			System.out.println("Seu Numero Inserido Não é perfeito!");
		}
		
		
		
		sc.close();
	}
	
}
