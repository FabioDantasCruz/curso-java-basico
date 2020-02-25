package exercicios.Aula15;

import java.util.Scanner;

//Descrição do exercicio proposto
//9 - Faça um Programa que leia três números e mostre-os em ordem decrescente

public class Exercicio09 {

	public static void main(String[] args) {

		int primeiroNumero;
		int segundoNumero;
		int terceiroNumero;

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o primeiro numero: ");
		primeiroNumero = scan.nextInt();
		System.out.print("Digite o segundo numero: ");
		segundoNumero = scan.nextInt();
		System.out.print("Digite o terceiro numero: ");
		terceiroNumero = scan.nextInt();

		if ((primeiroNumero >= segundoNumero) && (primeiroNumero >= terceiroNumero)
				&& (segundoNumero >= terceiroNumero)) {
			System.out.print(primeiroNumero + " - " + segundoNumero + " - " + terceiroNumero);
		} else if ((primeiroNumero >= segundoNumero) && (primeiroNumero >= terceiroNumero)
				&& (segundoNumero <= terceiroNumero)) {
			System.out.print(primeiroNumero + " - " + terceiroNumero + " - " + segundoNumero);
		} else if ((segundoNumero >= segundoNumero) && (segundoNumero >= terceiroNumero)
				&& (primeiroNumero >= terceiroNumero)) {
			System.out.print(segundoNumero + " - " + primeiroNumero + " - " + terceiroNumero);
		} else if ((segundoNumero >= primeiroNumero) && (segundoNumero >= terceiroNumero)
				&& (primeiroNumero <= terceiroNumero)) {
			System.out.print(segundoNumero + " - " + terceiroNumero + " - " + primeiroNumero);
		} else if ((terceiroNumero >= segundoNumero) && (terceiroNumero >= primeiroNumero)
				&& (primeiroNumero >= segundoNumero)) {
			System.out.print(terceiroNumero + " - " + primeiroNumero + " - " + segundoNumero);
		}
		if ((terceiroNumero >= segundoNumero) && (terceiroNumero >= primeiroNumero)
				&& (segundoNumero >= primeiroNumero)) {
			System.out.print(terceiroNumero + " - " + segundoNumero + " - " + primeiroNumero);
		}
		scan.close();
	}
}