package exercicios.Aula15;

import java.util.Scanner;

//Descri��o do exercicio proposto
//Fa�a um programa para o c�lculo de uma folha de pagamento, sabendo que os descontos s�o do Imposto de Renda, 
//que depende do sal�rio bruto (conforme tabela abaixo) e 3% para o Sindicato 
//e que o FGTS corresponde a 11% do Sal�rio Bruto, mas n�o � descontado (� a empresa que deposita). 
//O Sal�rio L�quido corresponde ao Sal�rio Bruto menos os descontos.
//O programa dever� pedir ao usu�rio o valor da sua hora e a quantidade de horas trabalhadas no m�s. 
//Desconto do IR:  Sal�rio Bruto at� 900 (inclusive) - isento 
//Sal�rio Bruto at� 1500 (inclusive) - desconto de 5% 
//Sal�rio Bruto at� 2500 (inclusive) - desconto de 10%
// Sal�rio Bruto acima de 2500 - desconto de 20%

public class Exercicio12 {

	public static void main(String[] args) {

		double valorHora;
		int qtdHoras;
		double salarioBruto;
		double salarioLiquido;
		double fgts;
		double percentualIR = 0;
		double descontoIR;
		double descontoSindicato;
		double inss;
		double totalDescontos;

		Scanner scan = new Scanner(System.in);
		System.out.println("Quanto voc� recebe por hora ?");
		valorHora = scan.nextDouble();
		System.out.println("Quantas horas voc� trabalha no m�s? ");
		qtdHoras = scan.nextInt();
		salarioBruto = valorHora * qtdHoras;
		if (salarioBruto <= 900) {
			descontoIR = 0;
		} else if (salarioBruto <= 1500) {
			percentualIR = 0.05;
		} else if (salarioBruto <= 2500) {
			percentualIR = 0.10;

		} else {
			percentualIR = 0.20;
		}
		descontoSindicato = salarioBruto * 0.03;

		descontoIR = salarioBruto * percentualIR;
		fgts = salarioBruto * 0.11;
		inss = salarioBruto * 0.10;
		totalDescontos = inss + descontoIR + descontoSindicato;
		salarioLiquido = salarioBruto - totalDescontos;

		System.out.println("Salario Bruto: (" + valorHora + " * " + qtdHoras + ") :" + " R$ " + salarioBruto);
		System.out.println("(-)IR + (" + percentualIR + ") : " + " R$ " + descontoIR);
		System.out.println("(-)INSS (10%) : " + " R$ " + inss);
		System.out.println("FGTS (11%) : " + " R$ " + fgts);
		System.out.println("O valor pago ao Sindicado: " + " R$ " + descontoSindicato);
		System.out.println("O valor total de descontos �: " + " R$ " + totalDescontos);
		System.out.println("O valor total do seu salario liquido no m�s �: " + " R$ " + salarioLiquido);

		scan.close();

	}

}
