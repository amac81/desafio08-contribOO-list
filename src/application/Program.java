/**
* Este programa le os dados de N contribuintes, armazenando-os numa lista. 
* Mostra no final, um resumo do imposto apurado
* 
* @author  Arnaldo Canelas
* @version 1.0
* @since   2023-12-06 
*/

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;
import utils.Ui;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		//Objeto Scanner para entrada de dados, a partir de System.in 
		Scanner sc = new Scanner(System.in);

		// variaveis
		int nContribuintes = 0, contrib = 0;
		
		// lista de contribuintes
		List <TaxPayer> taxPayers = new ArrayList<TaxPayer> (); 
		
		nContribuintes = Ui.askAndValidateIntInput("Quantos contribuintes você vai digitar? ", sc, 1);
		System.out.println();
		
		do {

			//variaveis
			double salaryIncome = 0.0;
			double servicesIncome = 0.0;
			double capitalIncome = 0.0;
			double healthSpending = 0.0;
			double educationSpending = 0.0;
			
			System.out.println("Digite os dados do " + (contrib+1) + "o contribuinte: ");
			salaryIncome = Ui.askAndValidateDoubleInput("Renda anual com salário: ", sc);
			servicesIncome = Ui.askAndValidateDoubleInput("Renda anual com prestação de serviço: ", sc);
			capitalIncome = Ui.askAndValidateDoubleInput("Renda anual com ganho de capital: ", sc);
			healthSpending = Ui.askAndValidateDoubleInput("Gastos médicos: ", sc);
			educationSpending = Ui.askAndValidateDoubleInput("Gastos educacionais: ", sc);
			
			// Instanciacao de TaxPayer com os dados introduzidos pelo utilizador
			TaxPayer taxPayer = new TaxPayer(salaryIncome, servicesIncome, capitalIncome, healthSpending, educationSpending);
			
			// Adicionar na lista taxPayers
			taxPayers.add(taxPayer);			
			
			contrib ++;
			
			if(nContribuintes>1)
				System.out.println();
			
		} while(contrib < nContribuintes);
		
		
		for(TaxPayer t : taxPayers) {
			System.out.println(t);			
		}
		
		sc.close();
	}
		
}
