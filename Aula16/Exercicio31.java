package exercicios.Aula16;

import java.util.Scanner;

//Descri��o do exercicio proposto
//31 - Um funcion�rio de uma empresa recebe aumento salarial anualmente:
//Sabe-se que:
//Esse funcion�rio foi contratado em 1995, com sal�rio inicial de R$ 1.000,00;
//a. Em 1996 recebeu aumento de 1,5% sobre seu sal�rio inicial;
//b. A partir de 1997 (inclusive), os aumentos salariais sempre correspondem ao dobro do percentual do ano anterior. 
//Fa�a um programa que determine o sal�rio atual desse funcion�rio. 
//Ap�s concluir isto, altere o programa permitindo que o usu�rio digite o sal�rio inicial do funcion�rio.

public class Exercicio31 {

	public static void main(String[] args) {

		double salario;
		double percentual = 0.015;
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o valor inicial do salario: ");
		salario = scan.nextDouble();

		for (int i = 1996; i <= 2020; i++) {
			salario += (salario * percentual);

			percentual *= 2;
			System.out.printf("Ano: " + i + " Salario " + "%.2f" + "\n", salario);

		}

		scan.close();

	}

}
