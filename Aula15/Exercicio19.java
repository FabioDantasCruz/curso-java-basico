package exercicios.Aula15;

import java.util.Scanner;

//Descrição do exercicio proposto
//19 -Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação ele deseja realizar. 
//O resultado da operação deve ser acompanhado de uma frase que diga se o número é: . par ou ímpar; a. positivo ou negativo;

public class Exercicio19 {

	public static void main(String[] args) {

		int primeiroNumero;
		int segundoNumero;
		Scanner scan = new Scanner(System.in);
		double resultado = 0;
		boolean valida = true;
		String operacao;
		System.out.println("Digite o primeiro numero: ");
		primeiroNumero = scan.nextInt();
		System.out.println("Digite o segundo numero: ");
		segundoNumero = scan.nextInt();
		System.out.println("Digite a operação a ser realizada ");
		System.out.println("(+) para adição " + "(-) para subtração " + "(/) para divisão " + "(*) para multiplicação");
		operacao = scan.next();
		
		switch (operacao) {
		case "+":
			resultado = primeiroNumero + segundoNumero;
			break;
		case "-":
			resultado = primeiroNumero - segundoNumero;
			break;
		case "/":
			resultado = primeiroNumero / segundoNumero;
			break;
		case "*":
			resultado = primeiroNumero * segundoNumero;
			break;
		default:
			System.out.println("Operação Invalida");
			valida = false;
		}
		
	
		if(valida) {
			System.out.println("Resultado:" + resultado);
			if(resultado >=0) {
				System.out.println("Resultado positivo");
			}else {
				System.out.println("Resultado negativo");
				
			}
			
			if(resultado % 2 == 0) {
				System.out.println("Resultado par");
			}else {
				System.out.println("Resultado impar");
			}
		}
		scan.close();
	}

}
