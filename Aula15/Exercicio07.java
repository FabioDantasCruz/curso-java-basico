package exercicios.Aula15;

import java.util.Scanner;

//Descri��o do exercicio proposto
//7 - Fa�a um Programa que leia tr�s n�meros e mostre o maior e o menor deles

public class Exercicio07 {

	public static void main(String[] args) {

		int primeiroNumero;
		int segundoNumero;
		int terceiroNumero;

		int maior;
		int menor = 0;

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o primeiro numero: ");
		primeiroNumero = scan.nextInt();
		System.out.print("Digite o segundo numero: ");
		segundoNumero = scan.nextInt();
		System.out.print("Digite o terceiro numero: ");
		terceiroNumero = scan.nextInt();

		if ((primeiroNumero > segundoNumero) && (primeiroNumero > terceiroNumero)) {
			maior = primeiroNumero;
		} else if (segundoNumero > terceiroNumero) {
			maior = segundoNumero;
		} else {
			maior = terceiroNumero;
		}
		
		if ((primeiroNumero < segundoNumero) && (primeiroNumero < terceiroNumero)) {
			menor = primeiroNumero;
		} else if (segundoNumero < terceiroNumero) {
			menor = segundoNumero;
		} else {
			menor = terceiroNumero;
		}
		
		

		System.out.println("O maior numero � : " + maior);
		System.out.println("O menor numero � : " + menor);

		scan.close();

	}

}
