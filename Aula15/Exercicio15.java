package exercicios.Aula15;

import java.util.Scanner;

//Descrição do exercicio proposto
// 15 - Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem ser um triângulo. 
//Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno. 
//Dicas: o Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro; 
//Triângulo Equilátero: três lados iguais; o Triângulo Isósceles: quaisquer dois lados iguais; o Triângulo Escaleno: três lados diferentes;

public class Exercicio15 {

	public static void main(String[] args) {

		int primeiroLado;
		int segundoLado;
		int terceiroLado;

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro lado: ");
		primeiroLado = scan.nextInt();

		System.out.println("Digite o segundo lado: ");
		segundoLado = scan.nextInt();

		System.out.println("Digite o terceiro lado: ");
		terceiroLado = scan.nextInt();

		if (((primeiroLado + segundoLado) > terceiroLado) || ((primeiroLado + terceiroLado) > segundoLado)
				|| ((segundoLado + terceiroLado) > primeiroLado)) {

			if (primeiroLado == segundoLado && primeiroLado == terceiroLado && segundoLado == terceiroLado) {
				System.out.println("Triângulo Equilátero");
			} else if (primeiroLado != segundoLado && primeiroLado != terceiroLado && terceiroLado != segundoLado) {
				System.out.println("Triângulo Escaleno");
			} else if (primeiroLado == segundoLado || primeiroLado == terceiroLado || segundoLado == terceiroLado) {
				System.out.println("Triângulo Isóceles");
			}

		} else {
			System.out.println("não forma um triângulo");
		}
		scan.close();
	}

}
