package exercicios.Aula15;

import java.util.Scanner;

//Descrição do exercicio proposto
//Faça um Programa que leia um número e exiba o dia correspondente da semana. (1-Domingo, 2- Segunda, etc.), 
//se digitar outro valor deve aparecer valor inválido.

public class Exercicio13 {

	public static void main(String[] args) {

		int dia;

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um numero: ");
		dia = scan.nextInt();
		
		switch(dia) {
		case 1:
			System.out.print(dia + " corresponde a Domingo");
			break;
		case 2:
			System.out.print(dia + " corresponde a Segunda-feira");
			break;
		case 3:
			System.out.print(dia + " corresponde a Terca-feira");
			break;
		case 4:
			System.out.print(dia + " corresponde a Quarta-feira");
			break;
		case 5:
			System.out.print(dia + " corresponde a Quinta-feira");
			break;
		case 6:
			System.out.print(dia + " corresponde a Sexta-feira");
			break;
		case 7:
			System.out.print(dia + " corresponde a Sabado");
			break;
		default:
			System.out.print("valor inválido.");
		}

		scan.close();
	}

}
