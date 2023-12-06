package utils;

import java.util.Scanner;


/*
 * Classe utilitaria de User Interface (Ui)
 * 
 * */
public class Ui {
	
	/**
	 * pede ao utilizador um número, valida-o e retorna-o
	 * 
	 * @param askMessage - String com o texto a apresentar ao utilizador
	 * @param scanner - objeto Scanner para entrada de dados, a partir de System.in 
	 * @return número inteiro
	 */
	public static int askAndValidateIntInput(String askMessage, Scanner scanner) {
		int value = 0;
		boolean askAgain = true;
		
		System.out.print(askMessage);
		while(askAgain) 
		{
			if (scanner.hasNextInt()) 
			{
				value = scanner.nextInt();
				if(value < 1) {
					System.out.println("Introduza um número >= 1.");
					askAgain = true;
				}
				else {
					askAgain = false;
					break;
				}
			} 
			else {
				System.out.println("Número inválido! Introduza novamente.");
				scanner.next();
				askAgain = true;
			}
		}
		
		return value;
	}

}
