import javax.swing.JOptionPane;

class ProgramaCalcula4{

	public static void main(String[] args) {

	String menu = "Digite 4 notas para serem somadas: ";
	
	float nota1, nota2, nota3, nota4, result;

	nota1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite nota 1: "));
	nota2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite nota 2: "));
	nota3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite nota 3: "));
	nota4 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite nota 4: "));

	result = nota1 + nota2 + nota3 + nota4;

	JOptionPane.showMessageDialog(null,"As notas somadas são: " + result);

	}
}