package controle.exercicios;

import java.util.Scanner;

public class NumPositivo {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int soma = 0;
		int numero = 0;
		boolean valido = false;
		
		do {
			System.out.println("Digite o número: ");
			numero = entrada.nextInt();
			valido = numero >= 0;
			
			if (valido) {
				soma += numero;
			}
			System.out.println("A soma dos números é:" + soma);
		} while (valido); 
		
		entrada.close();
	}

}
