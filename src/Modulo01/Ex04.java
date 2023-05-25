package Modulo01;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe a altura: ");
		double altura = ler.nextDouble();
		
		System.out.print("Informe a largura: ");
		double largura = ler.nextDouble();
				
		double area = largura * altura;
		
		System.out.printf("Área do retângulo: %.2f", area);
		
		ler.close();
	}

}
