package exercicios.Aula16;

import java.util.Scanner;

//Descri��o do exercicio proposto
//4 - . Supondo que a popula��o de um pa�s A seja da ordem de 80000 habitantes com uma taxa anual de crescimento 
//de 3% e que a popula��o de B seja 200000 habitantes com uma taxa de crescimento de 1.5%. 
//Fa�a um programa que calcule e escreva o n�mero de anos necess�rios para que a popula��o do pa�s A 
//ultrapasse ou iguale a popula��o do pa�s B, mantidas as taxas de crescimento.

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int populacaoPaisA = 80000;
		int populacaoPaisB = 200000;
		int ano = 0;


		while (populacaoPaisA <= populacaoPaisB) {

			populacaoPaisA += (populacaoPaisA /100 )* 3;
			populacaoPaisB += (populacaoPaisB /100) * 1.5;
			ano++;
		}
		
	
		System.out.println("Popula��o A: "+ populacaoPaisA);
		System.out.println("Popula��o B: "+ populacaoPaisB);
		System.out.println(ano);
		
		scan.close();

	}

}
