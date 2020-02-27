package exercicios.Aula16;

import java.util.Scanner;

//Descrição do exercicio proposto
///27 - O Departamento Estadual de Meteorologia lhe contratou para desenvolver um programa que leia as um conjunto 
//indeterminado de temperaturas, e informe ao final a menor e a maior temperaturas informadas,
//bem como a média das temperaturas.

public class Exercicio27 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com a quantidade de temperaturas");
		int qtdTemperaturas = scan.nextInt();

		double temperatura;
		double soma = 0;
		double menor = Double.MAX_VALUE;
		double maior = Double.MIN_VALUE;

		for (int i = 1; i <= qtdTemperaturas; i++) {

			System.out.println("Digite a temperatura " + i);
			temperatura = scan.nextDouble();

			soma += temperatura;

			if (temperatura > maior) {
				maior = temperatura;
			}

			if (temperatura < menor) {
				menor = temperatura;
			}
		}

		System.out.println("Média: " + (soma / qtdTemperaturas));
		System.out.println("Menor temperatura: " + menor);
		System.out.println("Maior temperatura: " + maior);
		scan.close();
	}


}
