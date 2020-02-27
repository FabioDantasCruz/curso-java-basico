package exercicios.Aula16;

import java.util.Scanner;

//Descrição do exercicio proposto
//35 - Faça um programa que mostre os n termos da Série a seguir:
//o S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m.
//Imprima no final a soma da série.


public class Exercicio35 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o valor de n");
		int numero = scan.nextInt();
		double soma = 0;
		int j =1;
		for(int i = 1; i <= numero; i++) {
			   System.out.print(i + "/" + j + " + ");
			soma += (double)i/j;;
			j+=2;
			
		}
		
		System.out.println("A soma da serie é: " +soma);
		scan.close();
	}
	

}
