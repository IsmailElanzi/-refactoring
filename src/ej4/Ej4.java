package ej4;

public class Ej4 {
	
	public static double potenciaIterativa(double a, int n) {
        double resultado = 1.0;
        for (int i = 0; i < n; i++) {
            resultado *= a;
        }
        return resultado;
    }

    public static double potenciaRecursiva(double a, int n) {
        if (n == 0) {
            return 1.0;  
        } else {
            return a * potenciaRecursiva(a, n - 1);  
        }
    }

    public static void main(String[] args) {
        System.out.println("Iterativo: " + potenciaIterativa(a, n));
        System.out.println("Recursivo: " + potenciaRecursiva(a, n));

        double a = 2;
        int n = 3;
    }

}
