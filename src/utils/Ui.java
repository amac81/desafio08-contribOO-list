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
	 * @param minValue - valor inteiro minimo necessario para input
	 * @return número inteiro
	 */
	public static int askAndValidateIntInput(String askMessage, Scanner scanner, int minValue) {
		int value = 0;
		boolean askAgain = true;
		
		System.out.print(askMessage);
		while(askAgain) 
		{
			if (scanner.hasNextInt()) 
			{
				value = scanner.nextInt();
				if(value < minValue) {
					System.out.println("Introduza um número >= " + minValue + ".");
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
	
	/**
	 * pede ao utilizador um número, valida-o e retorna-o
	 * 
	 * @param askMessage - String com o texto a apresentar ao utilizador
	 * @param scanner - objeto Scanner para entrada de dados, a partir de System.in
	 * @return numero decimal
	 */
	public static double askAndValidateDoubleInput(String askMessage, Scanner scanner) {
		double value = 0;
		boolean askAgain = true;
		
		System.out.print(askMessage);
		while(askAgain) 
		{
			if (scanner.hasNextDouble()) 
			{
				value = scanner.nextDouble();
				askAgain = false;
				break;				
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
