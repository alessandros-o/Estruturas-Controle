package controle.exercicios;

import java.util.Scanner;

public class Primo {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o número: ");
		int num = entrada.nextInt();
		boolean entrou = false;
		
		for(int contador = 2; contador < num; contador++) {
			int calculo = num % contador;
			if (calculo == 0) {
				entrou = true;
				System.out.println("Número Composto!");
				break;
			}
		}
		if (!entrou) {
			System.out.println("Número Primo!");
		}

		entrada.close();
	}

}


//int a = 3;
//int b = a;
//int c = a + b;

//c += b; // c = c + b;
//c -= a; // c = c - a;
//c *= b; // c = c * b;
//c /= a; // c = c / a;

//System.out.println(c);
//c %= 2; // c = c % 2; o resto vai dar 0 ou 1
//System.out.println(c);