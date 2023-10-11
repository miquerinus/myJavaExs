import javax.swing.JOptionPane;


class ProgramaMenuJOPane {

	public static void main(String[] args) {

     
	 // - declaração variavel do tipo String
     // - recebe todos os campos do menu
     String menu = "************* MENU ****************\n\n"
     + "=> Cadastro cliente  1:\n\n"
     + "=> Excluir cliente   2:\n\n"
     + "=> Alt.dados cliente 3:\n\n"
     + "=> Sair              4:\n\n";

	     // - variavel option do tipo inteiro recebe todos os dados digitados no menu convertidos para tipo inteiro
	     // - clase Integer.parseInt() usada para fazer a conversão de um tipo string para inteiro
     	 // - classe JOptionPane chamado o metodo showInputDialog para mostarar um Menu grafico dos elementos da variavel menu
	     int option = Integer.parseInt(JOptionPane.showInputDialog(null, menu));

	     switch (option) {

	     case 1:
	     	JOptionPane.showMessageDialog(null, "Cadastrar cliente ->");
	     	break;
	     case 2:
	     	JOptionPane.showMessageDialog(null, "Exluir cliente ->");
	     	break;
	     case 3:
	     	JOptionPane.showMessageDialog(null, "Alterar dados Clientes ->");
	     	break;
	     default:
	    	JOptionPane.showMessageDialog(null, "Sair do programa ->");
	    	break;
	     }
	}
}	