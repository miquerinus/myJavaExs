import javax.swing.JOptionPane;

class VerificaNumero3ou7 {

	public static void main(String[] args) {
		
		int numero;

		try {

			numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um numero; "));

		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "Certifique-se de informar valor valido");
			return;
		}
	
		if (numero % 3 == 0) {

			JOptionPane.showMessageDialog(null, numero + " é multiplo de 3");

		} else if (numero % 7 == 0 ) {

			JOptionPane.showMessageDialog(null, numero + " é multiplo de 7");
		
		} else {

			JOptionPane.showMessageDialog(null, numero + " não é multipo de 3 ou de 7");
		}
	}
}