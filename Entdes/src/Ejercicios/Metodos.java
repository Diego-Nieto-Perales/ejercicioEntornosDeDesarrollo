package Ejercicios;

public class Metodos {

	public static void main(String[] args) {
		
//		System.out.println(concatenacionDeStrings("hola ", "que tal?"));
//		
//		System.out.println(caracter(49));
//		
//		System.out.println(caracterConDecimal('a'));
		
		metodo(51,5); 

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
	
	
	static void metodo(int numeroInicial, int numeroResta) {
		
		while ( numeroInicial > 0 ) {
			
			System.out.println(numeroInicial);
			numeroInicial -= numeroResta;
			
			
		}
		
		
		
	}
	
	
	
}
