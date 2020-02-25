package exercicios.Aula15;

import java.util.Scanner;

//Descrição do exercicio proposto
//18.Faça um Programa que peça um número inteiro e determine se ele é par ou impar. 
//Dica: utilize o operador módulo (resto da divisão).

public class Exercicio18 {

	public static void main(String[] args) {

		int numero;
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um numero: ");
		numero = scan.nextInt();

		if (numero % 2 == 0) {
			System.out.print(numero + " é par");
		} else
			System.out.print(numero + " é impar");

		scan.close();
	}

}
