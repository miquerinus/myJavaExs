// - Programa que solicita nome do usuário.

import javax.swing.JOptionPane;

public class ex06PerguntaNome {

	public	 static void main(String[] args) {

		// - variavel nome com tipo string
		String nome;

		// - variavel nome recebe nome atraves da classe JOptionPane
		// - Usamos metodo showInputDialog 
		nome = JOptionPane.showInputDialog("Insira seu nome: ");
		
		// - chamada da classe JOptionPane
		// - Usamos metodo de saida ShowMessageDialog
		JOptionPane.showMessageDialog(null, "Seu nome é: " + nome);
	}
}