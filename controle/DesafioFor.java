package controle;

public class DesafioFor {
	
	public static void main(String[] args) {
		
		String i = "#";
		for(; !i.equals("######"); i += "#") {
			System.out.println(i);
		}
	}

}


// Perguntar a porque a forma que fiz deu certo

/*
 * String valor = "#";
 * for(String i = ""; !i.equals("#####"); i += "#") {
 * System.out.println(valor);
 * valor += "#"; 
 * }
 */