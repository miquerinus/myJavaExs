import javax.swing.JOptionPane;
import java.text.DecimalFormat;


// - Verifica se a nota informada é valor acima de 0 e abaixo ou igual a 10
class VerificaNota {

	public static boolean IsNotaValida(float nota) {

		return nota >= 0 && nota <= 10;
	}
}


class MediaALunos {

	public static void main(String[] args) {
		
		float n1 = 0.0f, n2 = 0.0f, n3 = 0.0f, media, exame;

		try {
		    	n1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a 1º nota: "));
		    
		    	if (!VerificaNota.IsNotaValida(n1)){

		    		JOptionPane.showMessageDialog(null, "Nota invalida ...");
		    		System.exit(0);	
		    	}	
		   	 		    
	    } catch (Exception e) {

	    	JOptionPane.showMessageDialog(null, "Certifique-se de informar valores validos");
	    }

	    try {

	    		n2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a 2º nota: "));
	   
	    		if (!VerificaNota.IsNotaValida(n2)){

	    			JOptionPane.showMessageDialog(null, "Nota invalida");
	    			System.exit(0);
	    		}

	    } catch (Exception e) {

	    	JOptionPane.showMessageDialog(null, "Certifique-se de informar valores validos.");
	    }
	

	    try {

	    	n3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a 3º nota: "));

	    	if (!VerificaNota.IsNotaValida(n3)) {

	    		JOptionPane.showMessageDialog(null, "Nota invalida");
	    		System.exit(0);
	    	}

	    } catch (Exception e) {

	    	JOptionPane.showMessageDialog(null, "Certifique-se de informar valores validos.");
	    }
	

	    media = (n1 + n2 + n3) / 3;
	   	

	    DecimalFormat decimalFormat = new DecimalFormat("0.0");

	    String telaSaidaAprovado = "=> Você esta aprovado com a media de: " + decimalFormat.format(media);
	    String telaSaidaRecupera = "=> Você esta em recuperação. Media: " + decimalFormat.format(media);
	    String telaSaidaReprova  = "=> Você foi reprovado. Media: " + decimalFormat.format(media); 
	    
	    if (media >= 7 ) {

	    	JOptionPane.showMessageDialog(null, telaSaidaAprovado);
	    
	        } else if (media >= 5 && media < 7) {

	     	   JOptionPane.showMessageDialog(null, telaSaidaRecupera);
	     	 
		     	 exame = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe nota Exame: ")); 
		   	  
		   	     if (!VerificaNota.IsNotaValida(exame)) {

		   	     	JOptionPane.showMessageDialog(null, "Informe um valor valido");
		   	     	System.exit(0);
		   	     } 

		   	     float recupera = (exame + media) / 2;

		     	 if (recupera >= 5){

		     	 	JOptionPane.showMessageDialog(null, "APROVADO no exame final. nota: " + recupera);
		     	
		     	 } else { 

		     	   JOptionPane.showMessageDialog(null, "REPROVADO no exame final. nota: " + recupera);
		     	   
		     	 }
	   
	      } else { 
	  	   
	  	   JOptionPane.showMessageDialog(null, telaSaidaReprova); 
		
		}
	}
}
