package exercicios.Aula15;

import java.util.Scanner;

//Descri��o do exercicio proposto
//2 - Fa�a um Programa que pe�a um valor e mostre na tela se o valor � positivo ou negativo.

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
