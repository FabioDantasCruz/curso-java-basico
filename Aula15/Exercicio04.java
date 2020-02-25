package exercicios.Aula15;

import java.util.Scanner;

//Descrição do exercicio proposto
//4 - Faça um Programa que verifique se uma letra digitada é vogal ou consoante

public class Exercicio04 {

	public static void main(String[] args) {
		String vogais = "aeiou";

		String letra;

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite uma letra: ");
		letra = scan.nextLine();

		if (vogais.contains(letra.toLowerCase())) {
			System.out.print("Vogal");
		} else {
			System.out.print("Consoante");
		}
		scan.close();

	}

}
