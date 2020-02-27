package exercicios.Aula16;

import java.util.Scanner;

//Descrição do exercicio proposto
//5 - Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais. 
//Valide a entrada e permita repetir a operação

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int populacaoPaisA;
		int populacaoPaisB;
		int ano = 0;

		double TaxaCrescimentoA;
		double TaxaCrescimentoB;

		boolean valida = false;

		do {
			System.out.println("Digite a população do pais A: ");
			populacaoPaisA = scan.nextInt();

			if (populacaoPaisA > 0) {
				valida = true;
			} else {
				System.out.println("Valor invalido ");
			}
		} while (!valida);

		valida = false;
		do {
			System.out.println("Digite a população do pais B: ");
			populacaoPaisB = scan.nextInt();

			if (populacaoPaisB > 0) {
				valida = true;
			} else {
				System.out.println("Valor invalido ");
			}
		} while (!valida);

		valida = false;
		do {
			System.out.println("Digite a taxa de crescimento inicial do pais A: ");
			TaxaCrescimentoA = scan.nextDouble();
			if (TaxaCrescimentoA > 0) {
				valida = true;
			} else {
				System.out.println("Valor invalido ");
			}
		} while (!valida);

		valida = false;

		do {
			System.out.println("Digite a taxa de crescimento inicial do pais B: ");
			TaxaCrescimentoB = scan.nextDouble();
			if (TaxaCrescimentoB > 0) {
				valida = true;
			} else {
				System.out.println("Valor invalido ");
			}
		} while (!valida);

		while (populacaoPaisA <= populacaoPaisB) {

			populacaoPaisA += (populacaoPaisA / 100) * TaxaCrescimentoA;
			;
			populacaoPaisB += (populacaoPaisB / 100) * TaxaCrescimentoB;
			ano++;
		}

		System.out.println("População A: " + populacaoPaisA);
		System.out.println("População B: " + populacaoPaisB);
		System.out.println(ano);

		scan.close();

	}
}
