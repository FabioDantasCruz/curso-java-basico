package exercicios.Aula16;

import java.util.Scanner;

//Descrição do exercicio proposto
//11 - Altere o programa anterior para mostrar no final a soma dos números.

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int primeiroNumero;
		int segundoNumero;
		int resultado = 0;
		System.out.println("Digite o primeiro numero: ");
		primeiroNumero = scan.nextInt();

		System.out.println("Digite o segundo numero: ");
		segundoNumero = scan.nextInt();

		for (int i = primeiroNumero; i <= segundoNumero; i++) {
			resultado += i;
		}

		System.out.println("A soma dos valores é: " + resultado);
		scan.close();

	}

}
