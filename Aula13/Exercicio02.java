package exercicios.Aula13;

//Descri�ao do exercicio proposto
//2 - Fa�a um programa que mostre a mensagem "Alo mundo" na tela um programa que pe�a 
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
