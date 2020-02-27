package exercicios.Aula16;

import java.util.Scanner;

//Descri��o do exercicio proposto
//15  - A s�rie de Fibonacci � formada pela seq��ncia1,1,2,3,5,8,13,21,34,55,... 
//Fa�a um programa capaz de gerar a s�rie at� o n-�simo termo.

public class Exercicio15 {

	public static void main(String[] args) {

		int numero;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o termo a ser calculado da serie de Fibonacci: ");
		numero = scan.nextInt();

		int ultimo = 0;
		int penultimo = 1;
		int termo = 0;
		
		for (int i = 0; i < numero; i++) {

			termo = ultimo + penultimo;
			System.out.println(termo);
			penultimo = ultimo;
			ultimo = termo;
			
		}

		scan.close();

	}

}
