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
		
		for (int coluna = 0; coluna < matriz[0].length; coluna++) {
			double somaColuna = 0.0;
			
			for (int linha = 0; linha < matriz.length; linha++) {
				System.out.print(matriz[coluna][linha] + " | ");
				somaColuna += matriz[linha][coluna];
			}
			System.out.println("Soma da coluna " + coluna + ": "+ somaColuna);
		}
		
		
		sc.close();
	}

}
