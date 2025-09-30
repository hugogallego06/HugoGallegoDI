package EjerciciosFOR;

import java.util.Scanner;

public class TablasEnRango {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int a=scanner.nextInt();
        System.out.println("Introduce otro numero");
        int b=scanner.nextInt();

        for (int i = a; i <=b ; i++) {
            System.out.println("Tabla del "+i);
            for (int j = 0; j <= 10; j++) {
            System.out.println(i+" * "+j+" = "+i*j);
            }
        }
    }
}