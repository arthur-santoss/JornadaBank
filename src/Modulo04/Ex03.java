package Modulo04;

import java.util.Scanner;

//3 - Crie um método estático que receba um número inteiro como parâmetro e retorne
//verdadeiro se o número for um número primo, caso contrário, retorne falso.

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Numero para verificar se é primo: ");
		int numero = sc.nextInt();
		System.out.println(ePrimo(numero));
	}
	
	//numeros primos são >1 e tem apenas dois divisores, 1 e o próprio número
	public static boolean ePrimo(int numero) {
		if (numero <= 1) {//verificar se o numero é menor ou igual a 1, se sim, não é primo
			return false;
		}
		//verifica se o intervalo do numero até a raiz quadrada dele se há algum outro divisível
		for (int i = 2; i <= Math.sqrt(numero); i++) {
			if (numero % i == 0) {
				return false;//se for divisivel, é falso
			}
		}
		return true; //se não encontrar nenhum divisor então é primo
	}

}
