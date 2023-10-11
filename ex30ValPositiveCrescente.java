import javax.swing.JOptionPane;


class ValoresCresentes {

	public static void main(String[] args) {
		

		int a, b, c; 

		String tela = "********************* PROGRAMA VERFICA INTEIROS E ORDENA ********************************** " + "\n\n";

		JOptionPane.showMessageDialog(null, tela);

		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe valor de a: "));
		b = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe valor de b: "));
		c = Integer.parseInt(JOptionPane.showInputDialog(null, "informe valor de c: "));

		try {

			// - compara o 1º valor com todos os outros 2 campos - se verdadeiro executa bloco
			 if (a > b && a > c) {

					if (b > c) {
			 		
						JOptionPane.showMessageDialog(null, "Sequencia em ordem crescente: " +
			 			"=> 2º: " + a +
			 			"=> 2º: " + b +
			 			"=> 3º: " + c);
					}
			 // - Compara o 2º valor com todos os outros campos - se verdadeiro executa bloco
			 }  else if (b > a && b > c) {

			 		// - Compara 3º valor  com 1º valor - se verdadeiro executa bloco
			 		if (c > a) {
			 			
			 			JOptionPane.showMessageDialog(null, "Sequencia em ordem crescente: " +
			 			"=> 1º: " + b +
			 			"=> 2º: " + c +
			 			"=> 3º: " + a);
			
			        }
			 
			 // - compara 3º valor com todos os outros campos - se verdadeiro executa bloco
			 } else if (c > a && c > b)  {

			 	// - compara o 1º valor com 2º - se verdadeiro executa bloco
			 	if (a > b) {

			 		JOptionPane.showMessageDialog(null, "Sequencia em ordem crescente: " +
			 			"=> 1°: " + c +
			 			"=> 2º: " + a +
			 			"=> 3º: " + b); 
			 	}
			 
			 } else {

			 		JOptionPane.showMessageDialog(null, "Campos com valores iguais");
			 		System.exit(0);
			 }

		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "Certifique-se de informar valores validos");
			System.exit(0);
		}

	}
}