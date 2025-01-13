package ej3;

public class Ej3 {
	
	 private static boolean esConsonante(char letra) {
	        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' 
	            || letra == 'u' || letra == 'A' || letra == 'E' || letra == 'I' 
	            || letra == 'O' || letra == 'U') {
	            return true;
	        } else {
	            return false;
	        }
	    }

	    public static void main(String[] args) {
	        if (esConsonante(letra) == true) {
	            System.out.println("la letra " + letra + " es una vocal");
	        } else {
	            System.out.println("la letra " + letra + " no es una vocal");
	        }

	        char letra = 'B';
	    }

}
