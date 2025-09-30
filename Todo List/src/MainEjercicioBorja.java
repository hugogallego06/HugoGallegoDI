import model.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class MainEjercicioBorja {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Tarea> tareas = new ArrayList<>();
        int opcion;

        do {
            System.out.println("1. Registrar tarea");
            System.out.println("2. Modificar tarea");
            System.out.println("3. Listar tareas");
            System.out.println("4. Completar tarea");
            System.out.println("5. Listar tareas completas");
            System.out.println("6. Listar tareas incompletas");
            System.out.println("7. Agregar responsable a tarea");
            System.out.println("8. Agregar encargo a tarea");
            System.out.println("9. Eliminar responsable de tarea");
            System.out.println("10. Eliminar encargo de tarea");
            System.out.println("11. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Tipo de tarea (1=Personal, 2=Profesional): ");
                    int tipo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Descripción: ");
                    String descripcion = sc.nextLine();
                    System.out.print("Número de responsables: ");
                    int numResp = sc.nextInt();
                    sc.nextLine();

                    if (tipo == 1) {
                        System.out.print("Ubicación: ");
                        String ubicacion = sc.nextLine();
                        tareas.add(new TareaPersonal(titulo, descripcion, numResp, ubicacion));
                    } else {
                        System.out.print("Presupuesto: ");
                        int presupuesto = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Fecha límite (YYYY-MM-DD): ");
                        String fechaStr = sc.nextLine();
                        Date fechaLimite = new Date(); // simplificado
                        tareas.add(new TareaProfesional(titulo, descripcion, numResp, presupuesto, fechaLimite));
                    }
                    System.out.println("Tarea registrada correctamente");
                    break;

                case 2:
                    System.out.print("Título de la tarea a modificar: ");
                    String tModificar = sc.nextLine();
                    Tarea tareaMod = null;
                    for (Tarea t : tareas) {
                        if (t.getTitulo().equalsIgnoreCase(tModificar)) {
                            tareaMod = t;
                            break;
                        }
                    }
                    if (tareaMod == null) {
                        System.out.println("Tarea no encontrada");
                        break;
                    }
                    System.out.println("1. Cambiar título");
                    System.out.println("2. Cambiar descripción");
                    System.out.println("3. Cambiar prioridad");
                    System.out.print("Opción: ");
                    int modOp = sc.nextInt();
                    sc.nextLine();
                    switch (modOp) {
                        case 1:
                            System.out.print("Nuevo título: ");
                            tareaMod.setTitulo(sc.nextLine());
                            break;
                        case 2:
                            System.out.print("Nueva descripción: ");
                            tareaMod.setDescripcion(sc.nextLine());
                            break;
                        case 3:
                            System.out.print("Prioritaria? (true/false): ");
                            tareaMod.setPrioritario(sc.nextBoolean());
                            sc.nextLine();
                            break;
                        default:
                            System.out.println("Opción no válida");
                    }
                    break;

                case 3:
                    System.out.println("\n--- LISTA DE TAREAS ---");
                    for (Tarea t : tareas) {
                        System.out.println(t);
                        t.mostrarResponsables();
                        t.listarEncargos();
                        System.out.println("-------------------");
                    }
                    break;

                case 4:
                    System.out.print("Título de la tarea a completar: ");
                    String tCompletar = sc.nextLine();
                    boolean encontrada = false;
                    for (Tarea t : tareas) {
                        if (t.getTitulo().equalsIgnoreCase(tCompletar)) {
                            t.completarTarea();
                            encontrada = true;
                            break;
                        }
                    }
                    if (!encontrada) System.out.println("Tarea no encontrada");
                    break;

                case 5:
                    System.out.println("\n--- TAREAS COMPLETAS ---");
                    for (Tarea t : tareas) {
                        if (t.isCompletada()) System.out.println(t);
                    }
                    break;

                case 6:
                    System.out.println("\n--- TAREAS INCOMPLETAS ---");
                    for (Tarea t : tareas) {
                        if (!t.isCompletada()) System.out.println(t);
                    }
                    break;

                case 7:
                    System.out.print("Título de la tarea: ");
                    String tResp = sc.nextLine();
                    Tarea tareaResp = null;
                    for (Tarea t : tareas) {
                        if (t.getTitulo().equalsIgnoreCase(tResp)) {
                            tareaResp = t;
                            break;
                        }
                    }
                    if (tareaResp == null) {
                        System.out.println("Tarea no encontrada");
                        break;
                    }
                    System.out.print("Nombre del responsable: ");
                    String nombre = sc.nextLine();
                    System.out.print("Apellidos: ");
                    String apellidos = sc.nextLine();
                    System.out.print("DNI: ");
                    String dni = sc.nextLine();
                    System.out.print("Edad: ");
                    int edad = sc.nextInt();
                    sc.nextLine();
                    Persona persona = new Persona(nombre, apellidos, dni, edad);
                    tareaResp.agregarPersona(persona);
                    break;

                case 8:
                    System.out.print("Título de la tarea: ");
                    String tEncargo = sc.nextLine();
                    Tarea tareaEncargo = null;
                    for (Tarea t : tareas) {
                        if (t.getTitulo().equalsIgnoreCase(tEncargo)) {
                            tareaEncargo = t;
                            break;
                        }
                    }
                    if (tareaEncargo == null) {
                        System.out.println("Tarea no encontrada");
                        break;
                    }
                    System.out.print("ID del encargo: ");
                    int idEncargo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Descripción del encargo: ");
                    String descEncargo = sc.nextLine();
                    tareaEncargo.agregarEncargo(new Encargo(descEncargo, idEncargo));
                    break;

                case 9:
                    System.out.print("Título de la tarea: ");
                    String tEliminarResp = sc.nextLine();
                    Tarea tareaEliminarResp = null;
                    for (Tarea t : tareas) {
                        if (t.getTitulo().equalsIgnoreCase(tEliminarResp)) {
                            tareaEliminarResp = t;
                            break;
                        }
                    }
                    if (tareaEliminarResp == null) {
                        System.out.println("Tarea no encontrada");
                        break;
                    }
                    System.out.print("DNI del responsable a eliminar: ");
                    String dniEliminar = sc.nextLine();
                    tareaEliminarResp.quitarResponsable(dniEliminar);
                    break;

                case 10:
                    System.out.print("Título de la tarea: ");
                    String tEliminarEnc = sc.nextLine();
                    Tarea tareaEliminarEnc = null;
                    for (Tarea t : tareas) {
                        if (t.getTitulo().equalsIgnoreCase(tEliminarEnc)) {
                            tareaEliminarEnc = t;
                            break;
                        }
                    }
                    if (tareaEliminarEnc == null) {
                        System.out.println("Tarea no encontrada");
                        break;
                    }
                    System.out.print("ID del encargo a eliminar: ");
                    int idEliminarEnc = sc.nextInt();
                    sc.nextLine();
                    tareaEliminarEnc.borrarEncargo(idEliminarEnc);
                    break;

                case 0:
                    System.out.println("Saliendo del planificador...");
                    break;

                default:
                    System.out.println("Opción no válida");
            }

        } while (opcion != 11);
    }
}

