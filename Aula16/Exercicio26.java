package exercicios.Aula16;

import java.util.Scanner;

//Descrição do exercicio proposto
//26 - Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. 
//Ex.: 5!=5.4.3.2.1=120. A saída deve ser
//conforme o exemplo abaixo:
//o Fatorial de: 5
//o 5! = 5 . 4 . 3 . 2 . 1 = 120

public class Exercicio26 {

	public static void main(String[] args) {

		int numero;
		int resultado = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		numero = scan.nextInt();
		System.out.println("Fatorial de : " + numero);
		System.out.print(numero + "! = ");
		for (int i = numero; i > 1; i--) {
			resultado *= i;
			System.out.print(i + " . ");
		}
		System.out.print(" 1 = " + resultado);
		
		scan.close();

	}

}
