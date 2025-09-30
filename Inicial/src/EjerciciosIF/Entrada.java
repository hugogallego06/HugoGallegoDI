package EjerciciosIF;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        // lector de teclado SCANNER
        Scanner scanner = new Scanner(System.in);

        System.out.println("Primer programa de repaso");
        // variable -> guardar valor que será utilizado
        final String DNI = "12341234"; // variable FINAL no CAMBIA

        System.out.println("Introduce tu nombre");

        String nombre = scanner.next();
        String correo; // null

        System.out.println("Introduce tu edad");
        int edad = scanner.nextInt();

        // Array -> lista no dinamica -> no constante -> FINAL (depende)

        // ArrayList / HashTable -> lista dinamica -> PUEDE CAMBIAR EL HUECO -> FINAL

        System.out.printf("Mi nombre es %s, tengo %d años y mi DNI es %s\n",nombre,edad,DNI);
    }
}
