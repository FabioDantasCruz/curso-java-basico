package exercicios.Aula16;

import java.util.Scanner;

//Descrição do exercicio proposto
//29 - 9.Encontrar números primos é uma tarefa difícil. Faça um programa que gera uma lista dos números primos 
//existentes entre 1 e um número inteiro informado pelo usuário.

public class Exercicio29 {

	public static void main(String[] args) {

		int numero;
		int conta = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		numero = scan.nextInt();

		for (int i = 1; i <= numero; i++) {
			conta = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					conta++;
				}

			}
			if (conta == 2) {
				System.out.println("O numero " + i + " é primo");
			}
		}

		scan.close();

	}

}
