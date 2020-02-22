package exercicios.Aula13;

import java.util.Scanner;

//Descriçao do exercicio proposto
//4 - Faça um programa que peça quatro notas bimestrais e mostra a media

public class Exercicio04 {

	public static void main(String[] args) {
		
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		double resultado = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a primeira nota: ");
		nota1 = scan.nextDouble();
		System.out.println("Digite a segunda nota: ");
		nota2 = scan.nextDouble();
		System.out.println("Digite a terceira nota: ");
		nota3 = scan.nextDouble();
		System.out.println("Digite a quarta nota: ");
		nota4 = scan.nextDouble();

		resultado = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println("A media obtida: " + resultado);

		scan.close();
	}

}
