package exercicios.Aula16;

import java.util.Scanner;

//Descri��o do exercicio proposto
//10 - Fa�a um programa que receba dois n�meros inteiros e gere os n�meros inteiros que est�o no intervalo 
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
