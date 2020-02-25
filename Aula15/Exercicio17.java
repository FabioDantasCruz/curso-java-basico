package exercicios.Aula15;

import java.util.Scanner;

//Descrição do exercicio proposto
//17.Faça um Programa que peça um número correspondente a um determinado ano
//e em seguida informe se este ano é ou não bissexto.

public class Exercicio17 {

	public static void main(String[] args) {

		int ano;

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o ano: ");

		ano = scan.nextInt();

		if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))) {
			System.out.print(ano + " é um ano Bissexto");
		} else {
			System.out.print(ano + " não é um ano Bissexto");
		}
		scan.close();
	}

}
