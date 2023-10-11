import javax.swing.JOptionPane;

class GerarNumereos {

	public static void main(String[] args) {
		
		int numInicial, numFinal;

		try {
			numInicial= Integer.parseInt(JOptionPane.showInputDialog(null, "Informe 1º: "));
			numFinal = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe 2º: "));
		
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Certifique-se de fornecer numeros validos ... ");
			return;
		}
		// - verifica se numInicial é maior que numFinal, se verdadeira, emite um alerta
		if (numInicial > numFinal) {

			JOptionPane.showMessageDialog(null, "Sequência de numeros invalidas ...");
			return;
		}	
			
		// - declaração variavel de tipo string que armazenará varios outros valores sem somar eles na saida.
		String sequenciaNums = " ";
		String sequenciaPares = " ";
		String sequenciaImpares = " ";
		String divImpares3 = " ";	
		String divImpares7 = " ";	
		
		float mediaTotal = 0f;
		float sequenciaMedia = 0f; 
		int numPar = 0;	
		
		// - enquanto condição verdadeira, executa o bloco de comandos
		while (numInicial <= numFinal) {
			
			//  - mostrar a quantidade de numeros inteiros a partir de numInicial até numFinal
			sequenciaNums += numInicial + " "; 
		
			// - Verifica se os numeros são pares   
			if (numInicial % 2 == 0) {
				// - seqquenciaPares ira acumular de forma concatenada os valores repassados pela variavel numInicial a cada passagem.
				sequenciaPares += numInicial + " ";
			
			} else {
				// - sequenciaPares irá acumular a sequencia de valores impares sem soma-los a cada passagem da variavel numInicial
				sequenciaImpares += numInicial + " ";
			}	

		  	if (numInicial % 3 == 0) {
		  		// - divImpares3 ira acumular a squencia de valores impares, sem soma-los, que são divisiveis por 3
		  		divImpares3 += numInicial + " ";
		  	}	
			
		  	if (numInicial % 7 == 0){
		  		// - divImpares7 ira acumular a sequencia de valores impares, sem soma-los, que são divisveis por 7
		  		divImpares7 += numInicial + " ";
		  	}	
	
			// - acumula soma dos numeros (numInicial até numFinal) enquanto percorre o looping
			sequenciaMedia += numInicial;
			mediaTotal = sequenciaMedia / numInicial;	

		
			// - é o contador - ele iria incrementar a proximo valor digitado pelo usuário
			numInicial++;
		}

		// -a variavel mostra a quantidade total de elementos digitados. foi decrementado -1 pq a variavel numInicial estava incrementando +1, então sempre ficava com 1 a mais do que a quantidade exata.
		int numQuantidade = --numInicial;
		
		// - Saida 
		// - numInicial mostra a entrada do usuário. numFinal mostra o numero limite. sequenciaNums mostra toda a sequencia de numeros entre numInicial e numFinal 	
		JOptionPane.showMessageDialog(null, "=> Sequencias de numeros de: " + sequenciaNums + "\n" + 
		"=> Quantidade total de Numeros: " + numQuantidade + "\n" + 
		"=> Numeros pares: " + sequenciaPares + "\n" + 
		"=> Numeros Impares: " + sequenciaImpares + "\n" +
		"=> Numeros Impares diviseis por 3: " + divImpares3 + "\n" +
		"=> Numeros Impares divisiveis por 7: " + divImpares7 + "\n" +
		"=> Media da sequencia: " + mediaTotal);
		return;

	}
}