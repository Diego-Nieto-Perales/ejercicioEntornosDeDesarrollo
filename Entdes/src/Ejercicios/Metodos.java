package Ejercicios;

public class Metodos {

	public static void main(String[] args) {
		
		System.out.println(concatenacionDeStrings("hola ", "que tal?"));
		
		System.out.println(caracter(49));

	}

	
	static String concatenacionDeStrings (String cadena1, String cadena2) {
		
		String concatenacion = cadena1 + cadena2;
		
		return concatenacion ;
	}
	
	
	static char caracter (int numero) {
		
		char retorno = (char) numero;
		
		return retorno;
		
	}
	
	
	
}
