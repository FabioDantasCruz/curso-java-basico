package exercicios.Aula15;

import java.util.Scanner;

//Descri��o do exercicio proposto
//10.Fa�a um Programa que pergunte em que turno voc� estuda. Pe�a para digitar M-matutino ou V-Vespertino ou N- Noturno. 
//Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inv�lido!", conforme o caso. 

public class Exercicio10 {

	public static void main(String[] args) {

		String letra;
		Scanner scan = new Scanner(System.in);

		System.out.println("Em que turno voc� estuda? ");
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
			System.out.print("Valor Inv�lido!");
		}

		scan.close();

	}

}
