// - refazendo o exercicio 5.1 com teste de repetição no final.
// - looping Do-while ao menos 1 vez a instrução é executada para depois ser avaliada na condição.

import javax.swing.JOptionPane;

class VerificaNumeros {

	public static void main(String[] args) {
		

		float soma, num, media;
		
		soma = 0f;
		
		int contador = 0;
		
		do {
	
			num = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe valor para somar: "));
			soma += num;
			contador++;	
		
		} while (contador < 10);

		media = soma / contador;

		JOptionPane.showMessageDialog(null, "=> A soma dos valores é: " + soma + "\n" +
			"=> A sua media é: " + media + "\n" +
			"=> A sua contagem é: " + contador);
	}
}