import javax.swing.JOptionPane;
import java.text.DecimalFormat;

class PesoIdeal {

	public static void main(String[] args) {
		
		double pesoIdeal, altura = 0.00;
		String genero;

        JOptionPane.showMessageDialog(null, "***** CALCULADOR DE IMC *****");

        try  {

	        // - Aqui pega-se a primeira letra da String digitada com o metodo charAt() que pertece a classe String
	       String inputGenero = JOptionPane.showInputDialog(null, "informe seu genero: ");

			altura = Float.parseFloat(JOptionPane.showInputDialog(null, "informe sua altura: "));

		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "Certifique-se de informar valores validos.");
		}	


		 if (genero.charAt(0) == 'M' || genero.charAt(0) == 'm') {

		 	pesoIdeal = (72.7 * altura) - 58;

		 	JOptionPane.showMessageDialog(null, "Genero: " + genero + "\n" + "Peso ideal: " + pesoIdeal);
		 	System.exit(0);

		 } else if (genero.charAt(0) == 'F' || genero.charAt(0) == 'f') {

		 	pesoIdeal = (62.1 * altura) - 44.7;

		 	JOptionPane.showMessageDialog(null, "Genero: " + genero + "\n" + "Peso ideal: " + pesoIdeal);
		 	System.exit(0);
		 
		 } else {

		 	JOptionPane.showMessageDialog(null, "Genero não encontrado ");
		 } 
	}
}