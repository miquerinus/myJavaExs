import javax.swing.JOptionPane;

class RefazendoExemplo52 {

	public static void main(String[] args) {
		
		float num;
		float soma = 0;
		int continuar = 0;
		
		try {
			do {
				num = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe numeros: "));
				soma += num;
		
				 if (num == 0 ) {

				 	continuar = Integer.parseInt(JOptionPane.showInputDialog(null, "Voce quer continuar ? Se sim aperte 1 - No aperte 0"));

				 	if (continuar == 1) {
						// - retorna para o fluxo normal do looping do-while
						continue;
				 	
				 	} else if (continuar == 0) {

				 		JOptionPane.showMessageDialog(null, "=> Sua soma foi: " + soma); 
				 		// - Encerra o looping e vai para mensagem final 
				 		break;	
				 	
				 	} else {
						// - quando há entrada de dados desconhecidos
				 		JOptionPane.showMessageDialog(null, "Error: Informações desconhecida");
				 		return;
				 	} 
				 }	
			// - criamos um looping infinito
			} while (true); 
		
		} catch (Exception e) {
			// - caso o usuário informar um dado diferente de numeros inteiros
			JOptionPane.showMessageDialog(null, "Certifique-se de informar dados validos");
		} 

		JOptionPane.showMessageDialog(null, "=> Obrigado por usar o programa ...");
		return;
	}
}