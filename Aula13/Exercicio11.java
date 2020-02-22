package exercicios.Aula13;

import java.util.Scanner;

//Descrição do exercicio proposto
//11 - Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre: 
//a. o produto do dobro do primeiro com metade do segundo . 
//b. a soma do triplo do primeiro com o terceiro. 
//c. o terceiro elevado ao cubo. 
//

public class Exercicio11 {

	public static void main(String[] args) {

		int primeiroNumero;
		int segundoNumero;
		double numeroReal;

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o primeiro numero: ");
		primeiroNumero = scan.nextInt();
		System.out.print("Digite o segundo numero: ");
		segundoNumero = scan.nextInt();
		System.out.print("Digite o numero real: ");
		numeroReal = scan.nextDouble();

		double resultadoA = (primeiroNumero * 2) * ((double) segundoNumero / 2);
		double resultadoB = (primeiroNumero * 3) + numeroReal;
		double resultadoC = Math.pow(numeroReal, 3);

		System.out.println("O produto do dobro do primeiro com metade do segundo: " + resultadoA);

		System.out.println("A soma do triplo do primeiro com o terceiro: " + resultadoB);

		System.out.println("O terceiro elevado ao cubo é: " + resultadoC);

		scan.close();

	}

}
