// - Algoritmo que analisa se o numero fornecido pelo usuário é par ou impar

import javax.swing.JOptionPane;

public class ex08VerificaNumParOuImpar {

	public static void main(String[] args) { 
		
		int num;

		// - usamos a classe Integer para converter o valor default ( string ) para numeros inteiros
		num = Integer.parseInt(JOptionPane.showInputDialog(null,"Verificando se numero é PAR OU IMPAR"));

		// - Verifica se TODO numero dividido por 2 tem resto 0 ( que é positivo)
		if ( num % 2 == 0 ) {

			JOptionPane.showMessageDialog(null, "O numero " + num + " é PAR"); 

		} else {

			JOptionPane.showMessageDialog(null, "o numero " + num + " é IMPAR");
		}

   }

}