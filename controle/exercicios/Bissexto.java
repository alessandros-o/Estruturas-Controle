package controle.exercicios;



public class Bissexto {
	
	public static void main(String[] args) {
		 
		int ano = 2020;
		
		if (ano % 4 == 0 && ano % 400 == 0 || ano % 100 != 0) {
					System.out.println("Ano Bissexto!");
			} else {
			System.out.println("Ano não é bissexto!");
		}
				
		
	}

}
