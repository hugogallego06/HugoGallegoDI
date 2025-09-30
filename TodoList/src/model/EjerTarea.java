package model;

import java.util.ArrayList;
import java.util.List;

public abstract class EjerTarea {
    private  int id;
    private  String titulo;
    private  String descripcion;
    private  String fecha;
    private boolean prioridad;
    private  boolean completada = false;
    private  List<Tarea> subtareas = new ArrayList<>();
    private  List<String> personasAsignadas = new ArrayList<>();
    private  List<String> encargos = new ArrayList<>();

    public EjerTarea() {
    }

    public EjerTarea(int id, String titulo, String descripcion, String fecha, boolean prioridad) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.prioridad = prioridad;
    }

    public int getId() {
        return id;
    }

    public void agregarSubtarea(Tarea t) {
        subtareas.add(t);
    }

    public void agregarPersona(String persona) {
        personasAsignadas.add(persona);
    }

    public void agregarEncargo(String encargo) {
        encargos.add(encargo);
    }

    public boolean estaCompletada() {
        if (!subtareas.isEmpty()) {
            for (Tarea t : subtareas) {
                if (!t.isCompletada()) return false;
            }
            completada = true;
        }
        return completada;
    }

    public void completar() {
        if (subtareas.isEmpty()) {
            completada = true;
        }
    }

}
