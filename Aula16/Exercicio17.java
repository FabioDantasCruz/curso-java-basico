package exercicios.Aula16;

import java.util.Scanner;

//Descri��o do exercicio proposto
//17 - Fa�a um programa que calcule o fatorial de um n�mero inteiro fornecido pelo usu�rio. Ex.: 5!=5.4.3.2.1=120

public class Exercicio17 {

	public static void main(String[] args) {

		int numero;
		int resultado = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		numero = scan.nextInt();

		for (int i = 1; i <= numero; i++) {
			resultado *= i;
		}
		System.out.println("O fatorial de " + numero + " � " + resultado);
		scan.close();

	}

}
