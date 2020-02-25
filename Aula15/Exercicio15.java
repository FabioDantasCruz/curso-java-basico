package exercicios.Aula15;

import java.util.Scanner;

//Descri��o do exercicio proposto
// 15 - Fa�a um Programa que pe�a os 3 lados de um tri�ngulo. O programa dever� informar se os valores podem ser um tri�ngulo. 
//Indique, caso os lados formem um tri�ngulo, se o mesmo �: equil�tero, is�sceles ou escaleno. 
//Dicas: o Tr�s lados formam um tri�ngulo quando a soma de quaisquer dois lados for maior que o terceiro; 
//Tri�ngulo Equil�tero: tr�s lados iguais; o Tri�ngulo Is�sceles: quaisquer dois lados iguais; o Tri�ngulo Escaleno: tr�s lados diferentes;

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
				System.out.println("Tri�ngulo Equil�tero");
			} else if (primeiroLado != segundoLado && primeiroLado != terceiroLado && terceiroLado != segundoLado) {
				System.out.println("Tri�ngulo Escaleno");
			} else if (primeiroLado == segundoLado || primeiroLado == terceiroLado || segundoLado == terceiroLado) {
				System.out.println("Tri�ngulo Is�celes");
			}

		} else {
			System.out.println("n�o forma um tri�ngulo");
		}
		scan.close();
	}

}
