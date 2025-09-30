package EjerciciosSWITCH;

import java.util.Scanner;

public class CodigoProducto {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce un codigo: ");
        String code= s.next();
        switch (code){
            case "001":
                System.out.println("Producto: Lápiz, Precio: 0,50€");
                break;
            case "002":
                System.out.println("Producto: Cuaderno, Precio: 2,00€");
                break;
            case "003":
                System.out.println("Producto: Bolígrafo, Precio: 1,20€");
            break;
            default:
                System.out.println("Código no reconocido");
        }
    }
}
