import javax.swing.JOptionPane;
public class ex10DescobrindoTipoTriangulo {
	public static void main(String[] args) {
		int a,b,c;
		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe valor para lado A: "));
		b = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe valor para lado B: "));
		c = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe valor para lado C: "));
	
		if (a != 0 && b != 0 && c != 0) {
			
			if (a + b > c && a + c > b && b + c > a) {
				
				if (a != b && a != c && b != c) {
					JOptionPane.showMessageDialog(null, "Todos lados diferentes - Triangulo Escaleno - ");
				 }
					else {
					
						if ( a == b && b == c ) {
							JOptionPane.showMessageDialog(null, "Todos os lados iguais - Triangulo Equilatero");
						}
						
						else {
							JOptionPane.showMessageDialog(null, "2 lados com mesma medida - Triangulo Isosceles");
						}
					}
				
			} else  {
						JOptionPane.showMessageDialog(null, "Não forma triangulo");
		            }
		
		} else {
				JOptionPane.showMessageDialog(null, "Não forma um triangulo");
			   }
  	}
}
 

