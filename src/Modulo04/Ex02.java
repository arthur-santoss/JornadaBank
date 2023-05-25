package Modulo04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 2 - Crie um método estático que receba um array de números inteiros como
		// parâmetro e retorne a média aritmética dos valores no array.
		Scanner sc = new Scanner(System.in);

		imprimir("informe o tamanho do vetor: ");
		int tamanhoVetor = sc.nextInt();
		
		int[] array = new int [tamanhoVetor];
		
		//inserir valores no vetor
		for (int i = 0; i < array.length; i++) {
			imprimir("informe o valor do índice " + i + ": ");
			array[i] = sc.nextInt();
		}

		// imprimir valores no vetor
		for (int i = 0; i < array.length; i++) {
			imprimir(array[i] + " ");
		}

		imprimir("\nmedia: " + mediaAritimetica(array));

		sc.close();
	}

	//realização da média aritimética
	private static int mediaAritimetica(int[] array) {
		int soma = 0;
		// somar todos valores
		for (int i = 0; i < array.length; i++) {
			soma += array[i];
		}
		int media = soma / array.length;

		return media;
	}
	
	//uso comum para imprimir
	public static void imprimir(String texto) {
		System.out.print(texto);
	}

}
