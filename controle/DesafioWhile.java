package controle;

import java.util.Scanner;

public class DesafioWhile {
	
	public static void main(String[] args) {
		
		//Calcular m�dia das notas de uma classe
		// Rejeitar notas inv�lidas
		// Quando digitar -1 retornar a m�dia das notas e encerrar o programa
		
		Scanner entrada = new Scanner(System.in);
		
		double nota = 0;
		double soma = 0;
		int quantidade = 0;
		
		do {
			System.out.println("Digite a nota:");
			nota = entrada.nextDouble();
			
			if(nota <= 10 && nota >= 0) {
				soma += nota;
				quantidade++;
			} else if (nota != -1){
				System.out.println("Nota Inv�lida. Digite uma nota v�lida!");
			}
		} while (nota != -1);
		
		
		System.out.println("A soma das notas �: " + soma);
		System.out.println("A m�dia �: " + soma / quantidade);
		System.out.println("A quantidade de notas inseridas �: " + quantidade);
		
		entrada.close();
	}

}
