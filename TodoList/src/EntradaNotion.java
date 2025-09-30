import controller.Planificador;
import model.*;

import java.util.Scanner;

public class EntradaNotion {
    public static void main(String[] args) {
        Planificador planificador = new Planificador();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Registrar tarea");
            System.out.println("2. Listar tareas");
            System.out.println("3. Completar tarea");
            System.out.println("4. Agregar persona a tarea");
            System.out.println("5. Agregar encargo a tarea");
            System.out.println("9. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("¿Tipo de tarea? (1 = Ocio, 2 = Trabajo): ");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();

                    System.out.print("Descripción: ");
                    String descripcion = scanner.nextLine();

                    System.out.print("Fecha: ");
                    String fecha = scanner.nextLine();

                    System.out.print("¿Es prioritaria? (true/false): ");
                    boolean prioridad = scanner.nextBoolean();
                    scanner.nextLine();

                    Tarea nuevaTarea = null;

                    if (tipo == 1) {
                        System.out.print("Ubicación: ");
                        String ubicacion = scanner.nextLine();
                        System.out.print("Presupuesto: ");
                        double presupuesto = scanner.nextDouble();
                        scanner.nextLine();
                        new TareaPersonal( id,titulo, descripcion, fecha,prioridad, ubicacion, presupuesto);
                    } else if (tipo == 2) {
                        System.out.print("Proyecto: ");
                        String proyecto = scanner.nextLine();
                        new TareaProfesional(titulo, id,descripcion,fecha, prioridad, proyecto);
                    } else {
                        System.out.println("Tipo inválido.");
                        break;
                    }

                    System.out.print("¿Depende de otra tarea? (s/n): ");
                    String depende = scanner.nextLine();
                    if (depende.equalsIgnoreCase("s")) {
                        System.out.print("ID de la tarea padre: ");
                        int idPadre = scanner.nextInt();
                        scanner.nextLine();
                        Tarea tareaPadre = planificador.buscarPorId(idPadre);
                        if (tareaPadre != null) {
                            System.out.println("Tarea no encontrada por id");
                        } else {
                            System.out.println("Tarea padre no encontrada. Se agrega como tarea principal.");
                            planificador.agregarTarea(nuevaTarea);
                        }
                    } else {
                        planificador.agregarTarea(nuevaTarea);
                    }
                    break;

                case 2:
                    planificador.listarTareas();
                    break;

                case 3:
                    System.out.print("ID de la tarea a completar: ");
                    int idComp = scanner.nextInt();
                    scanner.nextLine();
                    planificador.completarTarea(idComp);
                    break;

                case 4:
                    System.out.print("ID de la tarea: ");
                    int idPersona = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nombre de la persona: ");
                    String nombre = scanner.nextLine();
                    Persona persona = new Persona();
                    planificador.agregarPersonaATarea(idPersona, persona);
                    break;

                case 5:
                    System.out.print("ID de la tarea: ");
                    int idEncargo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Descripción del encargo: ");
                    String descEncargo = scanner.nextLine();
                    Encargo encargo = new Encargo();
                    planificador.agregarEncargoATarea(idEncargo, encargo);
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }
}
