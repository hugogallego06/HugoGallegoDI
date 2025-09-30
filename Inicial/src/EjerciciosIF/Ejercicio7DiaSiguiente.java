package EjerciciosIF;

import java.util.Scanner;

public class Ejercicio7DiaSiguiente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce dia");
        int d = scanner.nextInt();
        d++;
        System.out.println("Introduce mes");
        int m = scanner.nextInt();
        System.out.println("Introduce año");
        int a = scanner.nextInt();

        if (d>diasMes(m)) {
            d=1; m++;
            if (m > 12) {
                m=1;
                a++;
            }
        }
        System.out.printf("%02d/%02d/%04d\n",d,m,a);
    }
    static int diasMes(int m){
        return (m==2)?28 : (m==4||m==6||m==9||m==11)?30:31;
    }
}
