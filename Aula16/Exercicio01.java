package exercicios.Aula16;

import java.util.Scanner;

//Descrição do exercicio proposto
//1 - Faça um programa que peça uma nota, entre zero e dez. 
//Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido


public class Exercicio01 {

	public static void main(String[] args) {
	
		double nota;
		Scanner scan = new Scanner(System.in);
		
		boolean valida;
		
		do {
			 valida = false;
			System.out.println("Digite uma nota emtre zero e dez: ");
			nota = scan.nextDouble();
			if(nota <= 0 || nota > 10) {
				System.out.println("Valor invalido");	
				valida = true;
			}
		}while(valida);

	
		
		scan.close();
		
	}

}
