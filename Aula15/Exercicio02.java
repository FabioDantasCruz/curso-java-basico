package exercicios.Aula15;

import java.util.Scanner;

//Descrição do exercicio proposto
//2 - Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.

public class Exercicio02 {

	public static void main(String[] args) {
		
		double numero;

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um numero: ");
		numero = scan.nextDouble();

		if (numero > 0) {
			System.out.print(numero + " E positivo");
		} else {
			System.out.print(numero + " E negativo");
		}

		scan.close();

	}

}
