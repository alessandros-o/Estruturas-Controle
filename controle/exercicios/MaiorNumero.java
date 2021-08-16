package controle.exercicios;

import java.util.Scanner;

public class MaiorNumero {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número!");
		int num1 = entrada.nextInt();
		System.out.println("Digite o segundo número!");
		int num2 = entrada.nextInt();
		System.out.println("Digite o terceiro número!");
		int num3 = entrada.nextInt();
		System.out.println("Digite o quarto número!");
		int num4 = entrada.nextInt();
		System.out.println("Digite o quinto número!");
		int num5 = entrada.nextInt();
		System.out.println("Digite o sexto número!");
		int num6 = entrada.nextInt();
		System.out.println("Digite o sétimo número!");
		int num7 = entrada.nextInt();
		System.out.println("Digite o oitavo número!");
		int num8 = entrada.nextInt();
		System.out.println("Digite o nono número!");
		int num9 = entrada.nextInt();
		System.out.println("Digite o décimo número!");
		int num10 = entrada.nextInt();
		
		if (num10 > num9 && num10 > num8 && num10 > num7 && num10 > num6 && num10 > num5 && num10 > num4
				&& num10 > num3 && num10 > num2 && num10 > num1) {
			System.out.println(num10 + " é o maior número!");
		} else if (num9 > num10 && num9 > num8 && num9 > num7 && num9 > num6 && num9 > num5 && num9 > num4
				&& num9 > num3 && num9 > num2 && num9 > num1) {
			System.out.println(num9 + " é o maior número!");
		} else if (num8 > num10 && num8 > num9 && num8 > num7 && num8 > num6 && num8 > num5 && num8 > num4
				&& num8 > num3 && num8 > num2 && num8 > num1) {
			System.out.println(num8 + " é o maior número!");
		} else if (num7 > num10 && num7 > num9 && num7 > num8 && num7 > num6 && num7 > num5 && num7 > num4
				&& num7 > num3 && num7 > num2 && num7 > num1) {
			System.out.println(num7 + " é o maior número!");
		} else if (num6 > num10 && num6 > num9 && num6 > num8 && num6 > num7 && num6 > num5 && num6 > num4
				&& num6 > num3 && num6 > num2 && num6 > num1) {
			System.out.println(num6 + " é o maior número!");
		} else if (num5 > num10 && num5 > num9 && num5 > num8 && num5 > num7 && num5 > num6 && num5 > num4
				&& num5 > num3 && num5 > num2 && num5 > num1) {
			System.out.println(num5 + " é o maior número!");
		} else if (num4 > num10 && num4 > num9 && num4 > num8 && num4 > num7 && num4 > num6 && num4 > num5
				&& num4 > num3 && num4 > num2 && num4 > num1) {
			System.out.println(num4 + " é o maior número!");
		} else if (num3 > num10 && num3 > num9 && num3 > num8 && num3 > num7 && num3 > num6 && num3 > num5
				&& num3 > num4 && num3 > num2 && num3 > num1) {
			System.out.println(num3 + " é o maior número!");
		} else if (num2 > num10 && num2 > num9 && num2 > num8 && num2 > num7 && num2 > num6 && num2 > num5
				&& num2 > num4 && num2 > num3 && num2 > num1) {
			System.out.println(num2 + " é o maior número!");
		} else {
			System.out.println(num1 + " é o maior número!");
		}
		
//		else if (num1 > num10 && num1 > num9 && num1 > num8 && num1 > num7 && num1 > num6 && num1 > num5
//				&& num1 > num4 && num1 > num3 && num1 > num2) {
//			System.out.println(num2 + "é o maior número!");
		
		
		entrada.close();
	}

}
