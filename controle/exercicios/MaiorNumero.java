package controle.exercicios;

import java.util.Scanner;

public class MaiorNumero {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero!");
		int num1 = entrada.nextInt();
		System.out.println("Digite o segundo n�mero!");
		int num2 = entrada.nextInt();
		System.out.println("Digite o terceiro n�mero!");
		int num3 = entrada.nextInt();
		System.out.println("Digite o quarto n�mero!");
		int num4 = entrada.nextInt();
		System.out.println("Digite o quinto n�mero!");
		int num5 = entrada.nextInt();
		System.out.println("Digite o sexto n�mero!");
		int num6 = entrada.nextInt();
		System.out.println("Digite o s�timo n�mero!");
		int num7 = entrada.nextInt();
		System.out.println("Digite o oitavo n�mero!");
		int num8 = entrada.nextInt();
		System.out.println("Digite o nono n�mero!");
		int num9 = entrada.nextInt();
		System.out.println("Digite o d�cimo n�mero!");
		int num10 = entrada.nextInt();
		
		if (num10 > num9 && num10 > num8 && num10 > num7 && num10 > num6 && num10 > num5 && num10 > num4
				&& num10 > num3 && num10 > num2 && num10 > num1) {
			System.out.println(num10 + " � o maior n�mero!");
		} else if (num9 > num10 && num9 > num8 && num9 > num7 && num9 > num6 && num9 > num5 && num9 > num4
				&& num9 > num3 && num9 > num2 && num9 > num1) {
			System.out.println(num9 + " � o maior n�mero!");
		} else if (num8 > num10 && num8 > num9 && num8 > num7 && num8 > num6 && num8 > num5 && num8 > num4
				&& num8 > num3 && num8 > num2 && num8 > num1) {
			System.out.println(num8 + " � o maior n�mero!");
		} else if (num7 > num10 && num7 > num9 && num7 > num8 && num7 > num6 && num7 > num5 && num7 > num4
				&& num7 > num3 && num7 > num2 && num7 > num1) {
			System.out.println(num7 + " � o maior n�mero!");
		} else if (num6 > num10 && num6 > num9 && num6 > num8 && num6 > num7 && num6 > num5 && num6 > num4
				&& num6 > num3 && num6 > num2 && num6 > num1) {
			System.out.println(num6 + " � o maior n�mero!");
		} else if (num5 > num10 && num5 > num9 && num5 > num8 && num5 > num7 && num5 > num6 && num5 > num4
				&& num5 > num3 && num5 > num2 && num5 > num1) {
			System.out.println(num5 + " � o maior n�mero!");
		} else if (num4 > num10 && num4 > num9 && num4 > num8 && num4 > num7 && num4 > num6 && num4 > num5
				&& num4 > num3 && num4 > num2 && num4 > num1) {
			System.out.println(num4 + " � o maior n�mero!");
		} else if (num3 > num10 && num3 > num9 && num3 > num8 && num3 > num7 && num3 > num6 && num3 > num5
				&& num3 > num4 && num3 > num2 && num3 > num1) {
			System.out.println(num3 + " � o maior n�mero!");
		} else if (num2 > num10 && num2 > num9 && num2 > num8 && num2 > num7 && num2 > num6 && num2 > num5
				&& num2 > num4 && num2 > num3 && num2 > num1) {
			System.out.println(num2 + " � o maior n�mero!");
		} else {
			System.out.println(num1 + " � o maior n�mero!");
		}
		
//		else if (num1 > num10 && num1 > num9 && num1 > num8 && num1 > num7 && num1 > num6 && num1 > num5
//				&& num1 > num4 && num1 > num3 && num1 > num2) {
//			System.out.println(num2 + "� o maior n�mero!");
		
		
		entrada.close();
	}

}
