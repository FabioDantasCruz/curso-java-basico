package exercicios.Aula16;

import java.util.Scanner;

//Descri��o do exercicio proposto
//13 - Fa�a um programa que pe�a dois n�meros, base e expoente, calcule e mostre o primeiro n�mero elevado ao segundo n�mero.
//N�o utilize a fun��o de pot�ncia da linguagem.

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
