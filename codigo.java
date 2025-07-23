package atvidade_IF;

import java.util.Scanner;

public class atv_05 {
	public static void main(String[] args) {
		java.util.Scanner nota = new java.util.Scanner(System.in);

		System.out.println("Qual foi a sua nota final:? ");
		float num = nota.nextFloat();
		
		if (num >= 7) {
			System.out.println("Parabéns! você está aprovado ");

		//Colocando mais uma opção que possibilite a realização de uma recuperação ao aluno com nota maior que 4

		}elif (num > 4) {
			System.out.println("Você está em recuperação.")
		
		//Se a nota for menor que 4 aí ele estará em recuperação

		}else {
			System.out.println("BUÁ BUÁ, você está reprovado ");
			
			nota.close();
		}
	}
}
