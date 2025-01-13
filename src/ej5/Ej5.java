package ej5;

public class Ej5 {

	public static void main(String[] args) {
        System.out.println("Fibonacci: " + fibonacciRecursivo(n));
        int n = 6;
    }

    public static int fibonacciRecursivo(int n) {
        if (n == 0 || n == 1) {
            return 1; 
        }
        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2); 
    }
	
}
