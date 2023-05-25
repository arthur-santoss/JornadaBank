package Modulo01;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe a temperatura em ºC: ");
		double temCelsius = ler.nextDouble();
		
		double conFahrenheit = (temCelsius * 1.8) + 32;
		double conKelvin = temCelsius + 273.15;
		
		System.out.printf("Celsius %.1f° -> Fahrenheit %.1f°", temCelsius, conFahrenheit);
		System.out.printf("\nCelsius %.1f° -> Kelvin %.1f°", temCelsius, conKelvin);

		
		ler.close();
	}

}
