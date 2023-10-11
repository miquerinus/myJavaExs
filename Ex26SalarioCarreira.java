import javax.swing.JOptionPane;

// - Metodo de para calcular ajuste de Salario
//public double calculateSalaryAdjustment(String cargo, long tempService, double salAtual) {

//}


class SalarioCarreira {

	public static void main(String[] args) {
		

		double salAtual = 0.00f, salReajuste,reajuste;
		// - variaveis de DATAS ja recebem formatadas 
		long tempService, dateAtual = System.currentTimeMillis(), dateAdmi = System.currentTimeMillis(); 
		
		String cargo = "";
		
		try {

			 cargo = JOptionPane.showInputDialog(null, "Informe seu cargo: " );

		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "Certifique-se de informar CARGO valido");
			System.exit(0);
		}

		try {

			dateAdmi = Long.parseLong(JOptionPane.showInputDialog(null, "Informe data de admissão: "));
		
		} catch (Exception e) {

			
			System.exit(0);
		}

		try {
		
			salAtual = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe SALARIO atual: "));
		
		} catch (Exception e) {
			

			JOptionPane.showMessageDialog(null, "Certifique-se de informar um valor valido");
			System.exit(0);
		}

	   
		// - Descobre quantos anos de serviço.

		//  - 1000l representa millisegundos em 1 segundo
		//  - 60  representa os segundos em 1 minuto
		//  - 60  representa os minutos em 1 hora
		//  - 24  representa as horas em 1 dia;
		//  - 365 representa os dias em 1 ano;
		tempService = ( dateAtual - dateAdmi ) / (1000L * 60 * 60 * 24 * 365);	
		
		if (tempService >= 5) {

				// - metodo equalsIgoreCase é mais eficiente do comparação com todas possiblidades - letras maiusculas ou minuscula (ex Gerente gerente)
				if (cargo.equalsIgnoreCase("Gerente")) {

					reajuste = (salAtual * 10 ) / 100;
					salReajuste = salAtual + reajuste;
					
					JOptionPane.showMessageDialog(null, "Seu cargo é: " + cargo + "\n" + "Salario antigo :" + salAtual + "\n" + "Salario reajustado: " + salReajuste);
				
				} else if (cargo.equalsIgnoreCase("Engenheiro")) {

					reajuste = (salAtual * 11) / 100;
					salReajuste = salAtual + reajuste;	
					
					JOptionPane.showMessageDialog(null, "Segu cargo é: " + cargo + "\n" + "Salario antigo: " + salAtual + "\n" + "Salario reajustado: " + salReajuste);	
				
				} else if (cargo.equalsIgnoreCase("Tecnico")) { 
					reajuste = (salAtual * 12) / 100;
					salReajuste = salAtual + reajuste;		
					
					JOptionPane.showMessageDialog(null, "Seu cargo é: " + cargo + "\n" + "Salario antigo: " + salAtual + "\n" + "Salario reajustado: " + salReajuste);
				
				} else {

					JOptionPane.showMessageDialog(null, "ERRO: Certifique-se de informar um cargo valido");
					System.exit(0);
				}   

		} else if (tempService >= 3 || tempService < 5 ) {

			 	if (cargo.equalsIgnoreCase("Gerente")) {

			 		reajuste = (salAtual * 9) / 100;
			 		salReajuste = salAtual + reajuste;
			 		
			 		JOptionPane.showMessageDialog(null, "Seu cargo é: " + cargo + "\n" + "Salario antigo: " + salAtual + "\n" + "Salario reajustado: " + salReajuste);	
			 	
			 	} else if (cargo.equalsIgnoreCase("Engenheiro")) {

			 		reajuste = (salAtual * 10) / 100;
			 		salReajuste = salAtual + reajuste;
			 		
			 		JOptionPane.showMessageDialog(null, "Seu cargo é: " + cargo + "\n" + "Salario antigo: " + salAtual + "\n" + "Salario reajustado: " + salReajuste);
			 	
			 	} else if (cargo.equalsIgnoreCase("Tecnico")) {

			 		reajuste = (salAtual * 11) / 100;
			 		salReajuste = salAtual + reajuste;	
			 		
			 		JOptionPane.showMessageDialog(null, "Seu cargo é: " + cargo + "\n" + "Salario antigo: " + salAtual + "\n" + "Salario reajustado: " + salReajuste);
			 	
			 	} else {

			 		JOptionPane.showMessageDialog(null, "ERRO: Certifique-se de informar um cargo valido ...");
			 		System.exit(0);
			 	} 
		
		} else if (tempService < 3) {

				if (cargo.equalsIgnoreCase("Gerente"))  {

					reajuste = (salAtual * 8) / 100;
					salReajuste = salAtual + reajuste;
					
					JOptionPane.showMessageDialog(null, "Seu cargo é " + cargo + "\n" + "Salario antigo: " + salAtual + "\n" + "Salario Reajustado: " + salReajuste);
				
				} else if (cargo.equalsIgnoreCase("Engenheiro")) {

					reajuste = (salAtual * 9) / 100;
					salReajuste = salAtual + reajuste;	
					
					JOptionPane.showMessageDialog(null, "Seu cargo é: " + cargo + "\n" + "Salario antigo: " + salAtual + "\n" + "Salario Reajustado: " + salReajuste);
				
				} else if (cargo.equalsIgnoreCase("Tecnico")) {

					reajuste = (salAtual * 10) / 100;
					salReajuste = salAtual + reajuste;
					
					JOptionPane.showMessageDialog(null, "Seu cargo é: " + cargo + "\n" + "Salario antigo: " + salAtual + "\n" + "Salario Reajustado: " + salReajuste);
				
				} else {

					JOptionPane.showMessageDialog(null, "ERRO: Certifique-se de Informar um cargo valido ...");
					System.exit(0);
				} 
		}  	

	}
}