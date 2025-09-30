package EjerciciosIF;

import java.util.Scanner;
public class Ejercicios {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        //comparar1();
        //multiplos20rango();
        //capicua4digitos();
        //incrementoDecremento();
        //incrementosConidiciones();

    }

    public static void comparar1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriebe un numero");
        int n1 = scanner.nextInt();
        System.out.println("Escriebe otro numero");
        int n2 = scanner.nextInt();
        if (n1 > n2) {
            System.out.println("El primero es el mayor" + n1);
        } else if (n2 > n1) {
            System.out.println("El primero es el mayor" + n1);
        } else {
            System.out.println("Ambos iguales");
        }
    }

    public static void multiplos20rango() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un numero");
        int n = scanner.nextInt();
        boolean resultado = n % 20 == 0;
        boolean numeroRango = n <= 100 && n >= -100;
        if (resultado && numeroRango) {
            System.out.println("Es multiplo de 20 y esta entre -100 y 100");
        } else if (numeroRango) {
            System.out.println("Esta en el rango");
        } else if (resultado) {
            System.out.println("Es multiplo de 20");
        } else {
            System.out.println("No es ninguna");
        }
    }

    public static void capicua4digitos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce un numero de 4 digitos");
        int n = scanner.nextInt();
        if (n < 1000 || n > 9999) {
            System.out.println("no tiene 4 digitos");
        }
        int u = n % 10, d = (n / 10) % 10, c = (n / 100) % 10, m = (n / 1000);
        if (u == m && d == c) {
            System.out.println("Es capicua");
        } else {
            System.out.println("No es capicua");
        }
    }

    public static void incrementoDecremento() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un entero");
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            n++;
            System.out.println(n);
        } else {
            n--;
            System.out.println(n);
        }
    }

    public static void incrementosConidiciones() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int n = scanner.nextInt();
        int res = n;
        if (n % 2 == 0) {
            res += 2;
        }
        if (n % 3 == 0) {
            res += 3;
        }
        if (n % 5 == 0) {
            res += 5;
        }
        if (res == n) {
            res += 1;
        }
        System.out.println(res);
    }
}