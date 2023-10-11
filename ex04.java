import java.io.*;
import java.util.Scanner;


public class ExemploCalcularPeso {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("******* CALCULADORA DE IMC ********");
		System.out.println();

		float imc, peso;
		double altura;

		System.out.println("Insira seu peso: ");
		
		// - Criamos uma execption para tratamento de um possivel erro
		try {
	
			peso = sc.nextFloat();
		
		} catch (Exception e) {

			System.out.println("Valor invalido para peso. Certifique-se de inserir um valor valido");
			sc.close();
			return;
		}  
		
		System.out.println("Insira sua altura: ");
		
		// - Criamos uma Exeception para tratamento de um possivel erro
		try {

			altura = sc.nextDouble();
		
		} catch (Exception e) {
			
			System.out.println("Valor invalido para altura. Certifique-se de inserir um valor valido");
			sc.close();
			return;
		} 

		// - calcular IMC, float é usado na equação para realizar um CASTING = converter o resultado da expressão altura * altura em float
		imc = peso / (float) (altura * altura);

		System.out.println("IMC é: " + imc);

		// - fechamento do objeto scanner 
		sc.close();
	}
}