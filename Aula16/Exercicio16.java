package exercicios.Aula16;

//Descrição do exercicio proposto
//A série de Fibonacci é formada pela seqüência 0,1,1,2,3,5,8,13,21,34,55,... Faça um programa que gere a série até
//que o valor seja maior que 500.

public class Exercicio16 {

	public static void main(String[] args) {

		int ultimo = 0;
		int penultimo = 1;
		int termo = 0;

		while (termo <= 500) {

			termo = ultimo + penultimo;
			System.out.println(termo);
			penultimo = ultimo;
			ultimo = termo;

		}

	}

}
