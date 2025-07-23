package atvidade_IF;

import java.util.Scanner;

public class atv_05 {
	public static void main(String[] args) {
		java.util.Scanner nota = new java.util.Scanner(System.in);
		
		/*Crie um programa que leia a nota de um aluno e verifique se ele está aprovado
		(nota maior ou igual a 6) ou reprovado.*/
		
		System.out.println("Qual foi a sua nota final:? ");
		float num = nota.nextFloat();
		
		if (num >= 6) {
			System.out.println("Parabéns! você está aprovado ");
			
		}else {
			System.out.println("BUÁ BUÁ, ");
			
			nota.close();
		}
	}
}
