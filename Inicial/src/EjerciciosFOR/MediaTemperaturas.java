package EjerciciosFOR;

import java.util.Scanner;

public class MediaTemperaturas {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        System.out.println("introduce un numero: ");
        int n = s.nextInt();
        if (n<=10) {
            n=10;
        }
        double suma = 0;
        for (int i = 0; i < n; i++) {
            suma+=s.nextDouble();
            System.out.printf("Media: %.2f\n", suma/n);
        }
    }
}

