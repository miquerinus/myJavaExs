import javax.swing.JOptionPane;

class CadastroCandidatos {

    public static void main(String[] args) {
        
        String nameCandidato = ""; 
        
        try {

            for (int controleNomes = 0; controleNomes < 10; controleNomes++) {
            
                nameCandidato = JOptionPane.showInputDialog(null, "Insert your name: ");      
       
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "ERROR data .... ");
            return;
        }


        JOptionPane.showMessageDialog(null, "Cadastro names: " + nameCandidato);
        return;
    }
}


