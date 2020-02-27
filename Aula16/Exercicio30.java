package exercicios.Aula16;

import java.util.Scanner;

//Descrição do exercicio proposto
//Desenvolva um programa que faça a tabuada de um número qualquer inteiro que será digitado pelo usuário,
//mas a tabuada não deve necessariamente iniciar em 1 e terminar em 10, o valor inicial e final
//devem ser informados também pelo usuário, conforme exemplo abaixo:
//Montar a tabuada de: 5 
//o Começar por: 4
//o Terminar em: 7
//
//o Vou montar a tabuada de 5 começando em 4 e terminando em 7:
//o 5 X 4 = 20
//o 5 X 5 = 25
//o 5 X 6 = 30
//o 5 X 7 = 35
//Obs: Você deve verificar se o usuário não digitou o final menor que o inicial.

public class Exercicio30 {

	public static void main(String[] args) {

		int numero;
		int resultado;
		int inicio;
		int fim;
		boolean valida = false;
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o numero que você deseja ver a tabuada: ");
		numero = scan.nextInt();

		do {
			System.out.println("Digite o de inicio: ");
			inicio = scan.nextInt();

			System.out.println("Digite o numero de termino: ");
			fim = scan.nextInt();

			if (inicio < fim) {
				valida = true;
			} else {
				System.out.println("O numero de inicio deve ser menor que o numero de termino");
			}
		} while (!valida);

		System.out.println("Vou montar a tabuada do numero: " + numero + " Começando em " + inicio + " e terminando em "
				+ fim + " :");

		for (int i = inicio; i <= fim; i++) {
			resultado = numero * i;
			System.out.println(numero + " X " + i + " = " + resultado);

		}

		scan.close();

	}

}
