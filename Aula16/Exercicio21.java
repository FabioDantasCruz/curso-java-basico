package exercicios.Aula16;

import java.util.Scanner;

//Descrição do exercicio proposto
//21 - Faça um programa que calcule o número médio de alunos por turma. 
//Para isto, peça a quantidade de turmas e a quantidade de alunos para cada turma. 
//As turmas não podem ter mais de 40 alunos

public class Exercicio21 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o número de turmas:");
		int numeroTurmas = scan.nextInt();

		int numueroAlunos;
		int soma = 0;
		boolean valida = true;

		for (int i = 1; i <= numeroTurmas; i++) {

			valida = true;
			do {
				System.out.println("Digite o número de alunos da turma " + i);
				numueroAlunos = scan.nextInt();

				if (numueroAlunos <= 40) {
					valida = false;
				} else {
					System.out.println("Número de alunos inválido");
				}
			} while (valida);

			soma += numueroAlunos;
		}

		double media = soma / numeroTurmas;

		System.out.println("Média: " + media);

		scan.close();

	}

}
