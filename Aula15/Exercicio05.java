package exercicios.Aula15;

import java.util.Scanner;

//Descrição do exercicio proposto
//5- Faça um programa para a leitura de duas notas parciais de um aluno.
//O programa deve calcular a média alcançada por aluno e apresentar: 
//A mensagem "Aprovado", se a média alcançada for maior ou igual a sete; 
//A mensagem "Reprovado", se a média for menor do que sete; 
//A mensagem "Aprovado com Distinção", se a média for igual a dez.


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
			System.out.print("Aprovado com Distinção");
		}else if ((media >=7) && (media < 10)) {
			System.out.print("Aprovado");
		}else {
			System.out.print("Reprovado");
		}
		
		scan.close();


	}

}
