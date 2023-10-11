import javax.swing.JOptionPane;
import java.text.DecimalFormat;
/*
 - Programa tem por objetivo:
 - Coletar o nome do aluno, disciplina e 3 notas.
 - Coletar a nota de estudo Redigido.
 - Coletar a nota do Provão
 - Unido tudo isso numa media geral calculando.
*/
class MediaAluno {

	public static void main(String[] args) {
		
		String disciplina = "", nomeAluno = "";
		float nota1 = 0.0f, nota2 = 0.0f, nota3 = 0.0f, media, media_n,  provaFinal = 0.0f, estudoDirigido = 0.0f, pr = 0.0f, ed = 0.0f;

		String tela = "***************** BOLETIM ESCOLAR ********************** " + "\n\n"; 
		JOptionPane.showMessageDialog(null, tela);

		// - Bloco try-catch tratamento mesmo tipo de dado 	
		
		try {
			
			  nomeAluno = JOptionPane.showInputDialog(null, "Informe o nome do Aluno: ");
			  disciplina = JOptionPane.showInputDialog(null, "Informe a disciplina: ");
		
		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "Certique-se de informar um dado valido ...");
			System.exit(0);
		}
		// - Bloco try-catch tratamento mesmo tipo de dado 
		try {
			 
			 nota1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe sua 1º nota: "));
			 nota2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe sua 2º nota: "));
			 nota3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe sua 3º nota: ")); 
		
		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "Certique-se de informar um dado valido ...");
			System.exit(0);
		}
		// - Bloco try-catch para o mesmo tipo de dado
		try {

		    ed = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe nota Estudo Dirigido: "));
		    pr = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a nota do Provão: "));	
		
		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "Certifique-se informar dado valido ...");
			System.exit(0);
		}  
		// - media corresponde 20% da media
		// - ED (estudo dirigido) corresponde a 20% da media
		// - PR (provao) corresonde a 60% da media.

		media = (nota1 + nota2 + nota3 ) / 3;

		media_n = (media * 20) / 100;
		estudoDirigido = (ed * 20) / 100;
		provaFinal = (pr * 60) / 100;	
	
		float resultFinal = media_n + estudoDirigido + provaFinal;

		// - Formata a saida dos valores das variaveis de tipo float com até 2 casas depois da virgula
		DecimalFormat decimalFormat = new DecimalFormat("0.00");
		
		if (resultFinal >= 6.0) {

			JOptionPane.showMessageDialog(null, "Parabéns " + nomeAluno + " você foi aprovado na disciplina "  +  disciplina + " com media: " + decimalFormat.format(resultFinal) + "\n\n" +

			"=> Notas da disciplina: " + decimalFormat.format(media_n) + "\n\n" + 
			"=> Notas Estudo dirigido: " + decimalFormat.format(estudoDirigido) + "\n\n" + 
			"=> Notas do Provão: " + decimalFormat.format(provaFinal));
			
			System.exit(0);

		} else {

			JOptionPane.showMessageDialog(null, "Infelizmente " + nomeAluno + " você foi reprovado na disciplina de " + disciplina + " com  media: " + resultFinal);
			System.exit(0);
		}
	}
}