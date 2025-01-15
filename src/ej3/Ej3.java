package ej3;

public class Ej3 {

	private static boolean esVocal(char letra) {
        return letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' 
            || letra == 'u' || letra == 'A' || letra == 'E' || letra == 'I' 
            || letra == 'O' || letra == 'U';
    }

    public static void main(String[] args) {
        char letra = 'B';
        
        if (esVocal(letra)) {
            System.out.println("La letra " + letra + " es una vocal");
        } else {
            System.out.println("La letra " + letra + " no es una vocal");
        }
    }
}
