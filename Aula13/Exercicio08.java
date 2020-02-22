package exercicios.Aula13;

import java.util.Scanner;

//Descriçao do exercicio proposto
//8 - Faça um Programa que pergunte quanto voce ganha por hora e o numero  de horas trabalhadas no mes. 
//Calcule e mostre o total do seu salario no referido mes

public class Exercicio08 {

	public static void main(String[] args) {

		double valorHora;
		int qtdHoras;
		double resultadoSalario;

		Scanner scan = new Scanner(System.in);
		System.out.println("Quanto voce recebe por hora ?");
		valorHora = scan.nextDouble();
		System.out.println("Quantas horas voce trabalha no mes ?");
		qtdHoras = scan.nextInt();
		resultadoSalario = valorHora * qtdHoras;
		System.out.println("O valor total do seu salario no mes: " + resultadoSalario);
		scan.close();
	}
}
