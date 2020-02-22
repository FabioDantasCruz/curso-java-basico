package exercicios.Aula13;

import java.util.Scanner;

//Descriçao do exercicio proposto
//6 - Faça um  programa que solicite o raio de um circulo, calcule e mostre sua area

public class Exercicio06 {

	public static void main(String[] args) {

		
		final double PI = 3.14;
		double raio;
		double resultado = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o tamanho do raio do circulo: ");
		raio = scan.nextDouble();
		resultado = (raio * raio) * PI;
		System.out.println("A area do circulo com o raio de " + raio + " é: " +resultado);
		scan.close();


	}

}
