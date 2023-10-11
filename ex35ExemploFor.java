import javax.swing.JOptionPane;

class ExemploFor {

	public static void main(String[] args) {

		float soma, num, media;
		int contador;

		soma = 0f;

		// - Looping FOR. contador irá até 10.
		// - enquanto contador menor que 10, é TRUE, portanto executará todo o bloco de comandos dentro das chaves 
		for (contador = 0; contador <= 10; contador++) {
				
			// - variavel num recebe valor digitado pelo usuário
			num = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe algum nº para somar: "));
			
			// - soma é a variavel acumuladora, ela armazenará todos (somados) os numeros informados pelo usuário enquanto a condição for TRUE
			soma += num;
		
			// - mostra uma mensagem ao usuário para dizer quanto a contagem esta
			JOptionPane.showMessageDialog(null, "Contagem é: " + contador);
		}
		
		// - media é a variavel que armazenará o resultado da divisão entre soma ( todos os valores digitados ) e contador ( quantidade de vezes o contador fez = 10)
		media = soma / contador;

		// - mensagem para usuário mostrando o saldo final que esta na media.

		JOptionPane.showMessageDialog(null, "o resultado da soma é: " + media);
		System.exit(0);
	}
}