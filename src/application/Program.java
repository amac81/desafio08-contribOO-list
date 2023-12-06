/**
* Este programa le os dados de N contribuintes, armazenando-os numa lista. 
* Mostra no final, um resumo do imposto apurado
* 
* @author  Arnaldo Canelas
* @version 1.0
* @since   2023-12-06 
*/

package application;

import java.util.Locale;
import java.util.Scanner;

import utils.Ui;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		//Objeto Scanner para entrada de dados, a partir de System.in 
		Scanner sc = new Scanner(System.in);

		// variaveis
		int nContribuintes = 0, contrib = 0;
		
		nContribuintes = Ui.askAndValidateIntInput("\nQuantos turnos você deseja executar? ", sc);
		
		//torneio
		do {
			contrib ++;
			
			System.out.println("Teste");			
			
		} while(contrib < nContribuintes); 
		
		sc.close();
	}
		
}
