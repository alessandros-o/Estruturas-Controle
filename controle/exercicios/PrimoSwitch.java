package controle.exercicios;

import java.util.Scanner;

public class PrimoSwitch {
	
	public static void main(String[] args) {
		
		int contadorDivisor = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o N?mero!");
		int numero = entrada.nextInt();
		
		for (int divisor = 2; numero > divisor; divisor++) {
			if (numero % divisor == 0) {
				contadorDivisor++;
			}
		}
		
		switch (contadorDivisor) {
		case (0):
			System.out.println("N?mero Primo!");
			break;
		default:
			System.out.println("N?mero Composto");
		}
			
	entrada.close();
	}

}
