package controle.exercicios;

import java.util.Scanner;

public class Advinhacao {
	
	public static void main(String[] args) {
		
		int numero = 6;
		int contador = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um n?mero para tentar adivinhar!");
		int numUsuario = entrada.nextInt();
		
		while (numero != numUsuario && contador < 9) {
			contador++;
			int tentativas = 10 - contador;
			System.out.printf("Voc? ainda tem %d tentativas\n", tentativas);
			
			
			if (numUsuario < numero) {
				System.out.println("N?mero menor que o c?digo. Digite novamente!");
				numUsuario = entrada.nextInt();
			} else if (numUsuario > numero){
				System.out.println("N?mero maior que o c?digo. Digite novamente!");
				numUsuario = entrada.nextInt();
			} 
		}
		
		if (numUsuario == numero) {
			System.out.println("Voc? encontrou o n?mero. Parab?ns!");
		} else {
			System.out.println("Sua tentativas acabaram!");
		}
		entrada.close();
	}

}
