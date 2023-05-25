package Modulo04;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// 4 - Crie um método estático que receba uma string como parâmetro e retorne
		// verdadeiro se a string contiver apenas caracteres alfabéticos, caso
		// contrário, retorne falso.
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Numero para verificar se é primo: ");
		String texto = sc.next();
				
		if (verificarCaracteres(texto)) {
			System.out.println("O valor possui apenas caracteres alfabéticos!");
		}else {
			System.out.println("O valor NÃO tem caracteres alfabéticos!");
		}
		sc.close();
	}	
	
	public static Boolean verificarCaracteres(String mensagem) {
		if (mensagem.matches("[a-zA-Z]+") ) {
			return true;
		}
		
		return false;
	}

}
