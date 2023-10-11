// - Algoritmo que mostra o reajuste salarial de 10% dos salario para quem tem menos de 5 anos
// - mostra o reajuste salario para funcionarios com = ou superior a 5 anos de 20%

import javax.swing.JOptionPane;

public class ex09ReajusteSalarioBonus {

	public static void main(String[] args) {

		// - Declaração variaveis

		float salario, bonus, sal_reajustado; 
		int tempo;

		// - Entrada de dados
		// - Conversão do campo dialog para INTEGER E FLOAT que tem por default receber string,
		

		tempo = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira quanto tempo (anos) você trabalha: "));

		salario = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o seu salário atual: ")); 

		if (tempo >= 5 ) {
			
			// - quem trabalha igual ou acima de 5 anos recebe reajuste de 20%
			bonus = salario * 0.20f;
			sal_reajustado = salario + bonus;

		} else {

			// - quem trabalha abaixo dos 5 anos recebe reajuste de 10%
			bonus = salario * 0.10f;
			sal_reajustado = salario + bonus;
		 
		}  

 	   JOptionPane.showMessageDialog(null, "o valor do bonus seu é: " + bonus + " sobre o salário de: " + sal_reajustado); 

	}

}