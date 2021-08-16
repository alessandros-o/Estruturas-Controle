package controle.exercicios;

import java.util.Scanner;

public class PrimoSwitch {
	
	public static void main(String[] args) {
		
		int contadorDivisor = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o Número!");
		int numero = entrada.nextInt();
		
		for (int divisor = 2; numero > divisor; divisor++) {
			if (numero % divisor == 0) {
				contadorDivisor++;
			}
		}
		
		switch (contadorDivisor) {
		case (0):
			System.out.println("Número Primo!");
			break;
		default:
			System.out.println("Número Composto");
		}
			
	entrada.close();
	}

}
