package exercicios.Aula15;

import java.util.Scanner;

//Descrição do exercicio proposto
//3- Faça um Programa que verifique se uma letra digitada é "F" ou "M".
// Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido

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
			System.out.print("Sexo Inválido");
		}

		scan.close();
	}

}
