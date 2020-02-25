package exercicios.Aula15;

import java.util.Scanner;

//Descri��o do exercicio proposto
//11 - Fa�a um programa que recebe o sal�rio de um colaborador e o reajuste segundo o seguinte crit�rio, 
//baseado no sal�rio atual:
//sal�rios at� R$ 280,00 (incluindo) : aumento de 20% 
//sal�rios entre R$ 280,00 e R$ 700,00 : aumento de 15% 
//sal�rios entre R$ 700,00 e R$ 1500,00 : aumento de 10% 
//sal�rios de R$ 1500,00 em diante : aumento de 5% Ap�s o aumento ser realizado, informe na tela: 
//sal�rio antes do reajuste; o o percentual de aumento aplicado; o o valor do aumento; o o novo sal�rio, ap�s o aumento.


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
		System.out.println("O novo sal�rio, ap�s o aumento.: " + novoSalario);
		
		scan.close();

	}

}
