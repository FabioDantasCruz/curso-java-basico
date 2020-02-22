package exercicios.Aula13;

import java.util.Scanner;

//Descriçao do exercicio proposto
//7 - Faça um Programa que calcule a area de um quadrado, em seguida mostre o dobro desta area para o usuario

public class Exercicio07 {

	public static void main(String[] args) {

		int numero;
		int resultado = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		
		numero = scan.nextInt();
		resultado = numero * numero;
		
		System.out.println("A area do quadrado: " + resultado);
		System.out.println("O Dobro desta area: " + resultado * 2);
		scan.close();

	}

}
