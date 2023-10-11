import javax.swing.JOptionPane;
import java.text.DecimalFormat;

// - Programa Lanchonete
// - Programa recebe um pedido de cliente no combo de compra.

class Lanchonete {

	public static void main(String[] args) {
		
	 double totalPedido;
	 int lanche, bebida, outros;

	 String menuLanches = "******************* Menu lanches ******************* " + "\n\n" +
	 
	 ">>>> Informe um numero de 1 - 5 para escolha do lanche <<<<"  + "\n\n" +
	 "=> 1 - Hamburger: R$ 6.80 " + "\n" +
	 "=> 2 - Chessburger: R$ 7.50 " + "\n" +
	 "=> 3 - Bauru: R$ 5.40" + "\n" +
	 "=> 4 - X-Salada: R$ 8.50" + "\n\n" +
	 "=> 5 - CANCELAR PEDIDO";	
	
	JOptionPane.showMessageDialog(null, menuLanches);	

	// - talvez seja interessante colocar uma inputDialog aqui para cadastrar o lanche.

	double pedidoLanche = 0.00f, hamburger = 6.80, chessBurger = 7.50, bauru = 5.40, xSalada = 8.50;

	// - Cadastra pedido do lanche usuário.
	
	try {

		lanche = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe nº do lanche: "));

	
		if (lanche == 1) {

			pedidoLanche = hamburger;
			JOptionPane.showMessageDialog(null, "Você escolheu hamburger");
		
			} else if (lanche == 2) {

			pedidoLanche = chessBurger;
			JOptionPane.showMessageDialog(null, "Você escolheu Chessburger");
		
			} else if (lanche == 3) {

			pedidoLanche = bauru;
			JOptionPane.showMessageDialog(null, "Você escolheu um Bauru");

			} else if (lanche == 4) {

			pedidoLanche = xSalada;
			JOptionPane.showMessageDialog(null, "Você escolheu um X-Salada");

			} else if (lanche == 5) { 

			JOptionPane.showMessageDialog(null, "Pedido cancelado ... ");
			System.exit(0);

			} else {

			JOptionPane.showMessageDialog(null, "Lanche não encontrado ...");
			System.exit(0);
		
			}  

    } catch (Exception e) {

    	JOptionPane.showMessageDialog(null, "Certifique-se de informar um valor valido ...");
    	System.exit(0);
    }
    

	String menuBebida = "*************** Meu Bebida *******************" + "\n\n" +
	
	">>>> Informe um numero de 1 - 5 para bebida <<<<" + "\n\n" +
	
	"=> 1 - Refrigerante 200ml: R$ 2.30" + "\n" + 
	"=> 2 - Refrigerante 500ml: R$ 4.00" + "\n" +
	"=> 3 - Suco 200ml: R$ 3.50 " + "\n" +
	"=> 4 - Suco 500ml: R$ 6.00" + "\n\n" +
	"=> 5 - CANCELAR PEDIDO";

	JOptionPane.showMessageDialog(null, menuBebida);

	// - talvez sja interessante colocar um inputDialog aqui para cadastrar a bebida.

	double pedidoBebida = 0.00f, refrigerante200 = 2.30, refrigerante500 = 4.00, suco200 = 3.50, suco500 = 6.00;
   
    // - Cadastra no pedido a bebida do usuário.

   try {

   		bebida = Integer.parseInt(JOptionPane.showInputDialog(null, "informe nº da bebida: "));

   		if (bebida == 1) {

   			pedidoBebida = refrigerante200;
   			JOptionPane.showMessageDialog(null, "Você escolheu um refrigerante 200 ml .. ok"); 
   		
   		} else if (bebida == 2) {

   			pedidoBebida = refrigerante500;
   			JOptionPane.showMessageDialog(null, "Você escolheu um refrigerante 500 ml .. ok");
   		
   		} else if (bebida == 3) {

   			pedidoBebida = suco200;
   			JOptionPane.showMessageDialog(null, "Você escolheu um suco 200 ml .. ok");
   		
   		} else if (bebida == 4) {

   			pedidoBebida = suco500;
   			JOptionPane.showMessageDialog(null, "Você escolheu um suco 500 ml .. ok");
   		
   		} else if (bebida == 5) {

   			JOptionPane.showMessageDialog(null, "PEDIDO CANCELADO ...");
   			System.exit(0);

   		} else {

   			JOptionPane.showMessageDialog(null, "Bebida não cadastrada");
   			System.exit(0);
   		}

   } catch (Exception e) {

   		JOptionPane.showMessageDialog(null, "Certifique-se de informar um valor valido ...");
   		System.exit(0);
   }

	String menuOutrosLanches = "************** Menu Outros Lanches **********" + "\n\n" +
	
	">>>> Informe um numero de 1 - 5 para outros <<<<" + "\n\n" +
	
	"=> 1 - Batatas Fritas Pequena: R$ 3.50" + "\n" +
	"=> 2 - Batatas Fritas Media: R$ 4.50" + "\n" +
	"=> 3 - Batatas Fritas Grande: R$ 5.50" + "\n" + 
	"=> 4 - Salada media: R$ 8.00" + "\n\n" +
	"=> 5 - CANCELAR PEDIDO";	
	
	JOptionPane.showMessageDialog(null, menuOutrosLanches);

	// - talvez seja interessante colocar um inputDialog aqui para cadastrar os outros.
    
   double pedidoOutros = 0.00f, batataFritaPequena = 3.50, batatasFritasMedia = 4.50, batatasFritasGrande = 5.50, salada = 8.00;
   
   try {

   		outros = Integer.parseInt(JOptionPane.showInputDialog(null, "informe complementos: "));

   		if (outros == 1) {

   			pedidoOutros = batataFritaPequena;
   			JOptionPane.showMessageDialog(null, "Você escolheu porcão batata fritas pequena");

   		} else if (outros == 2) {

   			pedidoOutros = batatasFritasMedia;
   			JOptionPane.showMessageDialog(null, "Você escolheu porção batata fritas media");
   		
   		} else if (outros == 3) {

   			pedidoOutros = batatasFritasGrande;
   			JOptionPane.showMessageDialog(null, "Você escolheu porção batata fritas grande");
   		
   		} else if (outros == 4) {

   			pedidoOutros = salada;
   			JOptionPane.showMessageDialog(null, "Você escolheu salada");
   		
   		} else if (outros == 5) {

   			JOptionPane.showMessageDialog(null, "PEDIDO CANCELADO ...");
   			System.exit(0);
   		
   		} else {

   			JOptionPane.showMessageDialog(null, "Outros não cadadastrado ...");
   			System.exit(0);	
   		}  
   
   } catch (Exception e) {

   	JOptionPane.showMessageDialog(null, "Certifique-se de informar valor valido");
   	System.exit(0);

   } 

   // - Soma todos os custos do pedido
   totalPedido = pedidoLanche + pedidoBebida + pedidoOutros;

   DecimalFormat decimalFormat = new DecimalFormat("00.00");
   
   String telaSaida = "Seu pedido completo: " + "\n\n" +

   "=> Lanche: " + decimalFormat.format(pedidoLanche) + "\n" + 
   "=> Bebida: " + decimalFormat.format(pedidoBebida) + "\n" +
   "=> Outros: " + decimalFormat.format(pedidoOutros) + "\n\n" +
   "=>Total pedido: R$: " + decimalFormat.format(totalPedido); 

   JOptionPane.showMessageDialog(null, telaSaida);
	

	}
}