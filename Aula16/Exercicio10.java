package exercicios.Aula16;

import java.util.Scanner;

//Descrição do exercicio proposto
//10 - Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo 
//compreendido por eles.

public class Exercicio10 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int primeiroNumero;
		int segundoNumero;
		
		System.out.println("Digite o primeiro numero: ");
		primeiroNumero = scan.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		segundoNumero = scan.nextInt();
		
		for (int i = primeiroNumero; i <= segundoNumero;i++) {
		System.out.print(i + " ");	
		}
	
		
		scan.close();
		
	}

}
