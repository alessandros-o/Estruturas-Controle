package controle.exercicios;

import java.util.Scanner;

public class ExeZeroDez {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o n?mero: ");
		
		int num1 = entrada.nextInt();
		
		if (num1 <= 10 && num1 >= 0 && num1 % 2 == 0) {
			System.out.println("N?mero v?lido!");
		} else {
			System.out.println("N?mero inv?lido. Digite outro");
		}
		entrada.close();
	}
}
