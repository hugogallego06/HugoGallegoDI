package EjerciciosSWITCH;

import java.util.Scanner;

public class VocalConsonante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
        System.out.println("Ingrese un caracter para determinar si es vocal o consonante");
        char caracter = scanner.next().charAt(0);
        switch (caracter){
            case 'a','e','i','o','u':
                System.out.println("El carcater ingresado es: "+caracter+" = vocal");
                break;
            default:
                System.out.println("El carcater ingresado es: "+caracter+" = consonante");
        }
    }
}
