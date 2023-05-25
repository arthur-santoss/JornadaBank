package Modulo03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[][] matriz = {
	            {1.0, 1.0, 1.0},
	            {2.5, 2.5, 2.5},
	            {3.7, 3.7, 3.7}
	        };
		
		//imprimir
		
		for (int linha = 0; linha < matriz.length; linha++) {
			int somaColuna = 0;
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				System.out.print(matriz[linha][coluna] + " ");
				somaColuna += matriz[coluna][coluna];
			}
			System.out.println("Soma da coluna: " + somaColuna);
		}
		
		
		sc.close();
	}

}
