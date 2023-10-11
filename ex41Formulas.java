import javax.swing.JOptionPane;

class DuasFormulas {

	public static void main(String[] args) {
		
		int n;

		try {

			 n = Integer.parseInt(JOptionPane.showInputDialog(null, "informe algum valor: "));

		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "Certifique-se de informar valores validos ...");
			return;
		}

		
		while (n != 1) {

			if (n % 2 == 0) {
		
				n += 2;
				JOptionPane.showMessageDialog(null, "=> É par: " + n);
				return;
			
			} else if ( n % 3 == 0) {

				n = n * 3 + 1;
				JOptionPane.showMessageDialog(null, "=> É Impar: " + n);
				return;

			} else {

				JOptionPane.showMessageDialog(null, "ERROR: valor não é divisivel por 2 ou 3 ... ");
				return;
			} 
		}
	
	}
}