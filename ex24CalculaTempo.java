import javax.swing.JOptionPane;

class CalculaTempo {

	public static void main(String[] args) {
		
		int tempoInicial, tempoFinal, totalSegundosConvertido; 
		int hora, minuto, segundos;

		String telaApresentação = " ********** MENU ************* " + "\n\n" +
		"Calculando o tempo de um trajeto: " + "\n\n";  

		JOptionPane.showMessageDialog(null, telaApresentação);

		int insereH1 = 0, insereM1 = 0, insereS1 = 0;
		// - Verificador de entrada de dados 1
		try {

			 insereH1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a hora: " + "\n"));
			 insereM1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe os minutos: " + "\n"));	
			 insereS1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe os segundos" + "\n"));

			if (insereH1 > 23 && insereM1 > 59 && insereS1 > 59) {

				JOptionPane.showMessageDialog(null, "Não permitido valores maiores que 60");
           		System.exit(0);
          
            }
       
        }  catch (Exception e) {

				JOptionPane.showMessageDialog(null, "Certifique-se de informar valor valido");
				System.exit(0);
			}  
			
		int insereH2 = 0, insereM2 = 0, insereS2 = 0;	
		// - Verificador de entrada  de dados 2
		try {

			 insereH2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a hora Final: " + "\n"));
			 insereM2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe minutos" + "\n"));
			 insereS2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe segundos: " + "\n"));

			if (insereH2 > 23 && insereM2 > 59 && insereS2 > 59) {

					JOptionPane.showMessageDialog(null, "Não é permitido valores maiores que 60");
					System.exit(0);
			
			} 

		} catch (Exception e) {

				JOptionPane.showMessageDialog(null, "Certifique-se de informar valor valido");
				System.exit(0);
			}

	
	// - Tudo convertido para Segundos
	minuto = 60;
	hora = 3600;

	// - Converte para segundos as horas
	int totalHora1, totalHora2;

	 totalHora1 = insereH1 * hora;
	 totalHora2 = insereH2 * hora;

	// - Converte para Segundos os minutos
	int totalMinuto1, totalMinuto2;

	 totalMinuto1 = insereM1 * minuto; 
	 totalMinuto2 = insereM2 * minuto;	

	tempoInicial = totalHora1 + totalMinuto1 ;
	tempoFinal =  totalHora2 + totalMinuto2;	

	// - Mostra a diferença de um tempo final para inicial de uma ocorrencia em Segundos
	totalSegundosConvertido = tempoFinal - tempoInicial;

	// - Converte Segundos em Minutos
	
	int totalMinutosConvertido;

	totalMinutosConvertido = totalSegundosConvertido / minuto;  

	// - Converte os Minutos em Horas
	
	int totalHorasConvertido;

	totalHorasConvertido = totalMinutosConvertido  / 60; 

	
	String msnTela = "Digite 1 - obter diferença em horas: " + "\n" +
	"Digite 2 - obter diferença em Minutos:" + "\n" +
	"Digite 3 = obter diferença em Segundos:";

 	JOptionPane.showMessageDialog(null, msnTela);

   
    try {	
	
		int option = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe 1 - 3: "));


	 	if (option == 1 ) {

	 		JOptionPane.showMessageDialog(null, "Diferença em horas da ocorrência: " + totalHorasConvertido);
	 		System.exit(0);

	 	} else if (option == 2) {

	 		JOptionPane.showMessageDialog(null, "Diferença em Minutos da ocorrência: " + totalMinutosConvertido);	
	 		System.exit(0);

	 	} else if (option == 3) {

	 		JOptionPane.showMessageDialog(null, "Diferença em Segundos da ocorrência: " + totalSegundosConvertido);
	 		System.exit(0);
	 	
	 	} else {

	 		JOptionPane.showMessageDialog(null, "Opção invalida");
	 	} 

	} catch (Exception e) {

		 JOptionPane.showMessageDialog(null, "Certifique-se de informar valor valido");
	}


	}
}