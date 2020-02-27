package exercicios.Aula16;

import java.util.Scanner;

//Descri��o do exercicio proposto
//5 - Altere o programa anterior permitindo ao usu�rio informar as popula��es e as taxas de crescimento iniciais. 
//Valide a entrada e permita repetir a opera��o

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
			System.out.println("Digite a popula��o do pais A: ");
			populacaoPaisA = scan.nextInt();

			if (populacaoPaisA > 0) {
				valida = true;
			} else {
				System.out.println("Valor invalido ");
			}
		} while (!valida);

		valida = false;
		do {
			System.out.println("Digite a popula��o do pais B: ");
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

		System.out.println("Popula��o A: " + populacaoPaisA);
		System.out.println("Popula��o B: " + populacaoPaisB);
		System.out.println(ano);

		scan.close();

	}
}
