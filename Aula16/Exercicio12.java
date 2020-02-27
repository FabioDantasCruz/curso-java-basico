package exercicios.Aula16;

import java.util.Scanner;

//Descri��o do exercicio proposto
//Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer n�mero inteiro entre 1 a 10. 
//O usu�rio deve informar de qual numero ele deseja ver a tabuada. A sa�da deve ser conforme o exemplo abaixo:
//o Tabuada de 5:
//o 5 X 1 = 5
//o 5 X 2 = 10
//o ...
//o 5 X 10 = 50

public class Exercicio12 {

	public static void main(String[] args) {

		int numero;
		int resultado;
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o numero que voc� deseja ver a tabuada: ");
		numero = scan.nextInt();
		System.out.println("Tabuada do numero: " +numero);
		for (int i = 1; i <= 10; i++) {
			resultado = numero * i;
			System.out.println(numero + " X " + i + " = " + resultado);

		}

		scan.close();

	}

}
