package exercicios.Aula16;

import java.util.Scanner;

//Descrição do exercicio proposto
//8 -. Faça um programa que leia 5 números e informe a soma e a média dos números.

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double numero;
		double soma = 0;
		double media = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um numero:");
			numero = scan.nextDouble();
			soma += numero;

		}
		media = soma / 5;

		System.out.println("A soma dos numeros é: " + soma);
		System.out.println("A media dos numeros é: " + media);

		scan.close();

	}

}
