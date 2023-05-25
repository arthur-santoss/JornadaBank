package Modulo03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] alimentos = new String[3];
		
		//inserir valores no vetor
		System.out.println("inserir valores: ");
		for (int i = 0; i < alimentos.length; i++) {
			alimentos[i] = sc.next();
		}
		
		//pesquisando no vetor
		System.out.println("Qual alimento quer encontrar?");
		String encontrarAlimento = sc.next();
		
		int opcao = 0;
		while (opcao < alimentos.length) {
		    if (alimentos[opcao].equals(encontrarAlimento)) { //equals para comparar o valor dos objetos int/string
		        System.out.printf("Encontrado na posição: %d", opcao);
		        break; // Sai do loop quando o alimento é encontrado
		    }
		    opcao++;
		}

		
		
		
		sc.close();
	}

}
