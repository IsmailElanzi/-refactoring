package ej2;

public class Ej2 {

	private static int contarDivisoresPrimos(int numero) {
        int contador = 1;
        
        for (int i = 2; i <= numero; i++) {
            if (numero % i == 0 && esPrimo(i)) {
                contador++;
            }
        }
        
        return contador;
    }

    public static boolean esPrimo(int n) {
        boolean esPrimo = true;

        for (int i = 2; i < n && esPrimo == false ; i++) {
            if (n % i == 0) {
                esPrimo = false;
            }
        }

        return esPrimo;
    }

    private static void divisoresPrimos(int numero) {
        System.out.println("Los divisores primos de " + numero + " son:");

        for (int i = 2; i <= numero; i++) {
            if (numero % i == 0 && esPrimo(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        divisoresPrimos(numero);
        
        int numero = 28;
        int divisoresPrimos = contarDivisoresPrimos(numero);
        System.out.println("El número de divisores primos de " + numero + " es: " + divisoresPrimos);
    }
	
}
