package exercicios.Aula16;

import java.util.Scanner;

//Descrição do exercicio proposto
//13 - Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro número elevado ao segundo número.
//Não utilize a função de potência da linguagem.

public class Exercicio13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int base;
		int expoente;

		System.out.println("Digite o numero da base: ");
		base = scan.nextInt();
		int resultado = base;
		;
		System.out.println("Digite o numero do expoente: ");
		expoente = scan.nextInt();

		for (int i = 1; i < expoente; i++) {
			resultado *= base;

		}

		System.out.println(base + " elevado a " + expoente + " = " + resultado);

		scan.close();

	}

}
