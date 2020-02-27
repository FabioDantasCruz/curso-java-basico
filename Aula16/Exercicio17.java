package exercicios.Aula16;

import java.util.Scanner;

//Descrição do exercicio proposto
//17 - Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120

public class Exercicio17 {

	public static void main(String[] args) {

		int numero;
		int resultado = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		numero = scan.nextInt();

		for (int i = 1; i <= numero; i++) {
			resultado *= i;
		}
		System.out.println("O fatorial de " + numero + " é " + resultado);
		scan.close();

	}

}
