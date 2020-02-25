package exercicios.Aula15;

import java.util.Scanner;

//Descri��o do exercicio proposto
//16 - Fa�a um programa que calcule as ra�zes de uma equa��o do segundo grau,
//na forma ax2 + bx + c. O programa dever� pedir os valores de a, b e c e fazer as consist�ncias, 
//informando ao usu�rio nas seguintes situa��es:
//a. Se o usu�rio informar o valor de A igual a zero, a equa��o n�o � do segundo grau e o programa n�o deve fazer pedir os demais valores, sendo encerrado; 
//b. Se o delta calculado for negativo, a equa��o n�o possui raizes reais. Informe ao usu�rio e encerre o programa; 
//c. Se o delta calculado for igual a zero a equa��o possui apenas uma raiz real; informe-a ao usu�rio; 
//d. Se o delta for positivo, a equa��o possui duas raiz reais; informe-as ao usu�rio

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
			System.out.println("O valor � invalido");
			System.exit(0);
		}
		System.out.print("Digite o valor para B: ");
		b = scan.nextDouble();
		System.out.print("Digite o valor para C: ");
		c = scan.nextDouble();

	
		delta = (Math.pow(b, 2)) - 4 * a * c;
		System.out.println("O Delta � : " + delta);
		
		primeiroResultado = (-b + Math.sqrt(delta)) / (2 * a);
		segundoResultado = (-b - Math.sqrt(delta)) / (2 * a);

		if (delta > 0) {
			System.out.println("A Equa��o possui duas ra�zes reais e distintas \n" + "O Resultado da primeira raiz � : "
					+ primeiroResultado + "\n" + "O Resultado da segunda raiz  � : " + segundoResultado);

		} else if (delta == 0) {
			System.out.println("A Equa��o possui duas ra�zes reais iguais \n" + "O Resultado da primeira raiz � : "
					+ primeiroResultado + "\n" + "O Resultado da segunda raiz  � : " + segundoResultado);

		} else {
			System.out.println("A equa��o n�o possui ra�zes reais.");
		}
		scan.close();
	}

}
