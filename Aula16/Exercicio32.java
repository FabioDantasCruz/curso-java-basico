package exercicios.Aula16;

import java.util.Scanner;

//Descrição do exercicio proposto
/* 32 -O cardápio de uma lanchonete é o seguinte:
o Especificação Código Preço
o Cachorro Quente 100 R$ 1,20
o Bauru Simples 101 R$ 1,30
o Bauru com ovo 102 R$ 1,50
o Hambúrguer 103 R$ 1,20
o Cheeseburguer 104 R$ 1,30
o Refrigerante 105 R$ 1,00
Faça um programa que leia o código dos itens pedidos e as quantidades desejadas.
Calcule e mostre o valor a ser pago por item (preço * quantidade) e o total geral do pedido. 
Considere que o cliente deve informar quando o pedido deve ser encerrado. 
 */

public class Exercicio32 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean naoTerminar = true;
		int codigo;
		int quantidade;
		double total = 0;
		String registro = "";

		do {

			System.out.println("Digite o código: ");
			codigo = scan.nextInt();
			System.out.println("Digite a quantidade: ");
			quantidade = scan.nextInt();

			if (codigo == 0 && quantidade == 0) {
				naoTerminar = false;
				registro += "Total a pagar = " + total;
			} else {

				if (codigo == 100) {
					registro += "Cachorro Quente -> 1,20 * " + quantidade;
					registro += " = " + (1.2 * quantidade) + "\n";
					total += 1.2 * quantidade;
				} else if (codigo == 101) {
					registro += "Bauru Simples -> 1,30 * " + quantidade;
					registro += " = " + (1.3 * quantidade) + "\n";
					total += 1.3 * quantidade;
				} else if (codigo == 102) {
					registro += "Bauru com ovo -> 1,50 * " + quantidade;
					registro += " = " + (1.5 * quantidade) + "\n";
					total += 1.5 * quantidade;
				} else if (codigo == 103) {
					registro += "Hambúrguer -> 1,20 * " + quantidade;
					registro += " = " + (1.2 * quantidade) + "\n";
					total += 1.2 * quantidade;
				} else if (codigo == 104) {
					registro += "Cheeseburguer -> 1,30 * " + quantidade;
					registro += " = " + (1.3 * quantidade) + "\n";
					total += 1.3 * quantidade;
				} else if (codigo == 105) {
					registro += "Refrigerante -> 1,00 * " + quantidade;
					registro += " = " + (1 * quantidade) + "\n";
					total += 1 * quantidade;
				}
			}

		} while (naoTerminar);

		System.out.println(registro);
		scan.close();
	}

}
