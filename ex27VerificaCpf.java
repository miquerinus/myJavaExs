import javax.swing.JOptionPane;

class VerficaCpf {

	public static void main(String[] args) {
		
		
		// - Array para conter 11 valores de numeros de tipo Inteiro.
		int cpfNum[] = new int cpfNum[10]; 

		// - Verifica se usuário não colocou um dado que não seja um numero 
		try {

			    String cpf = JOptionPane.showInputDialog(null, "Informe um numero de cpf: ");			

				// - verifica se foi digitado 11 digitos
				if (cpf.length() == 11) {

					for (i = 0; i < 11; i++);

					// - atriubui o valor do i do loop for ao array cpfNUM[]
					cfpNum[i] = Character.getNumberValue(cpf.charAt(i));
				
				} else {

				JOptionPane.showMessageDialog(null, "Numero de digitos incompativel ...");
				System.exit(0);
			} 

	    } catch (Exception e) {

	    	JOptionPane.showMessageDialog(null, "Certifique-se de informar CPF valido");
	    	System.exit(0);
	    }


	    // - Processo de geração de digito verificar X = index[9] 
	    
	    // 1 - Multipolica os 9 valores primeiros
	    int ax = cpfNum[0] * 10;
	    int bx = cpfNum[1] * 9;
	    int cx = cpfNum[2] * 8;
	    int dx = cpfNum[3] * 7;
	    int ex = cpfNum[4] * 6;
	    int fx = cpfNum[5] * 5;
	    int gx = cpfNum[6] * 4;
	    int hx = cpfNum[7] * 3;
	    int ix = cpfNum[8] * 2;

	    int digitoVerificador_x, digitoVerificador_y;
	    
	    // 2 - Apos multiplicação, soma todos os valors dos campos: 
	    int somaValoresCampos_x = ( ax + bx + cx + dx + ex + fx + gx + hx + ix);
	    
	    // 3 - Apos, uma divisão da somadosvalores por 11
	    int divValoresCampos_x = somaValoresCampos_x / 11;

	    // 4 - Apos, uma multiplicação de divisaõValores por 11
	    int multiValoresCampos_x = divValoresCampos_x * 11;

	    // 5 - Apos, subtração de somavalores por multvalores;
	    int subValoresCampos_x = somaValoresCampos_x - multiValoresCampos_x;

        digitoVerificador_x = subValoresCampos_x;

       // - Processo digito verificador X = index9

       if (digitoVerificador_x == 1 || digitoVerificador_x == 0) {

       		cpfNum[9] = 0;

       } else {

       		cpfNum[9] = digitoVerificador_x;
       }

      // - Processo digito verificador Y = index10;

      int ay = cpfNum[0] * 11;
      int by = cpfNum[1] * 10;
      int cy = cpfNum[2] * 9;
      int dy = cpfNum[3] * 8;
      int ey = cpfNum[4] * 7;
      int fy = cpfNum[5] * 6;
      int gy = cpfNum[6] * 5;
      int hy = cpfNum[7] * 4;
      int iy = cpfNum[8] * 3; 


      int somaValoresCampos_y = ( ay + by + cy + dy + ey + fy + gy + hy + iy);
	    
	  // 3 - Apos, uma divisão da somadosvalores por 11
	  int divValoresCampos_y = somaValoresCampos_y / 11;

	  // 4 - Apos, uma multiplicação de divisaõValores por 11
	  int multiValoresCampos_y = divValoresCampos_y * 11;

	  // 5 - Apos, subtração de somavalores por multvalores;
	  int subValoresCampos_y = somaValoresCampos_y - multiValoresCampos_y;

        digitoVerificador_y = subValoresCampos_y;


      if (digitoVerificador_y == 1 || digitoVerificador_y == 0) {

      	cpfNum[10] = 0;
     
      } else {

      	cpfNum[10] = digitoVerificador_y;
     
      } 

      JOptionPane.showMessageDialog(null, "CPF gerado: " + cpfNum[]);

	}
}