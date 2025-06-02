package lista12;

import java.util.Scanner;

public class NumerosTriangulares {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a Quantidade de N");
		int n = sc.nextInt();
		
		if(n == 0) {
			System.out.println("Digite um Numero Positivo para N!");
		}
		
		else {
			
			System.out.println("Os Primeros " + n + " Termos São:");
			for(int contagem = 1; contagem <= n; contagem++) {
				int numerosTriangulares = contagem * (contagem + 1) / 2;
				System.out.println(numerosTriangulares + " ");
			}
			
			
		}
		
		sc.close();
		
	}
	
}
