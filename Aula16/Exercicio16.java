package exercicios.Aula16;

//Descri��o do exercicio proposto
//A s�rie de Fibonacci � formada pela seq��ncia 0,1,1,2,3,5,8,13,21,34,55,... Fa�a um programa que gere a s�rie at�
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
