package EjerciciosSWITCH;

import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int n1= scanner.nextInt();
        System.out.println("Introduce otro numero: ");
        int n2= scanner.nextInt();
        System.out.println("Introduce un operador: ");
        char operador = scanner.next().charAt(0);

        switch (operador){
            case '*':
                int m = n1*n2;
                System.out.println(n1+" "+operador+" "+n2+" = "+m);
                break;
            case '/':
                int d = n1/n2;
                System.out.println( n1+" "+operador+" "+n2+" = "+d);
                break;
            case '+':
                int s = n1+n2;
                System.out.println(n1+" "+operador+" "+n2+" = "+s);
                break;
            case '-':
                int me = n1-n2;
                System.out.println(n1+" "+operador+" "+n2+" = "+me);
            default:
                System.out.println("Error no es un operador");
        }
    }
}
