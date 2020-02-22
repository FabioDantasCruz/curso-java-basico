package exercicios.Aula13;

//Descriçao do exercicio proposto
//2 - Faça um programa que mostre a mensagem "Alo mundo" na tela um programa que peça 
//um numero e entao mostre a mensagem "O numero informado foi [numero]"

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		int numeroDigitado;
		System.out.println("Digite um numero: ");
		numeroDigitado = scan.nextInt();
		System.out.println("O numero informado foi: " + numeroDigitado);
		scan.close();

		
	}

}
