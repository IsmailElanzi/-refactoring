package ej1;

import java.util.Scanner;

public class Ej1Metodos {
	
	public static void eco(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Eco..");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        n = scanner.nextInt();
        System.out.print("Ingrese el número de veces que quiere que se imprima el mensaje: ");
        
        eco(n);

        scanner.close();
    }
}
