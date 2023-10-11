import javax.swing.JOptionPane;
import java.util.Scanner;

public class ex13ProgramaMenu {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("********** MENU ***************");
		System.out.println();
		System.out.println("=> Cadastro de cliente, digite 1:");
		System.out.println("=> Excluir cliente, digite -   2:");
		System.out.println("=> Alt dados cliente, digite:  3:");
		System.out.println("=> Para sair, digite:          4:"); 		
		System.out.println();

		int options = sc.nextInt();
	
		switch (options) {

		case 1: 
			System.out.println("Cadastrar cliente ->");
			break;

		case 2: 
			System.out.println("Excluir cliente ->");
			break;

		case 3: 
			System.out.println("Alterar dados de cliente ->");
			break;

		default: 
			System.out.println("Sair do programa ->");


		}

	}
}