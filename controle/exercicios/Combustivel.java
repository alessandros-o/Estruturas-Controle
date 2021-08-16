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
		
		System.out.println("Velocidade média: " + velocidade);
		System.out.println("Tempo da viagem: " + tempo);
		System.out.println("A distância percorrida foi: " + distancia);
		System.out.println("A quantidade de combustível consumido foi: " + litrosUsados);
		
		
		entrada.close();
	}

}
