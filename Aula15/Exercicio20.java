package exercicios.Aula15;

import java.util.Scanner;

//Descri��o do exercicio proposto
//20 - .Fa�a um programa que fa�a 5 perguntas para uma pessoa sobre um crime. 
//As perguntas s�o: . "Telefonou para a v�tima?"
//a. "Esteve no local do crime?" 
//b. "Mora perto da v�tima?"
//c. "Devia para a v�tima?" 
//d. "J� trabalhou com a v�tima?" 
//O programa deve no final emitir uma classifica��o sobre a participa��o da pessoa no crime. 
//Se a pessoa responder positivamente a 2 quest�es ela deve ser classificada como "Suspeita", entre 3 e 4 como "C�mplice"
//e 5 como "Assassino". Caso contr�rio, ele ser� classificado como "Inocente".

public class Exercicio20 {

	public static void main(String[] args) {

		int contador = 0;

		Scanner scan = new Scanner(System.in);
		String resposta;
		System.out.println("Digite S ou N para as para as perguntas a seguir: ");
		System.out.println("Telefonou para a v�tima?");
		resposta = scan.next();
		if (resposta.equalsIgnoreCase("S")) {
			contador++;
		}
		System.out.println("Esteve no local do crime?");
		resposta = scan.next();
		if (resposta.equalsIgnoreCase("S")) {
			contador++;
		}
		System.out.println("Mora perto da v�tima?");
		resposta = scan.next();
		if (resposta.equalsIgnoreCase("S")) {
			contador++;
		}
		System.out.println("Devia para a v�tima?");
		resposta = scan.next();
		if (resposta.equalsIgnoreCase("S")) {
			contador++;
		}
		System.out.println("J� trabalhou com a v�tima?");
		resposta = scan.next();
		if (resposta.equalsIgnoreCase("S")) {
			contador++;
		}
		
		
		if (contador < 2) {
			System.out.println("Inocente");
		} else if (contador == 2) {
			System.out.println("Suspeito");
		} else if (contador > 2 && contador < 5) {
			System.out.println("Cumplice");
		} else if (contador == 5) {
			System.out.println("Assassino");
		}

		scan.close();
	}

}
