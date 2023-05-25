package Testes;

import java.util.Scanner;

public class Teste01 {

	public static void main(String[] args) {
		
//		//exemplo sem retorno
//		String nome = retornarEntradaUsuario("Digite seu nome: ");
//		int idade = Integer.parseInt(retornarEntradaUsuario("Digite sua idade: ") ); 
//		imprimirFormatado(nome, idade);
		
		//exemplo com retorno
		int valor1 = Integer.parseInt(retornarEntradaUsuario("Digite o valor 1") );
		int valor2 = Integer.parseInt(retornarEntradaUsuario("Digite o valor 2") );
		int soma = somar(valor1, valor2); 
		imprimir(String.valueOf(soma));
		
	}

//	public static void imprimirMeuNome() {
//		System.out.println("Arthur");
//	}
	
	public  static void imprimir(String texto) {
		System.out.println(texto);
	}
	
	public static void imprimirFormatado(String nome, int idade) {
		imprimir("O nome é " + nome + ", com " + idade + " anos!");
	}
	
	
	public static String retornarEntradaUsuario(String mensagem) {
		imprimir(mensagem);
		Scanner ler = new Scanner(System.in);
		
		String entradaUsuario = ler.nextLine();
		return entradaUsuario;
	}
	
	public static int somar(int valor1, int valor2) {
		int resultado  = valor1 + valor2;
		return resultado;
	}

}
