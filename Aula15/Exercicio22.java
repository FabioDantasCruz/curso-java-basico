package exercicios.Aula15;

import java.util.Scanner;

//Descrição do exercicio proposto
//22.Uma fruteira está vendendo frutas com a seguinte tabela de preços: 
//Até 5 Kg               Acima de 5 Kg 
//Morango R$ 2,50 por Kg R$ 2,20 por Kg 
//Maçã R$ 1,80 por Kg R$ 1,50 por Kg 
//Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, 
//receberá ainda um desconto de 10% sobre este total. 
//Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente. 

public class Exercicio22 {

	public static void main(String[] args) {

		double kgMorango;
		double kgMaca;
		double precoMorango = 0;
		double precoMaca = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite os quantidade (kg) de morango: ");
		kgMorango = scan.nextDouble();

		System.out.println("Digite os quantidade (kg) de maça: ");
		kgMaca = scan.nextDouble();

		if (kgMorango <= 5) {
			precoMorango = 2.5;
		} else {
			precoMorango = 2.2;
		}

		if (kgMaca <= 5) {
			precoMaca = 1.8;
		} else {
			precoMaca = 1.5;
		}

		double precoTotalMorango = kgMorango * precoMorango;
		double precoTotalMaca = kgMaca * precoMaca;

		double precoParcial = precoTotalMorango + precoTotalMaca;
		double precoTotal = precoParcial;

		if ((kgMorango + kgMaca > 8) || precoParcial > 25) {
			precoTotal = precoParcial - ((precoParcial / 100) * 10);
		}

		System.out.println("Preco total = " + precoTotal);
		scan.close();
	}
	
}
