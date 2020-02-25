package exercicios.Aula15;

import java.util.Scanner;

//Descrição do exercicio proposto
//1 - Faça um Programa que peça dois números e imprima o maior deles.


public class Exercicio01 {

	public static void main(String[] args) {
		

		double primeiroNumero;
		double segundoNumero;
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o primeiro numero ");
		primeiroNumero = scan.nextDouble();
		System.out.print("Digite o segundo numero ");
		segundoNumero = scan.nextDouble();
		
		if(primeiroNumero > segundoNumero) {
			System.out.print("O maior numero é : " + primeiroNumero);
		}else {
			System.out.print("O maior numero é : " + segundoNumero);
		}
		
		scan.close();
		
	}

}
