// - Programa que solicita nome do usuário 
// - Solicita a entrada de 2 valores inteiros
// - Mostra a saida dos valores inteiros ao usuário

// - importamos o pacote para trabalharmos com modo grafico
import javax.swing.JOptionPane;

public class ex07SomandoValores {

	public static void main(String[] args) {

		
		// - Declaração de variaveis e seus tipos
		String nome;
		int num01, num02, soma;

		
		// - VER DEPOIS SE É POSSIVEL COLOCAR EXCEÇÕES -
		
		nome = JOptionPane.showInputDialog("Qual seu nome: ");

		// - Por default a caixa de dialogo aceita dados do tipo String
		// - Integer.parseInt é a conversão de um tipo string para inteiro
		// - Integer é uma classe e parseInt é seu metodo (ação)
		// - variavel num01 e num02 estão, portando, armazenando valores convertidos para tipo inteiro para ser processados depois 
		num01 = Integer.parseInt(JOptionPane.showInputDialog("Insira 1º valor: "));

		num02 = Integer.parseInt(JOptionPane.showInputDialog("Insira 2º valor:"));

		// - processamento 
		soma = num01 + num02;

		// - Saida com uso da classe JOptionPane com seu metodo showMessageDialog em modo grafico
		JOptionPane.showMessageDialog(null, "Ola " + nome + "a soma dos valores inseridos é: " + soma);
	}
}