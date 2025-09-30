package EjerciciosFOR;

import java.util.Scanner;

public class TablasMultiplicar {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Introduce un numero del 0 - 10 :");
    int n =scanner.nextInt();
        for (int i = 0; i <11 ; i++) {
            System.out.println(n +" * "+i+" = "+n*i);
        }
    }
}
