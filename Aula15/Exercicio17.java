package exercicios.Aula15;

import java.util.Scanner;

//Descri��o do exercicio proposto
//17.Fa�a um Programa que pe�a um n�mero correspondente a um determinado ano
//e em seguida informe se este ano � ou n�o bissexto.

public class Exercicio17 {

	public static void main(String[] args) {

		int ano;

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o ano: ");

		ano = scan.nextInt();

		if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))) {
			System.out.print(ano + " � um ano Bissexto");
		} else {
			System.out.print(ano + " n�o � um ano Bissexto");
		}
		scan.close();
	}

}
