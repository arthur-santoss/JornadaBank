package ProjetoFinal;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int contador = 0;
		int opcao = -1;
		String[][] matrizUsuarios = new String [4][6];
		
		
		do {
			System.out.print(
					"\nEscolha uma opção: \n"
					+ "1) criar conta:\n"
					+ "2) Fazer depósito\n"
					+ "3) Fazer Saque\n"
					+ "4) Fazer transferência\n"
					+ "5) Mostrar contas cadastradas\n"
					+ "0) SAIR\n"
					+ "->");
			
			opcao = ler.nextInt();
			switch (opcao) {
			case 1:
				adicionarUsuario(matrizUsuarios);
				break;
				
			case 2:
				fazerDeposito(matrizUsuarios);
				break;
			
			case 5:
				mostrarContasCadastradas(matrizUsuarios);
				break;
				
			default:
				break;
			}
			
		} while (opcao != 0);
		System.out.println("Programa encerrado!");
		
		ler.close();
	}

	private static void fazerDeposito(String[][] matrizUsuarios) {
		Scanner ler = new Scanner(System.in);
		int linha = verificaLinhaSeExiste(matrizUsuarios);
		int coluna = 5;//coluna do saldo
		
		
		System.out.println("\nEscolha: \n"
				+ "1) logar\n"
				+ "2) Não tenho conta -> criar conta\n");
		int op = ler.nextInt();
		
		switch (op) {
		case 1:
			ler.nextLine();
			System.out.print("informe a conta para deposito:\n");
			String conta = ler.nextLine();
			System.out.print("informe a senha da conta:\n");
			String senha = ler.nextLine();
			
			verificarUsuario(conta, senha, matrizUsuarios);
			
			
			break;
			
		case 2:
			adicionarUsuario(matrizUsuarios);
			break;
			
			
		default:
			break;
		}
		
	}
	

	private static void verificarUsuario(String conta, String senha, String[][] matrizUsuarios) {
		for (int i = 0; i < matrizUsuarios.length; i++) {
			for (int j = 0; j < matrizUsuarios.length; j++) {
				if (conta == matrizUsuarios[i][j] && senha == matrizUsuarios[i][j]) {
					System.out.println("Usuário existente");
				}
			}
		}
		System.out.println("Usuário não encontrado!");
		
	}

	//verifica se a conta existe de acordo se a linha estiver preenchida
	private static int verificaLinhaSeExiste(String [][]matrizUsuarios) {
		for (int i = 0; i < matrizUsuarios.length; i++) {//linha
			if (matrizUsuarios[i][0] != null) {
				return i;
			}
		}
		
		return -1;
	}

	private static void mostrarContasCadastradas(String[][] matrizUsuarios) {
		// imprimir matriz
				System.out.println("\nDados da Matriz:\n"
						+ "nome / CPF / E-mail / Senha / Conta / Saldo");
				for (int i = 0; i < matrizUsuarios.length; i++) {
					for (int j = 0; j < matrizUsuarios[i].length; j++) {
						System.out.print(matrizUsuarios[i][j] + " | ");
					}
					System.out.println();
				}
	}



	public static void adicionarUsuario(String[][] matrizUsuarios) {
		Scanner ler = new Scanner(System.in);
		Random random = new Random();
		
		String numeroAleatorio = String.valueOf(random.nextInt(1000,5000)); //gera um numero de 4 dígitos para conta
		int posicao = encontrarPosicaoVazia(matrizUsuarios);
		
		System.out.print("\ndigite seu nome: ");
		matrizUsuarios[posicao][0] = ler.next();
		
		System.out.print("digite seu cpf: ");
		matrizUsuarios[posicao][1] = ler.next();
		
		System.out.print("digite seu email: ");
		matrizUsuarios[posicao][2] = ler.next();
		
		System.out.print("digite sua senha: ");
		matrizUsuarios[posicao][3] = ler.next();
		
		//adiciona numero da conta
		matrizUsuarios[posicao][4] = numeroAleatorio;
		
		System.out.println("-----------usuário-----------\n"+		
				"nome: " + matrizUsuarios[posicao][0]+ " | " +
				"cpf: " + matrizUsuarios[posicao][1]+ " | " +
				"email: " + matrizUsuarios[posicao][2]+ " | " +
				"senha: " + matrizUsuarios[posicao][3]+ " | " +
				"conta: " + matrizUsuarios[posicao][4]+ " | " 
				+ "\n-----------criado com sucesso!-----------");
		
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