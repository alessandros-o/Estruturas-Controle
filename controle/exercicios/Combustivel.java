package controle.exercicios;

import java.util.Scanner;

public class Combustivel {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o tempo de percurso: ");
		double tempo = entrada.nextDouble();
		
		System.out.println("Informe a velociade: ");
		double velocidade = entrada.nextDouble();
		
		double distancia = tempo * velocidade;
		double litrosUsados = distancia / 12;
		
		System.out.println("Velocidade m?dia: " + velocidade);
		System.out.println("Tempo da viagem: " + tempo);
		System.out.println("A dist?ncia percorrida foi: " + distancia);
		System.out.println("A quantidade de combust?vel consumido foi: " + litrosUsados);
		
		
		entrada.close();
	}

}
