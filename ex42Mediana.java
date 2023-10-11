import javax.swing.JOptionPane;
// - Algoritmo tem a finalidade de encontrar a mediana de uma sequencia de numeros
// - lembrando, para numeros imparares a regra é uma 
// - e para numeros pares a regra é outra.

class Mediana {

	public static void main(String[] args) {
		
		int numInicial = 0, numFinal = 0;
		float mediana = 0f;
		
		try {
			
			numInicial = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe numero inicial: "));
			numFinal = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe numero final: "));	
		
		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "Certifique-se de informar valor valido ...");
			return;
		}
	
		// - irá armazenar a sequencia dos elementos.
		// - o tambanho do array sequencia sera determinado pelo total de elementos do calculo NumInicial e numFinal
		// - +1 é para assegurar que serão contado todos os elementos.
		int[] sequencia = new int[numFinal - numInicial + 1]; 
		// - a variavel de controle [i] percorrerá todos os elementos de numInicial até numFinal
		for (int i = numInicial; i <= numFinal; i++) {
			// - array sequencia recebe o valor de var i no indice 0
			// - exemplo: se [i] = 5 e numInicial fosse 2, então [i - numInicial] será 3. 5 ocupará a terceira posição
			sequencia[i - numInicial] = i;
		}
		// - var quantElementos esta recebendo o numero total de elementos da sequencia.
		int quantElementos = sequencia.length;
		// - se NÃO for PAR.	
		if (quantElementos % 2 != 0) {
			mediana = sequencia[quantElementos / 2];
			
		} else {
			// - Se for PAR
		}	float sequenciaPart1 = sequencia[quantElementos / 2];
			float sequenciaPart2 = sequencia[quantElementos / 2 + 1];
			
			mediana = (sequenciaPart1 + sequenciaPart2) / 2;
		}	

		// - var sequenciaString formatará melhor a saida 
		String sequenciaString = " ";

		// - enquanto var [i] menor que o cumprimento total do array sequencia, soma +1
		for (int i = 0; i < sequencia.length; i++) {

			// - sequencia string é a var que formatara a saida dos elementos que estão no array sequencia
			sequenciaString += sequencia[i];
		}
		JOptionPane.showMessageDialog(null, "=> Sequencia: " + sequenciaString + "\n" + 
											"=> Quantidade elementos: " + quantElementos + "\n" +
											"=> Mediana: " + mediana);
	}

}