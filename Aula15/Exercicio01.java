package exercicios.Aula15;

import java.util.Scanner;

//Descri��o do exercicio proposto
//1 - Fa�a um Programa que pe�a dois n�meros e imprima o maior deles.


public class Exercicio01 {

	public static void main(String[] args) {
		

		double primeiroNumero;
		double segundoNumero;
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o primeiro numero ");
		primeiroNumero = scan.nextDouble();
		System.out.print("Digite o segundo numero ");
		segundoNumero = scan.nextDouble();
		
		if(primeiroNumero > segundoNumero) {
			System.out.print("O maior numero � : " + primeiroNumero);
		}else {
			System.out.print("O maior numero � : " + segundoNumero);
		}
		
		scan.close();
		
	}

}
