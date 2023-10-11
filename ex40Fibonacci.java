import javax.swing.JOptionPane;

class fibonacci {

	public static void main(String[] args) {
		
		// - Programa que gera uma sequencia fibonacci a partir do numero fornececido pelo usuário
		// - o limite da sequencia é determinado pelo valor fornecido pelo usuário.
			
			int num = 0;

			try {
				num = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um nº gerar sequencia fibonnacci: "));
			} catch (Exception e) {
				
				JOptionPane.showMessageDialog(null, "Certifique-se de informar valores validos ...");
				return;
			}
	
			String sequenciaFibonacci = " ";
			
			int fibAnterior = 0;
			int fibAtual = 1;

			
			sequenciaFibonacci += fibAnterior + " ";
			
			// - limite da sequencia fibonacci será determinado pelo numero digitado pelo usuário
			for (int i = 1; i < num; i++) {

				// - calcula proximo numero - fibonacci é a soma do anterior + atual 
				int proximo = fibAnterior + fibAtual;

				// - atualiza a variavel anterior com o valor da variavel atual
				fibAnterior = fibAtual;
				
				// - atualiza o valor da variavel atual que é asoma que ocorre na variavel proximo
				fibAtual = proximo;

				// - adicona o proximo numero a sequencia.
				sequenciaFibonacci += proximo + " ";

			}

			JOptionPane.showMessageDialog(null, "=> Sequencia: " + sequenciaFibonacci + "\n");
			return;
	}
}