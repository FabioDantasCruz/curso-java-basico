package exercicios.Aula16;

import java.util.Scanner;

//Descri��o do exercicio proposto
//22 - Fa�a um programa que calcule o valor total investido por um colecionador em sua cole��o de CDs 
//e o valor m�dio gasto em cada um deles. O usu�rio dever� informar a quantidade de CDs e o valor
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
			System.out.println("Digite o pre�o pago pelo cd " +i);
			preco = scan.nextDouble();
			soma += preco;
		}
		media = soma/quantidadeCDs;
		
		System.out.println("O valor total investido �:" + soma);
		System.out.println("O valor medio para cada CD �: " + media);
		
		
		scan.close();
		
	}

}
