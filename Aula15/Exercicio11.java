package exercicios.Aula15;

import java.util.Scanner;

//Descrição do exercicio proposto
//11 - Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, 
//baseado no salário atual:
//salários até R$ 280,00 (incluindo) : aumento de 20% 
//salários entre R$ 280,00 e R$ 700,00 : aumento de 15% 
//salários entre R$ 700,00 e R$ 1500,00 : aumento de 10% 
//salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado, informe na tela: 
//salário antes do reajuste; o o percentual de aumento aplicado; o o valor do aumento; o o novo salário, após o aumento.


public class Exercicio11 {

	public static void main(String[] args) {

		double salario;
		double novoSalario = 0;
		double percentual = 0;
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o valor do salario: ");
		salario = scan.nextDouble();
		
		if(salario <= 280) {
			percentual = 0.20;
			novoSalario = salario + (salario * percentual);
		}else if((salario > 280) && (salario <= 700)) {
			percentual = 0.15;
			novoSalario = salario + (salario * percentual);
		}else if ((salario > 700) && (salario <= 1500)) {
			percentual = 0.10;
			novoSalario = salario + (salario * percentual);
		}else {
			percentual = 0.05;
			novoSalario = salario + (salario * percentual);
		}
		
		System.out.println("O salario antes do ajuste: " + salario);
		System.out.println("O percentual de aumento aplicado: " + percentual);
		System.out.println("O novo salário, após o aumento.: " + novoSalario);
		
		scan.close();

	}

}
