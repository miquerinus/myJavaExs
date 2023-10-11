import javax.swing.JOptionPane;
import java.text.DecimalFormat;


class FormasPagamento {

	public static void main(String[] args) {
		
		double valor = 0.00, totalValor, descontoValor, acrescimoValor;
		int formaPagamento = 0;
		
		String telaFormasPagamento = "*********** MENU ************** " + "\n\n" + 
	    "Informe uma forma de pagamento" + "\n\n" +
	    "Digite 1: Pagamento a vista - 5% desconto " + "\n\n" +
	    "Digite 2: Pagamento 3x parcelas - sem juros" + "\n\n" +
	    "Digite 3: Pagamento 5x parcelas - juros 2%" + "\n\n" +
	    "Digite 4: Pagamento 10x parcelas - juros 8%";

	    JOptionPane.showMessageDialog(null, telaFormasPagamento);

		try {

			formaPagamento = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o tipo de pagamento: "));

		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "Certifique-se de informar valor valido");
			System.exit(0);
		}

		try {

			valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor: "));

		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "Certifique-se de informar valor valido");
			System.exit(0);
		}	

	  
	    DecimalFormat decimalFormat = new DecimalFormat("0.00");


	    if (formaPagamento == 1) {

	    	descontoValor = (valor * 5) / 100;
	    	totalValor = valor - descontoValor;
	    	
	    	JOptionPane.showMessageDialog(null, "Valor pago a vista com desconto de 5%: " + decimalFormat.format(totalValor));
	   
	    } else if (formaPagamento == 2) {

	    	totalValor = valor / 3;

	    	JOptionPane.showMessageDialog(null, "Valor pago em 3x: " + decimalFormat.format(totalValor));

	    } else if (formaPagamento == 3) {

	    	acrescimoValor = (valor * 2) / 100;
	    	totalValor = valor + acrescimoValor;

	    	JOptionPane.showMessageDialog(null, "Valor pago em 5x: " + decimalFormat.format(totalValor));

	    } else if (formaPagamento == 4) {

	     	acrescimoValor = (valor * 8) / 100;
	     	totalValor = valor + acrescimoValor;

	     	JOptionPane.showMessageDialog(null, "Valor pago em 10x " + decimalFormat.format(totalValor));

	    } else {

	    	JOptionPane.showMessageDialog(null, "Forma de pagamento invalida");
	    } 

	}
}