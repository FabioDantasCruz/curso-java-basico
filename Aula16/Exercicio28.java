package exercicios.Aula16;

import java.util.Scanner;

//Descrição do exercicio proposto
//28 - Os números primos possuem várias aplicações dentro da Computação, por exemplo na Criptografia. 
//Um número primo é aquele que é divisível apenas por um e por ele mesmo. 
//Faça um programa que peça um número inteiro e determine se ele é ou não um número primo

public class Exercicio28 {

	public static void main(String[] args) {

		int numero;
		int conta = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		numero = scan.nextInt();

		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				conta++;
			}

		}

		if (conta == 2) {
			System.out.println("O numero " + numero + " é primo");
		} else {
			System.out.println("O numero " + numero + " não é primo");
		}

		scan.close();

	}

}
