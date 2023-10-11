import javax.swing.JOptionPane;


class VerMaiorNum {

	public static void main(String[] args) {
		

		int num1, num2, num3, num4;

		String tela = "******************** PROGRAMA COMPARA VALORES E MOSTRA O MAIOR **********************" + "\n\n";
		
		JOptionPane.showMessageDialog(null, tela);

		// - entrada de dados 
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o 1º valor:"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o 2º valor:"));
		num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o 3º valor:"));
		num4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o 4º valor:"));

		try {
				
				if ((num1 > num2) && (num1 > num3) && (num1 > num4)) {

					JOptionPane.showMessageDialog(null, "o valor " + num1 + " é o maior entre os informados");
					System.exit(0);
			
				} else if ((num2 > num1) && (num2 > num3) && (num2 > num4)) {

					JOptionPane.showMessageDialog(null, "o valor " + num2 + " é maior entre os informados");
					System.exit(0);

				} else if ((num3 > num1) && (num3 > num2) && (num3 > num4)) {

					JOptionPane.showMessageDialog(null, "o valor " + num3 + " é maior entre os informados");
					System.exit(0);

				} else if ((num4 > num1) && (num4 > num2) && (num4 > num3)) {

					JOptionPane.showMessageDialog(null, "o valor " + num4 + " é maior entre os informados");
					System.exit(0);
			
				} else {

					JOptionPane.showMessageDialog(null, "Não existe um numero maior");
					System.exit(0);
				} 
		    
		    } catch (Exception e) {

			JOptionPane.showMessageDialog(null, "Informe um valor valido");
			System.exit(0);
		}
	}
}