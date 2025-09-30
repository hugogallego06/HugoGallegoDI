package EjerciciosSWITCH;

import java.util.Scanner;

public class MesEstacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un mes (del 1- 12) : ");
        int m = scanner.nextInt();
        switch (m){
            case 12,1,2:
                System.out.println("Invierno");
                break;
            case 3,4,5:
                System.out.println("Primavera");
                break;
            case 6,7,8:
                System.out.println("Verano");
                break;
            case 9,10,11:
                System.out.println("Otoño");
                break;
            default:
                System.out.println("Mes invalido");
        }
    }
}
