package exercicios.Aula13;


//Descri�ao do exercicio proposto
//3 - Fa�a um programa que pe�a dois numeros e imprima a soma;


import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		int primeiroNumero = 0;
		int segundoNumero = 0;
		int resultado = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro numero: ");
		primeiroNumero = scan.nextInt();
		System.out.println("Digite o segundo numero: ");
		segundoNumero = scan.nextInt();
		resultado = primeiroNumero + segundoNumero;
		System.out.println("A soma dos dois numeros: " + resultado);

		scan.close();
	}

}
