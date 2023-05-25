package Modulo02;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Calcular qual numero será menor!");
		System.out.println("Informe o 1º número");
		int n1 = ler.nextInt();

		System.out.println("Informe o 2º número");
		int n2 = ler.nextInt();

		System.out.println("Informe o 3º número");
		int n3 = ler.nextInt();

		if (n1 < n2 && n1 < n3) {
			System.out.println("\n1º valor menor!");
		} else if (n2 < n1 && n2 < n3) {
			System.out.println("\n2º valor menor!");
		} else {
			System.out.println("\n3º valor menor!");
		}

		ler.close();
	}

}
