import javax.swing.JOptionPane;
import java.text.DecimalFormat;

class CalcularAltura {

public static void main(String[] args) {

	float alturaPedro, alturaLucas; 

	int alturaContPedro = 150;     // - altura inicial em centimentros
	int alturaContLucas = 110; 	 // - altura inicial em centimetros	

	try {
		 alturaPedro = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira a altura de Pedro: "));
		 alturaLucas = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira a altura de Lucas: "));
	} catch (Exception e) {
		JOptionPane.showMessageDialog(null, "Certifique-se de informar valores validos ...");
		return;
	} 

	// - contador, ele responderá a diferença de anos entre os rapazes, porque a cada repetição equivale a 1 ano. 
	int anosDifere = 0;
	int anosMais = 0;
	 
	 // - Enquanto a condição for verdadeira (true) o bloco interno se repetira 
	 while (alturaContLucas <= alturaContPedro) {

		// - irá acumulando em + 3 a altura de lucas (ele cresce 3 cm ao ano)
		alturaContLucas += 3;
		// - irá acumulando em + 2 a altura de Pedro (ele cresce 2 cm ao ano)
		alturaContPedro += 2;
		
		// - esse é o contador que nos fornecerá quantas vezes será necessário para os valores alturaContPedro e alturaContLucas serão iguais
		anosDifere++;
	}  

	// - Saber quando lucas for maior que pedro
	if (alturaContLucas > alturaContPedro) {

		// - anosMAIS recebera o valor do contador (anosDifere) e somará mais 1
		anosMais = anosDifere + 1;
	}		

	// - formatando a saida de convertAltura corretamente
	DecimalFormat decimalFormat = new DecimalFormat("0.00");

	// - converte o formato da altura de centimetros para metro	
	float convertAltura = (float)alturaContPedro / 100.0f;
	
	// - Saida na tela com a quantidade de anos levará para Pedro e lucas ter a mesma idade.
	// - Saida na tela também apresenta os anos que Lucas será maior (altura) do que pedro.
	JOptionPane.showMessageDialog(null, "=> Levará " + anosDifere + " anos para que Lucas e Pedro tenham a mesma altura: " + decimalFormat.format(convertAltura) + " metros" + "\n"
	+ "\n" + "=> Lucas será maior que Pedro com:  " + anosMais);
 	
  }

}