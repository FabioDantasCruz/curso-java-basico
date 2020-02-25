package exercicios.Aula15;

import java.util.Scanner;

//Descri��o do exercicio proposto
//14.Fa�a um programa que l� as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre, 
//e calcule a sua m�dia. A atribui��o de conceitos obedece � tabela abaixo: 
//o M�dia de Aproveitamento Conceito o Entre 9.0 e 10.0 A 
//o Entre 7.5 e 9.0 B 
//o Entre 6.0 e 7.5 C 
//o Entre 4.0 e 6.0 D
//o Entre 4.0 e zero E 
//O algoritmo deve mostrar na tela as notas, a m�dia, o conceito correspondente e a mensagem �APROVADO� 
//se o conceito for A, B ou C ou �REPROVADO� se o conceito for D ou E.

public class Exercicio14 {

	public static void main(String[] args) {

		double primeiraNota;
		double segundaNota;
		double media;
		String conceito = "";
		String resultado = "";
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite a primeira nota: ");
		primeiraNota = scan.nextDouble();
		System.out.print("Digite a segunda nota: ");
		segundaNota = scan.nextDouble();

		media = (primeiraNota + segundaNota) / 2;

		if ((media >= 9) && (media <= 10)) {
			conceito = "A";
			resultado = "Aprovado";
		} else if ((media >= 7.5) && (media < 9)) {
			conceito = "B";
			resultado = "Aprovado";
		} else if((media >= 6.0) && (media < 7.5)) {
			conceito = "C";
			resultado = "Aprovado";
		}else if((media >= 4.0) && (media < 6.0)) {
			conceito = "D";
			resultado = "Reprovado";
		}else if ((media >= 0.0) && (media < 4.0)) {
			conceito = "E";
			resultado = "Reprovado";
		}
		
		System.out.println("Primeira Nota: " + primeiraNota);
		System.out.println("Segunda Nota: " + segundaNota);
		System.out.println("Conceito: " + conceito);
		System.out.print("Situa��o Final: " + resultado);
		

		scan.close();
	}

}
