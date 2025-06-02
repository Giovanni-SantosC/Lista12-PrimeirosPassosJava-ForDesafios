package lista12;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Ex9ListaFornecidaEmOrdemInversa {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		List<String> lista = new ArrayList<>();
		
		System.out.println("Digite a Quantidade de Elementos Que Deseja Inserir Na Lista: ");
		int quantidadeDeElementos = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digite os " + quantidadeDeElementos + " Elementos da Lista: ");
		for(int i =0; i < quantidadeDeElementos; i++) {
			System.out.println("Elemento " + (i + 1) + ": ");
			String elemento = sc.nextLine();
			lista.add(elemento);
		}
		
		System.out.println("Elementos da Lista Inversa: ");
		for(int  i = lista.size() - 1; i >= 0; i-- ) {
			System.out.println(lista.get(i));
		}		
		sc.close();
	}
	
}
