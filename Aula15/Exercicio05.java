package exercicios.Aula15;

import java.util.Scanner;

//Descri��o do exercicio proposto
//5- Fa�a um programa para a leitura de duas notas parciais de um aluno.
//O programa deve calcular a m�dia alcan�ada por aluno e apresentar: 
//A mensagem "Aprovado", se a m�dia alcan�ada for maior ou igual a sete; 
//A mensagem "Reprovado", se a m�dia for menor do que sete; 
//A mensagem "Aprovado com Distin��o", se a m�dia for igual a dez.


public class Exercicio05 {

	public static void main(String[] args) {
		
		double primeiraNota;
		double segundaNota;
		double media;
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite a primeira nota: ");
		primeiraNota = scan.nextDouble();
		System.out.print("Digite a segunda nota: ");
		segundaNota = scan.nextDouble();
		
		media = (primeiraNota+segundaNota)/2;
		
		if(media == 10) {
			System.out.print("Aprovado com Distin��o");
		}else if ((media >=7) && (media < 10)) {
			System.out.print("Aprovado");
		}else {
			System.out.print("Reprovado");
		}
		
		scan.close();


	}

}
