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
		
		nContribuintes = Ui.askAndValidateIntInput("Quantos contribuintes você vai digitar? ", sc, 1);
		System.out.println();
		
		do {

			//variaveis
			double rendaAnualSalario = 0.0;
			double rendaAnualPrestServicos = 0.0;
			double rendaAnualCapital = 0.0;
			double gastosMedicos = 0.0;
			double gastosEducacao = 0.0;
			
			System.out.println("Digite os dados do " + (contrib+1) + "o contribuinte: ");
			rendaAnualSalario = Ui.askAndValidateDoubleInput("Renda anual com salário: ", sc);
			rendaAnualPrestServicos = Ui.askAndValidateDoubleInput("Renda anual com prestação de serviço: ", sc);
			gastosMedicos = Ui.askAndValidateDoubleInput("Gastos médicos: ", sc);
			gastosEducacao = Ui.askAndValidateDoubleInput("Gastos educacionais: ", sc);
			
			
			
			contrib ++;
		} while(contrib < nContribuintes); 
		
		sc.close();
	}
		
}
