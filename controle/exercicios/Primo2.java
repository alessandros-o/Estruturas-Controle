package controle.exercicios;

import java.util.Scanner;

public class Primo2 {
	
	public static void main(String[] args) {
		
		int contadorDivisor = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o Número!");
		int numero = entrada.nextInt();
		
		for (int divisor = 2; divisor < numero; divisor++) {
			if (numero % divisor == 0) {
				contadorDivisor++;
			}
		}
		
		if (contadorDivisor == 0 && numero != 1) {
			System.out.println("Número Primo!");
		} else {
			System.out.println("Número Composto!");
		}
			
	entrada.close();
	}

}
