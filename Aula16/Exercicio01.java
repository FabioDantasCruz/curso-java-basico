package exercicios.Aula16;

import java.util.Scanner;

//Descri��o do exercicio proposto
//1 - Fa�a um programa que pe�a uma nota, entre zero e dez. 
//Mostre uma mensagem caso o valor seja inv�lido e continue pedindo at� que o usu�rio informe um valor v�lido


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
