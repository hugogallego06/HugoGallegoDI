package EjerciciosSWITCH;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un entero: ");
        int numero =scanner.nextInt();
        switch (Math.abs(numero)%2){
            case 0:
                System.out.println("Es par");
                break;
            default:
                System.out.println("Es impar");
        }
    }
}
