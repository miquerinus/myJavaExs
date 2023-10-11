import javax.swing.JOptionPane;
import java.text.DecimalFormat;

class ReajustePreco {

	public static void main(String[] args) {

		double precoAtual, precoReajustado, desconto;
		String nome;

	    try {

	    	nome = JOptionPane.showInputDialog(null, "Informe Nome: "); 
	    
	    } catch (Exception e) {

	    	JOptionPane.showMessageDialog(null, "Certifique-se de informar valor valido.");
	    	return;
	    }	

	    try {

	    	precoAtual = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço atual: "));

	    } catch (Exception e) {

	    	JOptionPane.showMessageDialog(null, "Certifique-se de informar valor valido");	
	    	return;
	    }


	    desconto = (precoAtual * 10) / 100;
	    precoReajustado = precoAtual - desconto;

	    DecimalFormat decimalFormat = new DecimalFormat("00.00");

	    String tela = "=> Nome : " + nome + "\n\n" + "=> Preço Atual : " + decimalFormat.format(precoAtual) + "\n\n"
	    + "=> Preço Reajustado: " + decimalFormat.format(precoReajustado) + "\n\n" + "=> Desconto de : " + decimalFormat.format(desconto);

	    JOptionPane.showMessageDialog(null, tela);

	}
}