package EjerciciosIF;

import java.util.Scanner;

public class EjerciciosFechas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce dia");
        int d=scanner.nextInt();
        System.out.println("Introduce mes");
        int m =scanner.nextInt();
        System.out.println("Introduce año");
        int a= scanner.nextInt();
        boolean ok= m >= 1 && m <= 12 && d >= 1 && d <= validarFechaSimple(m);
        System.out.println(ok ? "Fecha correcta" : "Fecha incorrecta");
    }
    public static int validarFechaSimple(int m){
        switch (m){
            case 2: return 28;
            case 4: case 6: case 9: case 11: return 30;
            default: return 31;
        }
    }
}
