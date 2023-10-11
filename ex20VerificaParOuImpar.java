import javax.swing.JOptionPane;

class VerificaNumero {

	public static void main(String[] args) {
		
		int numero;

		try {

			numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Verifique numero PAR ou IMPAR"));
		
		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "Cerfifique-se de informar valor valido.");
			return;
		}
	
		if (numero % 2 == 0) {

			JOptionPane.showMessageDialog(null, "O numero :" + numero + " é PAR");
		
		} else {

			JOptionPane.showMessageDialog(null, "O numero : " + numero + " é IMPAR");
		} 
	}
}