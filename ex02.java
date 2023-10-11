/* programa que usa variaveis para calcular a media de 3 valores */
import java.io.*;
import java.util.Scanner;

public class ExemploVar02 {

	public static void	main(String[] args) {

		float nota1, nota2, nota3, media;
		
		Scanner sc = new Scanner(System.in);

		System.out.println(" --------- Calculando a media do Aluno ------------ ");

		System.out.println("Insira a primeira nota: ");
		nota1 = sc.nextFloat();

		System.out.println("Insira a segunda nota: ");
		nota2 = sc.nextFloat();

		System.out.println("Insira a terceira nota: ");
		nota3 = sc.nextFloat();

		media = ( nota1 + nota2 + nota3) / 3;


		if (media < 7 ) {

			System.out.println("REPROVADO - a sua média é:" + media);

		} else {
		
			System.out.println("APROVADO - a sua media é: " + media);
		}

	}

}