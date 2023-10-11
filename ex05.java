import java.io.*;
import java.util.Scanner;
//import java.text.DecimalFormat;

class ExemploSalmin {

	public	static void main(String[] args) {

		System.out.println("******* Reajuste Salario Minimo ******");
		System.out.println();

		// - Dados do Teclado
		Scanner sc = new Scanner (System.in);

		// - variaveis
		float sal_atual, sal_reajustado, reajuste, resultado;

		// - Entrada do salario atual
		System.out.println("Insira seu salario atual: ");
		System.out.println();
		
		try {
			
			sal_atual = sc.nextFloat();	
			System.out.println();

		} catch (Exception e) {

			System.out.println("Valor invalido para Salario atual. Certifique-se de inserir valor valido");
			sc.close();
			return;
		}

		// - Entrada do reajuste
		System.out.println("Insira o valor o porcentual do reajuste (%): "); 
		System.out.println();
		
		try {

			reajuste = sc.nextFloat();
			System.out.println();

		} catch (Exception e) {

			System.out.println("Valor para reajuste invalido. Certifique-se de inserir um valor valido");
			sc.close();
			return;
		}
	
		resultado = sal_atual * ( reajuste / 100 );
		sal_reajustado = sal_atual + resultado;
	
		if ( sal_reajustado > 1370 ) {

			System.out.println("=> Seu salario antes reajuste é: " + sal_atual);
    		System.out.println("=> Seu salario após reajuste é: " + sal_reajustado);
			System.out.println();
			System.out.println("Parabéns você esta ganhando acima de um salario Minimo");
		
		} else {
			
			System.out.println("=> Seu salario antes reajuste é: " + sal_atual);
    		System.out.println("=> Seu salario após reajuste é: " + sal_reajustado);
			System.out.println();
			System.out.println("Seu salário esta abaixo do salario minimo");
		}	
		
		sc.close();

	}
}