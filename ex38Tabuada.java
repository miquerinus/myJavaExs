import javax.swing.JOptionPane;


class Tabuada {

	public static void main(String[] args) {
		
		int num;

		// - entrada de informações do usuário, caso algum valor errado emite mensagem de erro.
		try {
	
			num = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um numero para gerar tabuada: "));
		
		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "Certifique-se de informar dado validos ....");
			return;
		}

		int result = 0;
		// - inicializar o contador em 1 para não multiplicar num * cont por 0;
		int cont = 1;
	
		// - Inicializa uma string vazia para acumular a tabuada
		String tabuada = ""; 	
		

		// - looping while: enquanto condição verdadeira; cont <= num digitado pelo usuário o bloco é executado.
		while (cont <= num ) {

			// - result recebe o numero digitado pelo usuário multiplicado pelo contador até no maximo o numero informado pelo usuário
			result = num * cont;
			
			// - A saida será formata conforme o numero digitado pelo usuário. Exemplo. Se usuário digitar 4. A saida será 4 x o numero do cont++(1, 2, 3, 4); 
			tabuada += num + " x " + cont + " = " + result + "\n";	
			cont++;
		}

	 // - saida da tabuada gerada pelo looping while determinada pelo numero informado de vezes pelo usuário.
	 JOptionPane.showMessageDialog(null, "=> Tabuada de: " + num + ": \n" + tabuada);
	 	
	} 
}