// - Algoritmo que cadastra produto.
import javax.swing.JOptionPane;

class VendasProduto {

	public static void main(String[] args) {
	
	int cod_prod = 0, quant_prod = 0;
	float val_unit = 0.00f, val_total;
	String nome_prod = "";

	// - Tela de Cadastro Produto
	// - ShowInputDialog por default tem tipo String, por isso a conversão 
	try {
 		cod_prod = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe um codigo: "));
	} catch (Exception e) {
		JOptionPane.showMessageDialog((null), "Certifique-se de informar valor valido");
		return;
	}
	
	try {
		nome_prod = JOptionPane.showInputDialog(null,"Informe o nome do produto: ");
	} catch (Exception e) {
		JOptionPane.showMessageDialog(null, "Certifique-se de informar valor valido");
		return;
	}	

	try {
		quant_prod = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade: "));
	} catch (Exception e) {
		JOptionPane.showMessageDialog((null), "Certifique-se de informar valor valido");
		return;
	}
	
	try {
		val_unit = Float.parseFloat(JOptionPane.showInputDialog(null,"Informe valor unitário: ").replace(",", "."));
	} catch (Exception e) {
		JOptionPane.showMessageDialog(null, "Certique-se de informar valor valido");
		return;
	}
	
	// - processamento 
	val_total = val_unit * quant_prod;

	// - Declaração de uma variavel tipo String para fazer uma saida encadeada com todos os dados para serem repassados ao JOptionPane
	String menssagem = "=> Codigo do produto: " + cod_prod + "\n\n" +
	"=> Nome: " + nome_prod + "\n\n" +
	"=> Quantidade Comprada: " + quant_prod + "\n\n" +
	"=> Valor unitário: " + val_unit + "\n\n" +
	"=> Valor Total: " + val_total;

	// - A classe JOptionPane, usa o metodo showMessageDialog para mostrar a saida de messagem
	JOptionPane.showMessageDialog(null, menssagem);
	 
	}
}