import javax.swing.JOptionPane;

class MediaAlunos {

	public static void main(String[] args) {

	JOptionPane.showMessageDialog(null, String.format("Calcular a sua media: "));
	
	float nota1, nota2, nota3, media;

	nota1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe nota 1: "));
	nota2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe nota 2: "));
	nota3 = Float.parseFloat(JOptionPane.showInputDialog(null, "informe nota 3: "));

	media = (nota1 + nota2 + nota3) / 3;

	if (media > 7) {
		JOptionPane.showMessageDialog(null, String.format("Parabéns, sua média é: %.2f", + media));

	} else if (media < 5 ) {
		JOptionPane.showMessageDialog(null, String.format("Reprovado .. sua nota foi: %.2f", + media));

	} else {
		JOptionPane.showMessageDialog(null, String.format("Recuperação .. sua mota foi: %.2f", + media));
	}  

	}

}