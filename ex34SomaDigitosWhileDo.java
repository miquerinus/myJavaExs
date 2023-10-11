import javax.swing.JOptionPane;

class DigitosInformados {

	public static void main(String[] args) {
		

		float num, soma;

		num = 0f;
		soma = 0f;
	
		// - Mensagem que aparece antes do loop do-while avisando o usuário.
		JOptionPane.showMessageDialog(null, "Para sair digite 0");	

		do {

			// - Solicita um valor para o usuário
			num = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite um numero para somar: "));

			// - acumula valores digitados pelo usuário.
			soma = soma + num;
	
			// - Mensagem de saida que mostra o valor acumulado pela variavel soma.
			JOptionPane.showMessageDialog(null, "A soma é: " + soma);	
		
		// - Enquanto a variavel - que usuário digita for DIFERENTE de 0, o laço se repetira, ira para quando usuário digitar 0
		// - a variavel num - usuário - é usada como variavel de controle.	
		} while ( num != 0);

		
		// - Mensagem de saida que é mostrada após o fim do laço while.
		JOptionPane.showMessageDialog(null, "Obrigado por usar o programa ... ");
		System.exit(0);	

	}

}