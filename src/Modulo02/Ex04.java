package Modulo02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Qual seu nome? ");
		String nome = ler.nextLine();

		System.out.print("Qual sua idade? ");
		int idade = ler.nextInt();
        ler.nextLine();

		System.out.print("Qual sua cidade? ");
		String cidade = ler.nextLine();

		System.out.print("Qual seu estado? ");
		String estado = ler.nextLine();

		System.out.printf("Olá seu nome é %s, você têm %d anos, é da cidade de %s, situada no estado de %s", 
				nome, idade, cidade, estado);

		ler.close();
	}

}
