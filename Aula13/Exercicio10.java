package exercicios.Aula13;

import java.util.Scanner;

//Descri��o do exercicio proposto
//10 - Fa�a um Programa que pe�a a temperatura em graus Celsius, transforme e mostre em graus Farenheit

public class Exercicio10 {
	
	public static void main(String[] args) {
		double fahrenheit = 0;
		double celsius = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a temperatura em Farenheit: ");
		fahrenheit = scan.nextDouble();
		celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("A temperatura em celsius: " + celsius);
		scan.close();
	}
	

}
