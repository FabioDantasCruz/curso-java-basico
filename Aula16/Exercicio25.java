package exercicios.Aula16;

import java.util.Scanner;

//Descri��o do exercicio proposto
/*O Sr. Manoel Joaquim expandiu seus neg�cios para al�m dos neg�cios de 1,99 e agora possui uma loja de conveni�ncias. 
Fa�a um programa que implemente uma caixa registradora rudimentar.O programa dever� receber um n�mero desconhecido de valores
referentes aos pre�os das mercadorias. Um valor zero deve ser informado pelo operador para indicar o final da compra. 
O programa deve ent�o mostrar o total da compra e perguntar o valor em dinheiro que o cliente forneceu, 
para ent�o calcular e mostrar o valor do troco. Ap�s esta opera��o, o programa dever� voltar ao ponto inicial, para
registrar a pr�xima compra. A sa�da deve ser conforme o exemplo abaixo:
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

				System.out.println("Informe pre�o do produto ");
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
