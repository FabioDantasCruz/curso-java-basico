package exercicios.Aula16;

import java.util.Scanner;

//Descri��o do exercicio proposto
//8 -. Fa�a um programa que leia 5 n�meros e informe a soma e a m�dia dos n�meros.

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

		System.out.println("A soma dos numeros �: " + soma);
		System.out.println("A media dos numeros �: " + media);

		scan.close();

	}

}
