import javax.swing.JOptionPane;

class MediaAlunoWhile {


	public static void main(String[] args) {
		
		float num, media, soma;
		int contador;

		soma = 0f;
		contador = 0;
		
		
		// - função while repetira 10 vezes enquanto a condição for verdadeira, enquanto contador for menor que 10;
		while (contador < 10) {

			num = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe um numero: "));
			
			// - Soma ira armazenará 10 entradas do usuário - aqui pode ser usado também soma += num
			soma = soma + num;
			
			// - variavel de controle de repetições, irá incrementar +1 9 vezes - aqui pode ser usado também contador++
			contador = contador + 1;
			
			// - mostra uma mensagem em cada passagem do looping mostrando quantas vezes esta passando
			JOptionPane.showMessageDialog(null, "Nº o contador de vezes: " + contador);
		}	

		media = soma / contador;	

		JOptionPane.showMessageDialog(null, "a media é: " + media);

		System.exit(0);
	}

}