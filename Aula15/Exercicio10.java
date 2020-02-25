package exercicios.Aula15;

import java.util.Scanner;

//Descrição do exercicio proposto
//10.Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. 
//Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso. 

public class Exercicio10 {

	public static void main(String[] args) {

		String letra;
		Scanner scan = new Scanner(System.in);

		System.out.println("Em que turno você estuda? ");
		System.out.println("Digite M-matutino ou V-Vespertino ou N- Noturno: ");
		letra = scan.nextLine();

		switch (letra.toLowerCase()) {
		case "m":
			System.out.print("Bom Dia!");
			break;
		case "v":
			System.out.print("Boa Tarde");
			break;
		case "n":
			System.out.print("Boa Noite");
		default:
			System.out.print("Valor Inválido!");
		}

		scan.close();

	}

}
