package exercicios.Aula16;

import java.util.Scanner;

//Descrição do exercicio proposto
//20 - .Faça um programa que peça para n pessoas a sua idade, ao final o programa devera verificar 
//se a média de idade da turma varia entre 0 e 25,26 e 60 e maior que 60; 
//e então, dizer se a turma é jovem, adulta ou idosa, conforme a média calculada.

public class Exercicio20 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int quantidadeIdades;
		int pessoaIdade = 0;
		int soma = 0;
		double media;

		System.out.println("Digite a quantidade de idades: ");
		quantidadeIdades = scan.nextInt();

		for (int i = 0; i < quantidadeIdades; i++) {

			System.out.println("Digite a idade da pessoa " + (i + 1));
			pessoaIdade = scan.nextInt();

			soma += pessoaIdade;
		}

		 media = soma / quantidadeIdades;

		System.out.println("Média de idade: " + media);

		if (media >= 0 && media <= 25) {
			System.out.println("Jovem");
		} else if (media >= 26 && media <= 60) {
			System.out.println("Adulta");
		} else if (media > 60) {
			System.out.println("Idosa");
		}

		scan.close();

	}

}
