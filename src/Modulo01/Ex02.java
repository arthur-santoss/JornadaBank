package Modulo01;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
			System.out.println("Informe o 1º valor: ");
			int vlr1 = ler.nextInt();
	
			System.out.println("Informe o 2º valor: ");
			int vlr2 = ler.nextInt();
			
			int soma = vlr1 + vlr2;
			
			System.out.printf("Soma dos valores: %d + %d = %d", vlr1, vlr2, soma );
		
		ler.close();
	}

}
