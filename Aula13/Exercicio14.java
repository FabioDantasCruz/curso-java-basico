package exercicios.Aula13;

import java.util.Scanner;

//Descri�ao do exercicio proposto
//14 - Fa�a um Programa que pe�a o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps), 
//calcule e informe o tempo aproximado de download do arquivo usando este link

public class Exercicio14 {

	public static void main(String[] args) {

		double tamanhoArquivo;
		double velocidadeInternet;
		double tempo;

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o tamanho do arquivo em MB: ");
		tamanhoArquivo = scan.nextDouble();
		System.out.print("Digite a velocidade da internet");
		velocidadeInternet = scan.nextDouble();
		tempo = tamanhoArquivo / velocidadeInternet;
		System.out.print("O tempo aproximado para concluir o download �: " + tempo);
		scan.close();
	}

}
