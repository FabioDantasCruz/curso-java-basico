package exercicios.Aula16;

import java.util.Scanner;

//Descri��o do exercicio proposto
//2 - Fa�a um programa que leia um nome de usu�rio e a sua senha e n�o aceite a senha igual ao nome do usu�rio,
//mostrando uma mensagem de erro e voltando a pedir as informa��es.


public class Exercicio02 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		String usuario;
		String senha;
		boolean valida = true;
		
		
		while(valida) {
		System.out.println("Digite um nome de usuario: ");
		usuario = scan.next();
		System.out.println("Digite uma senha: ");
		senha = scan.next();
		
		if(senha.equals(usuario)) {
			System.out.println("A senha n�o pode ser igual ao nome de usuario");	
		}else {
			valida = false;
		}
		
		
		}
		scan.close();
		
	}

}
