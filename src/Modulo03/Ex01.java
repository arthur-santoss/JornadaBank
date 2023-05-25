package Modulo03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("informe o tamanho do vetor: ");
		int tamanhoVetor = sc.nextInt();

		String[] paises = new String[tamanhoVetor];

		// inserir dados no vetor
		for (int i = 0; i < paises.length; i++) {
			System.out.printf("Escolha um pais na posição %d: ", i);
			paises[i] = sc.next();
		}
		System.out.println();

		// imprimindo valores do vetor
		for (int i = 0; i < paises.length; i++) {
			System.out.println(paises[i]);
		}

		sc.close();
	}

}
