package Modulo04;

import java.util.Scanner;

public class exemplo {

	public static void main(String[] args) {
		
		int valor1 = Integer.parseInt(entradaUsuario("Digite o valor 1"));
		int valor2 = Integer.parseInt(entradaUsuario("Digite o valor 2"));
		int soma = somar(valor1, valor2);
		
		imprimir("Resultado: " + String.valueOf(soma));

	}

	public static int somar(int valor1, int valor2) {
		int soma = valor1 + valor2;

		return soma;
	}
	
	public static void imprimir(String texto) {
		System.out.println(texto);
	}
	
	public static String entradaUsuario(String mensagem) {
		imprimir(mensagem);
		
		Scanner ler =  new Scanner(System.in);
		String entradaUsuario = ler.nextLine();
		
		return entradaUsuario;
	}

}
