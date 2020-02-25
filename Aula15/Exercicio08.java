package exercicios.Aula15;

import java.util.Scanner;

//Descrição do exercicio proposto
//8 - Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar,
//sabendo que a decisão é sempre pelo mais barato

public class Exercicio08 {

	public static void main(String[] args) {

		double primeiroProduto;
		double segundoProduto;
		double terceiroProduto;
		double menor;

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o preço do primeiro produto: ");
		primeiroProduto = scan.nextInt();
		System.out.println("Digite o preço do primeiro produto: ");
		segundoProduto = scan.nextInt();
		System.out.println("Digite o preço do primeiro produto: ");
		terceiroProduto = scan.nextInt();

		if ((primeiroProduto < segundoProduto) && (primeiroProduto < segundoProduto)) {
			menor = primeiroProduto;
		} else if (segundoProduto < terceiroProduto) {
			menor = segundoProduto;
		} else {
			menor = terceiroProduto;
		}

		System.out.println("O produto a ser comprado é o de preco: " + menor);

		scan.close();

	}

}
