import javax.swing.JOptionPane;


class VerificaImparOuPar {

	public static void main(String[] args) {
		

		int verificaParImpar = 0, mult;

		String tela = "****************** VERIFICADOR Nº IMPAR OU PAR ****************** " + "\n\n";

		JOptionPane.showMessageDialog(null, tela);


		try {

			verificaParImpar = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um valor para verificar: "));

			if ( verificaParImpar % 2 != 0 ) { 

	    		JOptionPane.showMessageDialog(null, "Numero " + verificaParImpar + " é impar");

	    	} else {

	    		JOptionPane.showMessageDialog(null, "Infelizmente o valor " + verificaParImpar + " é um numero par, não podemos continuar...");
	    		System.exit(0);
	    	} 	
		

		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "Certifique-se de usar um dado valido ...");
			System.exit(0);
		} 

		
		try {

			mult = Integer.parseInt(JOptionPane.showInputDialog(null, "Descubra se é muultiplo por: "));

				if (verificaParImpar % mult == 0 ) {

				JOptionPane.showMessageDialog(null, "o numero: " + mult + " é multiplo de: " + verificaParImpar);
				System.exit(0);

				} else {

				JOptionPane.showMessageDialog(null, "o numero: " + mult + "  não é multiplo de: " + verificaParImpar);
				
				}	
			

		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "Certifique-se de informar dados validos ...");
			System.exit(0);
		}

	}
}