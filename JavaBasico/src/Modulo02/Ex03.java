package Modulo02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Insira um número de 1 à 7: ");
		int dia = ler.nextInt();

		switch (dia) {
		case 1:
			System.out.println("Você escolheu Domingo!");
			break;

		case 2:
			System.out.println("Você escolheu Segunda!");
			break;

		case 3:
			System.out.println("Você escolheu Terça!");
			break;

		case 4:
			System.out.println("Você escolheu Quarta!");
			break;

		case 5:
			System.out.println("Você escolheu Quinta!");
			break;

		case 6:
			System.out.println("Você escolheu Sexta!");
			break;

		case 7:
			System.out.println("Você escolheu Sábado!");
			break;

		default:
			System.out.println("Valor inválido!");
			break;
		}
		ler.close();
	}

}
