import java.io.*;
import java.util.Scanner;

public class CalcularVelocidade {

	public static void main (String[] args) {

	   	Scanner sc = new Scanner(System.in);

		System.out.println("****** Calculando a velocidade Média *******");
	   	System.out.println();

	   	float veloMedia, distancia, tempoPercorrido;

	   	System.out.println("Insira a distancia: ");
	   	distancia = sc.nextFloat();

	   	System.out.println("Insira o tempo percorrido: ");
	   	tempoPercorrido = sc.nextFloat();

	   	veloMedia = distancia / tempoPercorrido;

	   	System.out.println("A velocidade média é: " + veloMedia);

	}
}