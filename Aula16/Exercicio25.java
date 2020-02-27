package exercicios.Aula16;

import java.util.Scanner;

//Descrição do exercicio proposto
/*O Sr. Manoel Joaquim expandiu seus negócios para além dos negócios de 1,99 e agora possui uma loja de conveniências. 
Faça um programa que implemente uma caixa registradora rudimentar.O programa deverá receber um número desconhecido de valores
referentes aos preços das mercadorias. Um valor zero deve ser informado pelo operador para indicar o final da compra. 
O programa deve então mostrar o total da compra e perguntar o valor em dinheiro que o cliente forneceu, 
para então calcular e mostrar o valor do troco. Após esta operação, o programa deverá voltar ao ponto inicial, para
registrar a próxima compra. A saída deve ser conforme o exemplo abaixo:
o Lojas Tabajara
o Produto 1: R$ 2.20
o Produto 2: R$ 5.80
o Produto 3: R$ 0
o Total: R$ 8.00
o Dinheiro: R$ 20.00
o Troco: R$ 12.00 
*/

public class Exercicio25 {

	public static void main(String[] args) {

		double preco = 1;
		double total = 0;
		double troco;
		double valorPago;
		int contaProdutos = 1;

		String registro;

		Scanner scan = new Scanner(System.in);

		registro = "Lojas Tabajara\n";
		while (true) {
			while (preco != 0) {

				System.out.println("Informe preço do produto ");
				preco = scan.nextDouble();
				total += preco;
				registro += "Produto " + contaProdutos + ": R$ " + preco + "\n";
				contaProdutos++;

			}
			registro += "Total: R$ " + total;

			System.out.println("Entre com o valor pago:");
			valorPago = scan.nextDouble();

			registro += " Dinheiro: R$ " + valorPago + "\n";

			troco = valorPago - total;

			registro += "Troco: R$ " + troco;

			System.out.println(registro);

			preco = 1;
		}
		
	}

}
