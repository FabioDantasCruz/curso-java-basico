package exercicios.Aula15;

import java.util.Scanner;

//Descrição do exercicio proposto
//23.O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira: 
//o Até 5 Kg Acima de 5 Kg
//o File Duplo R$ 4,90 por Kg R$ 5,80 por Kg 
//o Alcatra R$ 5,90 por Kg R$ 6,80 por Kg
//o Picanha R$ 6,90 por Kg R$ 7,80 por Kg 
//Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos de carne da promoção, 
//porém não há limites para a quantidade de carne por cliente.
//Se compra for feita no cartão Tabajara o cliente receberá ainda um desconto de 5% sobre o total a compra. 
//Escreva um programa que peça o tipo e a quantidade de carne comprada pelo usuário e gere um cupom fiscal,
//contendo as informações da compra: tipo e quantidade de carne, preço total, tipo de pagamento, valor do desconto e valor a pagar. 

public class Exercicio23 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int tipoCarne;
		double quantidade;
		double precoKg = 0;
		System.out.println("Entre com o tipo da carne:");
		System.out.println("1 - file duplo");
		System.out.println("2 - alcatra");
		System.out.println("3 - picanha");
		tipoCarne = scan.nextInt();

		System.out.println("Entre com a quantidade (kg):");
		quantidade = scan.nextDouble();

		switch (tipoCarne) {
		case (1):
			System.out.println(quantidade + " kg - file duplo");
			if (quantidade < 5) {
				precoKg = 4.9;
			} else {
				precoKg = 5.8;
			}
			break;
		case (2):
			System.out.println(quantidade + " kg - alcatra");

			if (quantidade < 5) {
				precoKg = 5.9;
			} else {
				precoKg = 6.8;
			}
			break;
		case (3):
			System.out.println(quantidade + " kg - picanha");

			if (quantidade < 5) {
				precoKg = 6.9;
			} else {
				precoKg = 7.8;
			}
			break;
		}

		double total = quantidade * precoKg;
		System.out.println(quantidade + " kg * " + precoKg + " = " + total);

		System.out.println("Compra no cartão? digite - S - para sim:");
		String cartao = scan.next();

		if (cartao.equalsIgnoreCase("s")) {
			double desconto = (total / 100) * 5;
			System.out.println("Desconto de: " + desconto);
			System.out.println("Valor a pagar: " + (total - desconto));
		} else {
			System.out.println("Valor a pagar: " + total);
		}
		scan.close();
	}

}
