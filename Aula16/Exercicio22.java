package exercicios.Aula16;

import java.util.Scanner;

//Descrição do exercicio proposto
//22 - Faça um programa que calcule o valor total investido por um colecionador em sua coleção de CDs 
//e o valor médio gasto em cada um deles. O usuário deverá informar a quantidade de CDs e o valor
//para em cada um


public class Exercicio22 {

	public static void main(String[] args) {
	
		int quantidadeCDs;
		double preco;
		double soma = 0;
		Scanner scan = new Scanner(System.in);
		
		double media = 0;
		System.out.println("Digite a quantidade de CDs: ");
		quantidadeCDs = scan.nextInt();
		
		for(int i = 1; i <= quantidadeCDs; i++) {
			System.out.println("Digite o preço pago pelo cd " +i);
			preco = scan.nextDouble();
			soma += preco;
		}
		media = soma/quantidadeCDs;
		
		System.out.println("O valor total investido é:" + soma);
		System.out.println("O valor medio para cada CD é: " + media);
		
		
		scan.close();
		
	}

}
