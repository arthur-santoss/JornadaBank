package Modulo03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] array = {10,20,80,40,50};
		
		int maior = 0; //inicializando uma variávei para ser referencia de maior valor a cada looping
		for (int i = 0; i < array.length; i++) {//percorre o vetor			
			if (maior < array[i]) { //verifica se o valor de int maior, é maior que o valor no índice
				maior = array[i]; //se for maior, recebe a referencia de maior
			}
		}
		System.out.printf("Maior valor: %d", maior);
		
		
		sc.close();
	}

}
