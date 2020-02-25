package exercicios.Aula15;

import java.util.Scanner;

//Descrição do exercicio proposto
//20 - .Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. 
//As perguntas são: . "Telefonou para a vítima?"
//a. "Esteve no local do crime?" 
//b. "Mora perto da vítima?"
//c. "Devia para a vítima?" 
//d. "Já trabalhou com a vítima?" 
//O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. 
//Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice"
//e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".

public class Exercicio20 {

	public static void main(String[] args) {

		int contador = 0;

		Scanner scan = new Scanner(System.in);
		String resposta;
		System.out.println("Digite S ou N para as para as perguntas a seguir: ");
		System.out.println("Telefonou para a vítima?");
		resposta = scan.next();
		if (resposta.equalsIgnoreCase("S")) {
			contador++;
		}
		System.out.println("Esteve no local do crime?");
		resposta = scan.next();
		if (resposta.equalsIgnoreCase("S")) {
			contador++;
		}
		System.out.println("Mora perto da vítima?");
		resposta = scan.next();
		if (resposta.equalsIgnoreCase("S")) {
			contador++;
		}
		System.out.println("Devia para a vítima?");
		resposta = scan.next();
		if (resposta.equalsIgnoreCase("S")) {
			contador++;
		}
		System.out.println("Já trabalhou com a vítima?");
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
