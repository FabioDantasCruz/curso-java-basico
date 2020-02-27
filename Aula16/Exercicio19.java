package exercicios.Aula16;

import java.util.Scanner;

//Descrição do exercicio proposto
//19 - Faça um programa que calcule o mostre a média aritmética de N notas.

public class Exercicio19 {

	public static void main(String[] args) {

		int notas;
		double soma = 0;
		double media;
		double nota;

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o número de notas:");
		notas = scan.nextInt();

		for (int i = 0; i < notas; i++) {
			System.out.println("Digite a nota :" + (i + 1));
			nota = scan.nextDouble();

			soma += nota;
		}

		media = soma / notas;

		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);

		scan.close();

	}

}
