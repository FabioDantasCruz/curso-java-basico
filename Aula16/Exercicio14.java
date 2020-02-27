package exercicios.Aula16;

import java.util.Scanner;


//Descrição do exercicio proposto
//14 - Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de números pares
//e a quantidade de números impares.


public class Exercicio14 {

	public static void main(String[] args) {

		
		int numero;
		int quantidadePares = 0;
		int quantidadeImpares = 0;

		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite um numero: ");
			numero = scan.nextInt();
			if(numero % 2 ==0 ) {
				quantidadePares++;
			}else {
				quantidadeImpares++;
			}
		}
		
		System.out.println("A quantidade de numeros pares foi: " + quantidadePares);
		System.out.println("A quantidade de numeros impares foi: " + quantidadeImpares);
		
		scan.close();
		
	}

}
