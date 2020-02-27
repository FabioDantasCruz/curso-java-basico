package exercicios.Aula16;

import java.util.Scanner;

//Descrição do exercicio proposto
//3 - Faça um programa que leia e valide as seguintes informações:
//a. Nome: maior que 3 caracteres;
//b. Idade: entre 0 e 150;
//c. Salário: maior que zero;
//d. Sexo: 'f' ou 'm';
//e. Estado Civil: 's', 'c', 'v', 'd';

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String nome = "";
		int idade = 0;
		double salario = 0;
		String sexo = null;
		String estadoCivil = "";

		boolean valida = true;

		while (valida) {
			System.out.println("Digite o nome: ");
			nome = scan.nextLine();
			if (nome.length() >= 3) {
				valida = false;
			} else {
				System.out.println("Nome invalido - O nome precisa ter mais do que 3 caracteres");
				valida = true;
			}
		}

		valida = true;

		while (valida) {
			System.out.println("Digite a idade: ");
			idade = scan.nextInt();
			if (idade >= 0 && idade <= 150) {
				valida = false;
			} else {
				System.out.println("Idade invalida - A idade precisa estar entre 0 e 150 anos");
				valida = true;
			}
		}

		valida = true;

		while (valida) {
			System.out.println("Digite o salario: ");
			salario = scan.nextDouble();
			if (salario > 0) {
				valida = false;
			} else {
				System.out.println("Salario invalido - O salario precisa ser maior que zero !!");
				valida = true;
			}
		}

		valida = true;

		while (valida) {
			System.out.println("Digite o sexo: ");
			sexo = scan.next();
			if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				valida = false;
			} else {
				System.out.println("Sexo invalido - Digite 'F' para feminino e 'M' para masculino");
				valida = true;
			}
		}

		valida = true;

		while (valida) {
			System.out.println("Digite o estado civil: ");
			estadoCivil = scan.nextLine();

			if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c")
					|| estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")) {
				valida = false;
			} else {
				System.out.println("Estado Civil invalido - Digite 'S' para Solteirx , 'C' para Casadx ,"
						+ "'V' para Viuvx e 'D' para Divorciadx");
				valida = true;
			}

		}

		switch (sexo.toLowerCase()) {
		case "f":
			sexo = "Feminino";
			break;
		case "m":
			sexo = "Masculino";
			break;
		}

		switch (estadoCivil.toLowerCase()) {
		case "s":
			estadoCivil = "Solteirx";
			break;
		case "c":
			estadoCivil = "Casadx";
			break;
		case "v":
			estadoCivil = "Viuvx";
			break;
		case "d":
			estadoCivil = "Divorciadx";
			break;
		}
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado Civil: " + estadoCivil);

		scan.close();

	}

}
