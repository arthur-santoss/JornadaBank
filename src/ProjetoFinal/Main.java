package ProjetoFinal;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int contador = 0;
		int opcao = -1;
		// String[][] matrizUsuarios = new String [4][6];
		
		//matriz para testes rapidos com manipulação de indices em métodos
		String[][] matrizUsuarios = 
			{ 
				{ "Arthur", "230293023", "arthur@gmail.com", "2002", "1", "100.0" },
				{ "matheus", "51541854", "matheus@gmail.com", "2020", "2", "100.0"},
				{ "gabriel", "29839283", "gabriel@gmail.com", "0101", "3", "100.0"},
				{null, null, null, null, null, null}
			};

		do {
			System.out.print(
					"\n-----------MENU JORNADA BANK-----------: \n" 
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
				fazerDeposito(matrizUsuarios, opcao);
				break;

			case 3:
				fazerSaque(matrizUsuarios, opcao);
				break;
			case 4:
				fazerTransferencia(matrizUsuarios, opcao);
				break;

			case 5:
				mostrarContasCadastradas(matrizUsuarios);
				break;

			default:
				break;
			}

		} while (opcao != 0);
		System.out.println("Programa encerrado!");
	}

	// -------------------MÉTODO DE ADIÇÃO DE NOVO USUÁRIO-------------------
	public static void adicionarUsuario(String[][] matrizUsuarios) {
		Scanner ler = new Scanner(System.in);
		Random random = new Random();

		String numeroAleatorio = String.valueOf(random.nextInt(1000, 5000)); // gera um numero de 4 dígitos para conta
		int posicao = encontrarPosicaoVazia(matrizUsuarios);

		System.out.println("-----------SEJA BEM VINDO!-----------");

		System.out.print("digite seu nome: ");
		matrizUsuarios[posicao][0] = ler.next();

		System.out.print("digite seu cpf: ");
		matrizUsuarios[posicao][1] = ler.next();

		System.out.print("digite seu email: ");
		matrizUsuarios[posicao][2] = ler.next();

		System.out.print("digite sua senha: ");
		matrizUsuarios[posicao][3] = ler.next();

		// adiciona numero da conta
		matrizUsuarios[posicao][4] = numeroAleatorio;

		imprimirUsuario(posicao, matrizUsuarios);
		System.out.println("Criado com sucesso!\n" + "-------------------------");
	}

	// -------------------MÉTODOS DE DEPÓSITO-------------------
	private static void fazerDeposito(String[][] matrizUsuarios, int opcao) {
		Scanner ler = new Scanner(System.in);

		System.out.print(
				"-----------FAZER DEPÓSITO-----------\n" 
						+ "1) logar\n" 
						+ "2) Não tenho conta -> criar conta" 
						+ "\n->");
		int op = ler.nextInt();

		switch (op) {
		case 1:
			ler.nextLine();
			System.out.print("\n-----------LOGIN-----------" 
			+ "\ninforme a conta para deposito:\n");
			String conta = ler.nextLine();

			verificarUsuario(conta, matrizUsuarios, opcao);
			break;

		case 2:
			adicionarUsuario(matrizUsuarios);
			break;

		default:
			break;
		}
	}

	private static void depositar(int i, String[][] matrizUsuarios) {
		Scanner ler = new Scanner(System.in);

		imprimirUsuario(i, matrizUsuarios);

		System.out.print("Informe o valor para deposito: R$ ");
		double deposito = ler.nextDouble();

		if (deposito < 0) {
			System.out.println("Valor inválido!");
		} else {
			if (matrizUsuarios[i][5] != null) {
				double valor = Double.parseDouble(matrizUsuarios[i][5]);
				double incrementarValor = valor + deposito;
				matrizUsuarios[i][5] = String.valueOf(incrementarValor);
				System.out.printf("\nR$ %.2f Adicionado a conta %s\n", deposito, matrizUsuarios[i][4]);
			} else {
				matrizUsuarios[i][5] = String.valueOf(deposito);
				System.out.printf("\nR$ %.2f Adicionado a conta %s\n", deposito, matrizUsuarios[i][4]);
			}
		}

		mostrarSaldo(matrizUsuarios, i);
		System.out.println("------------------------------------");
	}

	// -------------------MÉTODOS DE SAQUE-------------------
	private static void fazerSaque(String[][] matrizUsuarios, int opcao) {
		Scanner ler = new Scanner(System.in);

		System.out.println("informe sua conta: ");
		String conta = ler.nextLine();
		System.out.print("informe a senha da sua conta:");
		String senha = ler.nextLine();

		verificarUsuario(conta, matrizUsuarios, 3);
	}

	private static void sacar(int i, String[][] matrizUsuarios) {
		Scanner ler = new Scanner(System.in);

		imprimirUsuario(i, matrizUsuarios);

		System.out.print("Informe o valor para sacar: R$ ");
		double sacar = ler.nextDouble();

		if (matrizUsuarios[i][5] != null) {
			double valor = Double.parseDouble(matrizUsuarios[i][5]);

			if (sacar <= 0 || sacar > valor) {
				System.out.println("Saldo indisponivel!");
			} else {
				double decrementa = valor - sacar;
				matrizUsuarios[i][5] = String.valueOf(decrementa);
				System.out.printf("\nR$ %.2f Sacado da conta %s\n", sacar, matrizUsuarios[i][4]);
			}
		} else {
			matrizUsuarios[i][5] = String.valueOf(sacar);
		}

		mostrarSaldo(matrizUsuarios, i);
		System.out.println("------------------------------------");
	}

//-------------------MÉTODO DE FAZER TRANSFERÊNCIA-------------------
	private static void fazerTransferencia(String[][] matrizUsuarios, int opcao) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("---------TRANSFERÊNCIA---------");
		System.out.println("informe sua conta: ");
		String conta = ler.nextLine();
		System.out.print("informe a senha da sua conta:");
		String senha = ler.nextLine();
		
		if (validarUsuario(matrizUsuarios, conta, senha) == true) {
			verificarUsuario(conta, matrizUsuarios, 4);
		}else {
			System.out.println("conta ou senha incorretos!");
		}
	}
	
	private static void transferir(String[][] matrizUsuarios, String conta) {
		Scanner ler = new Scanner(System.in);

		double valorTransferencia = 0;
		double valorNaMatriz = 0;
		double decrementa = 0;
		String contaDestino = null;

		for (int i = 0; i < matrizUsuarios.length; i++) {
			if (matrizUsuarios[i][4].equals(conta)) {
				valorNaMatriz = Double.parseDouble(matrizUsuarios[i][5]);

				System.out.println("informe a conta de destino: ");
				contaDestino = ler.next();

				System.out.println("informe o valor para transferir:");
				valorTransferencia = ler.nextDouble();

				// verifica se o saldo é suficiente para o valor inserido na transferencia
				if (valorTransferencia <= valorNaMatriz && valorTransferencia > 0) {
					decrementa = valorNaMatriz - valorTransferencia;
					matrizUsuarios[i][5] = String.valueOf(decrementa);

					for (int j = 0; j < matrizUsuarios.length; j++) {
						if (matrizUsuarios[j][4].equals(contaDestino)) {
							double saldoAtualDestino = Double.parseDouble(matrizUsuarios[j][5]);
							double incrementa = saldoAtualDestino + valorTransferencia;
							matrizUsuarios[j][5] = String.valueOf(incrementa);

							System.out.println("Transferido " + valorTransferencia + " para conta " + contaDestino);
							break;
						}
					}
				} else if(valorTransferencia < 0){
					System.out.println("O saldo precisa ser maior que zero!!!");
					break;
				}else {
					System.out.println("Saldo indisponível!");
				}

			}
		}
	}

//-------------------MÉTODO DE MOSTRAR CONTAS CADASTRADAS-------------------
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


	// -------------------MÉTODOS AUXÍLIARES DE OUTROS MÉTODOS-------------------
	private static boolean validarUsuario(String[][] matrizUsuarios, String conta, String senha) {
		boolean res = false;
		
		for (int i = 0; i < matrizUsuarios.length; i++) {
			if (matrizUsuarios[i][4].equals(conta) && matrizUsuarios[i][3].equals(senha)) {
				res = true;
				i = matrizUsuarios.length;
			}
		}
		return res;
	}
	
	// verifica na matriz se os dados de conta e senha existem e coincidem
	private static void verificarUsuario(String conta, String[][] matrizUsuarios, int opcao) {
		Scanner ler = new Scanner(System.in);
		for (int i = 0; i < matrizUsuarios.length; i++) {
			if (conta.equals(matrizUsuarios[i][4])) {
				System.out.println("\nUsuário encontrado!\n");
				if (opcao == 2) {
					depositar(i, matrizUsuarios);
				} else if (opcao == 3) {
					sacar(i, matrizUsuarios);
				} else if (opcao == 4) {
					transferir(matrizUsuarios, conta);
				}
				break;

			} else if (!conta.equals(matrizUsuarios[i][4])) {
				System.out.println("Procurando...");
			} else {
				System.out.println("Usuário não encontrado!");
			}
		}
	}

	private static void mostrarSaldo(String[][] matrizUsuarios, int i) {
		System.out.println("Saldo atual " + matrizUsuarios[i][5]);
	}

	public static int encontrarPosicaoVazia(String[][] matrizUsuarios) {
		for (int i = 0; i < matrizUsuarios.length; i++) {
			if (matrizUsuarios[i][0] == null) {
				return i; // Retorna a posição da linha vazia
			}
		}
		return -1; // Retorna -1 se não encontrar uma posição vazia na matriz
	}

	// -------------------MÉTODOS DE IMPRIMIR/MOSTRAR DADOS-------------------
	// pega a posição informada no método adicionarUsuario e imprime o que há lá
	public static void imprimirUsuario(int posicao, String[][] matrizUsuarios) {
		System.out.println("\n-----------usuário-----------\n" 
				+ "nome: " + matrizUsuarios[posicao][0] + "\n" 
				+ "cpf: " + matrizUsuarios[posicao][1] + "\n" 
				+ "email: " + matrizUsuarios[posicao][2] + "\n" 
				+ "senha: " + matrizUsuarios[posicao][3] + "\n" 
				+ "conta: " + matrizUsuarios[posicao][4] + "\n" 
				+ "saldo: " + matrizUsuarios[posicao][5] + "\n" 
				+ "------------------------------");
	}
}
