package exercicios.Aula15;

import java.util.Scanner;

//Descri��o do exercicio proposto
//8 - Fa�a um programa que pergunte o pre�o de tr�s produtos e informe qual produto voc� deve comprar,
//sabendo que a decis�o � sempre pelo mais barato

public class Exercicio08 {

	public static void main(String[] args) {

		double primeiroProduto;
		double segundoProduto;
		double terceiroProduto;
		double menor;

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o pre�o do primeiro produto: ");
		primeiroProduto = scan.nextInt();
		System.out.println("Digite o pre�o do primeiro produto: ");
		segundoProduto = scan.nextInt();
		System.out.println("Digite o pre�o do primeiro produto: ");
		terceiroProduto = scan.nextInt();

		if ((primeiroProduto < segundoProduto) && (primeiroProduto < segundoProduto)) {
			menor = primeiroProduto;
		} else if (segundoProduto < terceiroProduto) {
			menor = segundoProduto;
		} else {
			menor = terceiroProduto;
		}

		System.out.println("O produto a ser comprado � o de preco: " + menor);

		scan.close();

	}

}
