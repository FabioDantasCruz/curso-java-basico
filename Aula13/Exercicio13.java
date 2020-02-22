package exercicios.Aula13;

import java.util.Scanner;

//Descrição do exercicio proposto
//13 - Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
//Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda,
//8% para o INSS e 5% para o sindicato, faça um programa que nos dê: 
//salário bruto. a. quanto pagou ao INSS.
//b. quanto pagou ao sindicato. 
//c. o salário líquido.
//d. calcule os descontos e o salário líquido, 
//conforme a tabela abaixo: + Salário Bruto : R$ - IR (11%) : R$ - INSS (8%) : R$ - Sindicato ( 5%) : R$ = Salário Liquido : R$
//  Obs.: Salário Bruto - Descontos = Salário Líquido. 


public class Exercicio13 {

	public static void main(String[] args) {
	
		double valorHora;
		int qtdHoras;
		double salarioBruto;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Quanto você recebe por hora ?");
		valorHora = scan.nextDouble();
		System.out.println("Quantas horas você trabalha no mês? ");
		qtdHoras = scan.nextInt();
		salarioBruto = valorHora * qtdHoras;
		double inss = (salarioBruto/100) * 8;
		double sindicato  = (salarioBruto/100) * 5;
		double ir  = (salarioBruto/100) * 11;
		double totalDescontos = inss + sindicato +ir;
		double salarioLiquido  = salarioBruto-totalDescontos;
		
		System.out.println("O valor total do seu salario bruto no mês é: " + salarioBruto);
		System.out.println("O valor pago ao INSS: " + inss);
		System.out.println("O valor pago ao Sindicado: " + sindicato);
		System.out.println("O valor pago de imposto de renda: " + ir);
		System.out.println("O valor total de descontos é: " + totalDescontos);
		
		System.out.println("O valor total do seu salario liquido no mês é: " + salarioLiquido);

		scan.close();
		
	}
}
