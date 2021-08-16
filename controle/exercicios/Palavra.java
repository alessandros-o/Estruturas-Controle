package controle.exercicios;

import java.util.Scanner;

public class Palavra {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String palavra = entrada.next();
		
//		int valor = 0;
		int tamanho = palavra.length();
		
		
		for (int contador = 0; contador != tamanho; contador++) {
			System.out.println(palavra.charAt(contador));
//			valor++;
		}
		
		entrada.close();
		
	}

}
