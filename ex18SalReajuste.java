import java.text.DecimalFormat;
import javax.swing.JOptionPane;

class SalReajuste {
   
    public static void main(String[] args) {

     String nome = "";
     double sal_atual = 0.000f, aumento, sal_total = 0.000f;

     // - Verifica se os campos foram preenchidos adequadamente
        try { 
            while (true) {
                nome = JOptionPane.showInputDialog(null, "Informe seu nome: ");
                // - Usamos expressão regular para aceitar somente letras no campo nome de a-z e A-Z
                if (nome.matches("^[a-zA-Z]+$")){
                // - Interompe o Loop While com break porque o nome é valido
                break; 
            
                } else {
                    JOptionPane.showMessageDialog(null, "Informe apenas letras");
                }
            }                  
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Certifique-se de informar valores validos");
        } 
        
        try {
            
            sal_atual = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe seu salario atual: "));
       
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Certifique-se de informar o valor adequado");
            return;
        }

      
     aumento = (sal_atual * 8.75) / 100;
     sal_total = aumento + sal_atual;

     // - Criamos um objeto decimalFormat para formatar a saida dos valores das variaveis do tipo double
     DecimalFormat decimalFormat = new DecimalFormat("#.###"); 
     
     String tela_saida = "=> Nome : " + nome + "\n\n" +
     "=> Salario Atual : " + decimalFormat.format(sal_atual) + "\n\n" +
     "=> Reajuste : " + decimalFormat.format(aumento) + "\n\n" +
     "=> Salario Reajustado : " + decimalFormat.format(sal_total);

     JOptionPane.showMessageDialog(null, tela_saida);

    }
}