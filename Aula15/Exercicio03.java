package exercicios.Aula15;

import java.util.Scanner;

//Descri��o do exercicio proposto
//3- Fa�a um Programa que verifique se uma letra digitada � "F" ou "M".
// Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inv�lido

public class Exercicio03 {

	public static void main(String[] args) {

		String letra;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite uma letra: ");
		letra = scan.nextLine();

		switch (letra.toLowerCase()) {
		case "f":
			System.out.print("Feminino");
			break;
		case "m":
			System.out.print("Masculino");
			break;
		default:
			System.out.print("Sexo Inv�lido");
		}

		scan.close();
	}

}
