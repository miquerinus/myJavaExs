import javax.swing.JOptionPane;

class ExperimentFibonacci {

	public static void main(String[] args) {
		

		int num = 0;

		try {

			num = Integer.parseInt(JOptionPane.showInputDialog(null, "informe um nº começar sequencia Fibonacci: "));

		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "Certifique-se de informar valores validos ...");
			return;
		}

		// - Sequencia Fibonnaci é a soma do numero altual com numero anterior
		// - temos que somar eles e armazenar em outro local para ser impresso
		int  anterior = 0;
		int  atual = 1;
		int  proximo; 
		 
		// - variavel tipo string ajuda na saida encadeada dos valores
		String sequenciaFibo = " "; 

		// - (i) é a variavel de controle, ela irá incrementar mais seu valor de acordo com o numero informado pelo usuário.
		for (int i = 0; i < num; i++) {
			// - variavel proximo irá armazenar a soma da variavel anterior e atual
			proximo = anterior + atual;
			// - variavel anterior é atualizada com o valor atual;
			anterior = atual;
			// - variavel atual é atualizada com proximo 
			atual = proximo; 
		 	// - variavel SequenciaFibo é atualizada com o valor de proximo.
		 	sequenciaFibo += proximo + " ";
		}	

		JOptionPane.showMessageDialog(null, "Sequencia fibonacci do de Nº: " + num + ": " + sequenciaFibo);
		return;
	}
}