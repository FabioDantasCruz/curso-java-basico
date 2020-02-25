package exercicios.Aula15;

import java.util.Scanner;

//Descrição do exercicio proposto
//16 - Faça um programa que calcule as raízes de uma equação do segundo grau,
//na forma ax2 + bx + c. O programa deverá pedir os valores de a, b e c e fazer as consistências, 
//informando ao usuário nas seguintes situações:
//a. Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o programa não deve fazer pedir os demais valores, sendo encerrado; 
//b. Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário e encerre o programa; 
//c. Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao usuário; 
//d. Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário

public class Exercicio16 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;
		double delta;
		double primeiroResultado;
		double segundoResultado;

		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o valor para A : ");
		a = scan.nextDouble();
		if(a == 0) {
			System.out.println("O valor é invalido");
			System.exit(0);
		}
		System.out.print("Digite o valor para B: ");
		b = scan.nextDouble();
		System.out.print("Digite o valor para C: ");
		c = scan.nextDouble();

	
		delta = (Math.pow(b, 2)) - 4 * a * c;
		System.out.println("O Delta é : " + delta);
		
		primeiroResultado = (-b + Math.sqrt(delta)) / (2 * a);
		segundoResultado = (-b - Math.sqrt(delta)) / (2 * a);

		if (delta > 0) {
			System.out.println("A Equação possui duas raízes reais e distintas \n" + "O Resultado da primeira raiz é : "
					+ primeiroResultado + "\n" + "O Resultado da segunda raiz  é : " + segundoResultado);

		} else if (delta == 0) {
			System.out.println("A Equação possui duas raízes reais iguais \n" + "O Resultado da primeira raiz é : "
					+ primeiroResultado + "\n" + "O Resultado da segunda raiz  é : " + segundoResultado);

		} else {
			System.out.println("A equação não possui raízes reais.");
		}
		scan.close();
	}

}
