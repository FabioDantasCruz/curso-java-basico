package exercicios.Aula16;

import java.util.Scanner;

//Descrição do exercicio proposto
//7 - Faça um programa que leia 5 números e informe o maior número

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double numero;
		double maior = -9999;

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um numero:");
			numero = scan.nextDouble();
			if (numero > maior) {
				maior = numero;
			}

		}

		System.out.println("O maior numero foi: " + maior);
		scan.close();

	}

}
