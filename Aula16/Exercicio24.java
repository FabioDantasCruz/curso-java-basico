package exercicios.Aula16;

//Descri��o do exercicio proposto
//24 - O Sr. Manoel Joaquim acaba de adquirir uma panificadora e pretende implantar a metodologia da tabelinha, 
//que j� � um sucesso na sua loja de 1,99. Voc� foi contratado para desenvolver o programa que monta
//a tabela de pre�os de p�es, de 1 at� 50 p�es, a partir do pre�o do p�o informado pelo usu�rio, conforme o exemplo abaixo:
//o Pre�o do p�o: R$ 0.18
//o Panificadora P�o de Ontem - Tabela de pre�os
//o 1 - R$ 0.18
//o 2 - R$ 0.36
//o ...
//o 50 - R$ 9.00

public class Exercicio24 {

	public static void main(String[] args) {

		
		System.out.println("Pre�o do p�o: R$ 0.18");
		System.out.println("Panificadora P�o de Ontem - Tabela de pre�os");
		for (int i = 1; i <= 50; i++) {
			
			 System.out.printf(i + " - R$ " + "%.2f" + "\n",(0.18*i));
		}
	}

}
