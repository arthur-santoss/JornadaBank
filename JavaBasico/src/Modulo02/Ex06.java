package Modulo02;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Informe o horário: ");
		int hora = ler.nextInt();

		if (hora >= 0 && hora <= 6) {
			System.out.println("Boa madrugrada!");
		} else if (hora >= 7 && hora <= 11) {
			System.out.println("Bom dia!");
		} else if (hora >= 12 && hora <= 18) {
			System.out.println("Boa tarde!");
		} else if (hora >= 19 && hora <= 23) {
			System.out.println("Boa noite!");
		}
		ler.close();
	}

}
