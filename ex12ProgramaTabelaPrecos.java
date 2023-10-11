import javax.swing.JOptionPane;

public class ex12ProgramaTabelaPrecos {

	public static void main(String[] args) {

		int codigo;

		codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o codigo da mercadoria: "));

		switch (codigo) {

		case 001: JOptionPane.showMessageDialog(null, "Produto é um Caderno");
			break;

		case 002: JOptionPane.showMessageDialog(null, "Produto é Lápis");
			break;

		case 003: JOptionPane.showMessageDialog(null, "Produto é uma borracha");
			break;

		default: JOptionPane.showMessageDialog(null, "Diversos");
			
		}
	}
}