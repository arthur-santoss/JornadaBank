package Modulo02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Informe um valor:");
		int valor = ler.nextInt();

		if (valor % 2 == 0) {
			System.out.printf("O valor %d é PAR", valor);
		} else {
			System.out.printf("O valor %d é ÍMPAR", valor);
		}

		ler.close();

	}

}
