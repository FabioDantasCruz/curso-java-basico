package exercicios.Aula15;

import java.util.Scanner;

//Descri��o do exercicio proposto
//6 - Fa�a um Programa que leia tr�s n�meros e mostre o maior deles

public class Exercicio06 {

	public static void main(String[] args) {

		int primeiroNumero;
		int segundoNumero;
		int terceiroNumero;
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o primeiro numero: ");
		primeiroNumero = scan.nextInt();
		System.out.print("Digite o segundo numero: ");
		segundoNumero = scan.nextInt();
		System.out.print("Digite o terceiro numero: ");
		terceiroNumero = scan.nextInt();

		if ((primeiroNumero >= segundoNumero) && (primeiroNumero >= terceiroNumero)) {
			System.out.print("O maior numero � : " + primeiroNumero);
		} else if (segundoNumero >= terceiroNumero) {
			System.out.print("O maior numero � : " + segundoNumero);
		} else {
			System.out.print("O maior numero � : " + terceiroNumero);
		}

		scan.close();

	}

}
