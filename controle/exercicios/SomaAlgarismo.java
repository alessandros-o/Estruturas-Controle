package controle.exercicios;

import java.util.Scanner;

public class SomaAlgarismo {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String num = entrada.next();
		int tamanho = num.length();
		int soma = 0;
		
		
		for (int contador = 0; contador != tamanho; contador++) {
			char i = num.charAt(contador);
			int num2 = Character.getNumericValue(i);
			soma += num2;
		}
		System.out.println(soma);
		
		
		entrada.close();
	}

}
