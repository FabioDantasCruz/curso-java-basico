package exercicios.Aula15;

import java.util.Scanner;

//Descri��o do exercicio proposto
//18.Fa�a um Programa que pe�a um n�mero inteiro e determine se ele � par ou impar. 
//Dica: utilize o operador m�dulo (resto da divis�o).

public class Exercicio18 {

	public static void main(String[] args) {

		int numero;
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um numero: ");
		numero = scan.nextInt();

		if (numero % 2 == 0) {
			System.out.print(numero + " � par");
		} else
			System.out.print(numero + " � impar");

		scan.close();
	}

}
