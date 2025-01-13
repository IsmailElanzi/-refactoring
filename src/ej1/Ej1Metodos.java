package ej1;

import java.util.Scanner;

public class Ej1Metodos {

    /**
     * Imprime "Eco.." tantas veces como indique el número recibido.
     * @param n número de veces que se imprime el mensaje.
     */
    public static void printEcoMessage(int repetitions) {
        if (repetitions <= 0) {
            System.out.println("El número de repeticiones debe ser mayor que 0.");
            return;
        }

        for (int i = 0; i < repetitions; i++) {
            System.out.println("Eco..");
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el número de veces que quiere que se imprima el mensaje: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Por favor, introduzca un número entero válido.");
                return;
            }

            int repetitions = scanner.nextInt();
            printEcoMessage(repetitions);
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
    }
}
