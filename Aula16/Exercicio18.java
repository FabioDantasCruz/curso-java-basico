package exercicios.Aula16;

import java.util.Scanner;

//Descri��o do exercicio proposto
//18 - Fa�a um programa que pe�a um n�mero inteiro e determine se ele � ou n�o um n�mero primo.
//Um n�mero primo � aquele que � divis�vel somente por ele mesmo e por 1

public class Exercicio18 {

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
			System.out.println("O numero " + numero + " � primo");
		} else {
			System.out.println("O numero " + numero + " n�o � primo");
		}

		scan.close();

	}

}
