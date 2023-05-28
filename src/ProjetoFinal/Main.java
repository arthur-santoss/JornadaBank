package ProjetoFinal;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String[][] matrizUsuarios = new String [5][4];
		adicionarUsuario(matrizUsuarios);

		// imprimir matriz
		System.out.println("\nDados da Matriz:");
		for (int i = 0; i < matrizUsuarios.length; i++) {
			for (int j = 0; j < matrizUsuarios[i].length; j++) {
				System.out.print(matrizUsuarios[i][j] + " ");
			}
			System.out.println();
		}
		// imprime a posição vazia na matriz
		System.out.println("numero da conta: " + numeroDaconta() );

	}

	private static String numeroDaconta() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void adicionarUsuario(String[][] matrizUsuarios) {
		int posicao = encontrarPosicaoVazia(matrizUsuarios);
		Scanner ler = new Scanner(System.in);

		System.out.println("digite seu nome: ");
		matrizUsuarios[posicao][0] = ler.next();
		
		System.out.println("digite seu cpf: ");
		matrizUsuarios[posicao][1] = ler.next();
		
		System.out.println("digite seu email: ");
		matrizUsuarios[posicao][2] = ler.next();
		
		System.out.println("digite seu senha: ");
		matrizUsuarios[posicao][3] = ler.next();

	}

	public static int encontrarPosicaoVazia(String[][] matrizUsuarios) {
		for (int i = 0; i < matrizUsuarios.length; i++) {
			for (int j = 0; j < matrizUsuarios[i].length; j++) {
				if (matrizUsuarios[i][j] == null) {
					return i; // Retorna a posição da linha vazia
				}
			}
		}
		return -1; // Retorna -1 se não encontrar uma posição vazia na matriz
	}

}
