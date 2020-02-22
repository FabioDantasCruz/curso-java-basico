package exercicios.Aula13;

import java.util.Scanner;

//Descriçao do exercicio proposto
//9 - Faça um Programa que peça a temperatura em graus Fahrenheit, 
//transforme e mostre a temperatura em graus Celsius. o C = (5 * (F-32) / 9). 

public class Exercicio09 {

	public static void main(String[] args) {
		double fahrenheit = 0;
		double celsius = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a temperatura em Farenheit: ");
		fahrenheit = scan.nextDouble();
		celsius = (5 * (fahrenheit - 32) / 9);
		System.out.println("A temperatura em celsius: " + celsius);
		scan.close();
	}

}
