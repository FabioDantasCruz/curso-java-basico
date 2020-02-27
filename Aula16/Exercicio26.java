package exercicios.Aula16;

import java.util.Scanner;

//Descri��o do exercicio proposto
//26 - Fa�a um programa que calcule o fatorial de um n�mero inteiro fornecido pelo usu�rio. 
//Ex.: 5!=5.4.3.2.1=120. A sa�da deve ser
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
