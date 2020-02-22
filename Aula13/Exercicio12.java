package exercicios.Aula13;

import java.util.Scanner;

//Descrição do exercicio proposto
//12 - Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, 
//usando a seguinte fórmula: (72.7*altura) - 58.

public class Exercicio12 {

	public static void main(String[] args) {

		double altura = 0;
		double resultado;

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite a sua altura: ");
		altura = scan.nextDouble();
		resultado = (72.7 * altura) - 58;
		
		System.out.print("O seu peso ideal é: " + resultado);
		scan.close();
	}

}
