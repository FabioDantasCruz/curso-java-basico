package exercicios.Aula13;

//Descri�ao do exercicio proposto
//5 - Fa�a um programa que converta metros para centimetros

import java.util.Scanner;

public class Exercicio05 {



	public static void main(String[] args) {

		double metro;
		double resultado = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a quantidade em metros a ser convertida: ");
		metro = scan.nextDouble();
		resultado = metro * 100;
		System.out.println("A quantidade de " + " " + metro + "em metros: " + resultado + " centrimetros");
		scan.close();

	}

}
