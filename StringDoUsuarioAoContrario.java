package lista12;

import java.util.Scanner;

public class StringDoUsuarioAoContrario {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner (System.in);
	
		System.out.println("Digite Uma Frase: ");
		String StringInserida = sc.nextLine();
		
		String StringReverso = "";
		
		for(int contagem = StringInserida.length() - 1;contagem >= 0;contagem--) {
			StringReverso += StringInserida.charAt(contagem);
			
		}
		
		System.out.println("Frase Inserida Invertida: "+StringReverso);
		
		sc.close();
	}
	
}
