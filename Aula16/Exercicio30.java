package exercicios.Aula16;

import java.util.Scanner;

//Descri��o do exercicio proposto
//Desenvolva um programa que fa�a a tabuada de um n�mero qualquer inteiro que ser� digitado pelo usu�rio,
//mas a tabuada n�o deve necessariamente iniciar em 1 e terminar em 10, o valor inicial e final
//devem ser informados tamb�m pelo usu�rio, conforme exemplo abaixo:
//Montar a tabuada de: 5 
//o Come�ar por: 4
//o Terminar em: 7
//
//o Vou montar a tabuada de 5 come�ando em 4 e terminando em 7:
//o 5 X 4 = 20
//o 5 X 5 = 25
//o 5 X 6 = 30
//o 5 X 7 = 35
//Obs: Voc� deve verificar se o usu�rio n�o digitou o final menor que o inicial.

public class Exercicio30 {

	public static void main(String[] args) {

		int numero;
		int resultado;
		int inicio;
		int fim;
		boolean valida = false;
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o numero que voc� deseja ver a tabuada: ");
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

		System.out.println("Vou montar a tabuada do numero: " + numero + " Come�ando em " + inicio + " e terminando em "
				+ fim + " :");

		for (int i = inicio; i <= fim; i++) {
			resultado = numero * i;
			System.out.println(numero + " X " + i + " = " + resultado);

		}

		scan.close();

	}

}
