import model.*;

import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.Date;

public class Entrada {
    public static void main(String[] args) {
        /*Tarea tarea = new Tarea("Practica DI"
                ,"Esta practica de DI es hacer un programa todoList"
                ,true
                ,3);*/
        /*tarea.asignarResponsable(new Persona("Nombre1","Apellido1","123A",12));
        //tarea.asignarResponsable(new Persona("Nombre1","Apellido1","1234A",12));
        //tarea.asignarResponsable(new Persona("Nombre1","Apellido1","12345A",12));
        tarea.mostrarDatos();*/
        //System.out.printf("El tamaño de la lista de tareas es de %d:\n",tarea.getListaTareas().size());
        /*tarea.agregarEncargos(new Encargo("Codificar la practica",1));
        tarea.agregarEncargos(new Encargo("Planficar la entrega",2));
        tarea.agregarEncargos(new Encargo("Grabar video",3));
        tarea.agregarEncargos(new Encargo("Entregar Practica",4));
        tarea.completarEncargo(1);
        tarea.completarEncargo(2);
        tarea.completarEncargo(3);
        tarea.completarEncargo(4);
        //tarea.eliminarEncargo(4);
        //tarea.listarEncargos();
        tarea.completarTarea();
        */
        TareaProfesional tareaProfesional = new TareaProfesional("Tarea1",1,"descrpcion",2,12,"12/02/23");
        tareaProfesional.asignarResponsable(new Persona("Hugo","Gallego1","12345DA",19));
        tareaProfesional.asignarResponsable(new Persona("Hugo","Gallego2","123456DE",20));
        tareaProfesional.asignarResponsable(new Persona("Hugo","Gallego3","123457DF",21));
        tareaProfesional.agregarEncargos(new Encargo("descripcion",2));
        tareaProfesional.agregarEncargos(new Encargo("descripcion",5));


        System.out.println(tareaProfesional);

        TareaPersonal tareaPersonal= new TareaPersonal("Tarea P2",4,"descipcion",2,"alcorcon");

        ArrayList<Tarea> tareas = new ArrayList<>();
        tareas.add(tareaPersonal);
        tareas.add(tareaProfesional);

        for (Tarea tarea1: tareas){
            tarea1.enviarRecordatorio();
        }

    }
}
