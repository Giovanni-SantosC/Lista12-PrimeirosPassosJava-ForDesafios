package lista12;

import java.util.Scanner;

public class Ex10ContagemDigitosZeros {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Contagem De Digito Zero:");
		System.out.println("Digite o Seu Valor Inteiro: ");
		int numero = sc.nextInt();
		
		int contagemDigitosZeros = 0;
	
		for(int i = 0; numero > 0 ;i++) {
			
			
		if(numero % 10 == 0) {	
				contagemDigitosZeros++;
			    numero = numero / 10;
		    }
		
		else {
			numero = numero / 10;
		}
		}
		System.out.println(contagemDigitosZeros);
		sc.close();
	   }
	
	}
