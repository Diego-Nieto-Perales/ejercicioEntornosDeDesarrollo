package Ejercicios;

public class Metodos {

	public static void main(String[] args) {
		
		System.out.println(concatenacionDeStrings("hola ", "que tal?"));
		
		System.out.println(caracter(49));
		
		System.out.println(caracterConDecimal('a'));
		
		multiplosDeTres(60);

	}

	
	static String concatenacionDeStrings (String cadena1, String cadena2) {
		
		String concatenacion = cadena1 + cadena2;
		
		return concatenacion ;
	}
	
	
	static char caracter (int numero) {
		
		char retorno = (char) numero;
		
		return retorno;
		
	}
	
	
	static double caracterConDecimal (char caracter) {
		
		
		double retorno = caracter;
		
		
		return retorno;
	}
	
	
	static void multiplosDeTres (int numeroFinal) {
		
		int multiplos = 0;
		
//		while(multiplos <= numeroFinal) {
//			
//			System.out.println(multiplos);
//			multiplos += 3;
//			
//		}
		
		
		for (int i = 0; i <= numeroFinal; ) {
			
			System.out.println(i);
			i +=3;
			
		}
		
		
		
	}
	
	
}
