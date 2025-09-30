package controller;

import model.EjerTarea;
import model.Encargo;
import model.Persona;
import model.Tarea;

import java.util.ArrayList;
import java.util.List;

public class Planificador {
    private ArrayList<EjerTarea> tareas = new ArrayList<>();

    public void agregarTarea(Tarea t) {
        tareas.add(t);
    }

    public Tarea buscarPorId(int id) {
        for (Tarea t : tareas) {
            if (t.getId() == id) return t;
        }
        return null;
    }

    public void listarTareas() {
        for (Tarea t : tareas) {
            t.mostrarDatos();
        }
    }

    public void listarCompletas() {
        for (Tarea t : tareas) {
            if (t.isCompletada()) {
                t.mostrarDatos();
            }
        }
    }

    public void listarIncompletas() {
        for (Tarea t : tareas) {
            if (!t.isCompletada()) {
                t.mostrarDatos();
            }
        }
    }

    public void completarTarea(int id) {
        Tarea t = buscarPorId(id);
        if (t != null) {
            if (t.getListaTareas()!=null) {
                t.completarTarea();
                System.out.println("Tarea completada.");
            } else {
                System.out.println("No se puede completar manualmente: la tarea tiene subtareas.");
            }
        } else {
            System.out.println("Tarea no encontrada.");
        }
    }

    public void agregarPersonaATarea(int id, Persona persona) {
        Tarea t = buscarPorId(id);
        if (t != null) {
            t.asignarResponsable(persona);
            System.out.println("Persona agregada.");
        } else {
            System.out.println("Tarea no encontrada.");
        }
    }

    public void agregarEncargoATarea(int id, Encargo encargo) {
        Tarea t = buscarPorId(id);
        if (t != null) {
            t.agregarEncargos(new Encargo());
            System.out.println("Encargo agregado.");
        } else {
            System.out.println("Tarea no encontrada.");
        }
    }
}
