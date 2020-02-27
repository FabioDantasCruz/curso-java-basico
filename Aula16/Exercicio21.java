package exercicios.Aula16;

import java.util.Scanner;

//Descri��o do exercicio proposto
//21 - Fa�a um programa que calcule o n�mero m�dio de alunos por turma. 
//Para isto, pe�a a quantidade de turmas e a quantidade de alunos para cada turma. 
//As turmas n�o podem ter mais de 40 alunos

public class Exercicio21 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o n�mero de turmas:");
		int numeroTurmas = scan.nextInt();

		int numueroAlunos;
		int soma = 0;
		boolean valida = true;

		for (int i = 1; i <= numeroTurmas; i++) {

			valida = true;
			do {
				System.out.println("Digite o n�mero de alunos da turma " + i);
				numueroAlunos = scan.nextInt();

				if (numueroAlunos <= 40) {
					valida = false;
				} else {
					System.out.println("N�mero de alunos inv�lido");
				}
			} while (valida);

			soma += numueroAlunos;
		}

		double media = soma / numeroTurmas;

		System.out.println("M�dia: " + media);

		scan.close();

	}

}
