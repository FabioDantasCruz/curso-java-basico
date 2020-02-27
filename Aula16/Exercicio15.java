package exercicios.Aula16;

import java.util.Scanner;

//Descrição do exercicio proposto
//15  - A série de Fibonacci é formada pela seqüência1,1,2,3,5,8,13,21,34,55,... 
//Faça um programa capaz de gerar a série até o n-ésimo termo.

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
