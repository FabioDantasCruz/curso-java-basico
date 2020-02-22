package exercicios.Aula13;

import java.util.Scanner;

//Descri��o do exercicio proposto
//13 - Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas no m�s. 
//Calcule e mostre o total do seu sal�rio no referido m�s, sabendo-se que s�o descontados 11% para o Imposto de Renda,
//8% para o INSS e 5% para o sindicato, fa�a um programa que nos d�: 
//sal�rio bruto. a. quanto pagou ao INSS.
//b. quanto pagou ao sindicato. 
//c. o sal�rio l�quido.
//d. calcule os descontos e o sal�rio l�quido, 
//conforme a tabela abaixo: + Sal�rio Bruto : R$ - IR (11%) : R$ - INSS (8%) : R$ - Sindicato ( 5%) : R$ = Sal�rio Liquido : R$
//  Obs.: Sal�rio Bruto - Descontos = Sal�rio L�quido. 


public class Exercicio13 {

	public static void main(String[] args) {
	
		double valorHora;
		int qtdHoras;
		double salarioBruto;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Quanto voc� recebe por hora ?");
		valorHora = scan.nextDouble();
		System.out.println("Quantas horas voc� trabalha no m�s? ");
		qtdHoras = scan.nextInt();
		salarioBruto = valorHora * qtdHoras;
		double inss = (salarioBruto/100) * 8;
		double sindicato  = (salarioBruto/100) * 5;
		double ir  = (salarioBruto/100) * 11;
		double totalDescontos = inss + sindicato +ir;
		double salarioLiquido  = salarioBruto-totalDescontos;
		
		System.out.println("O valor total do seu salario bruto no m�s �: " + salarioBruto);
		System.out.println("O valor pago ao INSS: " + inss);
		System.out.println("O valor pago ao Sindicado: " + sindicato);
		System.out.println("O valor pago de imposto de renda: " + ir);
		System.out.println("O valor total de descontos �: " + totalDescontos);
		
		System.out.println("O valor total do seu salario liquido no m�s �: " + salarioLiquido);

		scan.close();
		
	}
}
