package Modulo03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        double[][] matriz = {
                {1.0, 2.5, 3.7},
                {1.0, 2.5, 3.7},
                {1.0, 2.5, 3.7}
        };

        // imprimir
        DecimalFormat df = new DecimalFormat("#.0");

        for (int coluna = 0; coluna < matriz[0].length; coluna++) {
            double somaColuna = 0.0;

            for (int linha = 0; linha < matriz.length; linha++) {
                System.out.print(df.format(matriz[linha][coluna]) + " | ");
                somaColuna += matriz[linha][coluna];
            }
            System.out.println("Soma da coluna " + coluna + ": " + df.format(somaColuna));
        }

        sc.close();
	}

}
