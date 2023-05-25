package Modulo03;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos itens adicionar ao carrinho? ");
		int quantidade = sc.nextInt();

		String[] listaCompras = new String[quantidade];

		// inserir dados no vetor
		for (int i = 0; i < listaCompras.length; i++) {
			System.out.print("item: ");
			listaCompras[i] = sc.next();
		}

		// imprimindo dados do vetor
		System.out.println("\nItems adicionados:");
		for (int i = 0; i < listaCompras.length; i++) {
			System.out.printf("%d - %s\n", (i + 1), listaCompras[i]);
		}

		sc.close();
	}

}
