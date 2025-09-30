package model;

import java.util.ArrayList;

public abstract class Tarea {

    private String titulo, descripcion;
    private boolean prioritario, completada;
    private Persona[] encargados; // responsables
    private ArrayList<Encargo> listaTareas;

    public Tarea() {}

    public Tarea(String titulo, String descripcion, int numeroPersonas) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        encargados = new Persona[numeroPersonas];
        listaTareas = new ArrayList<>();
    }

    public Tarea(String titulo, String descripcion, boolean prioritario, int numeroPersonas) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.prioritario = prioritario;
        encargados = new Persona[numeroPersonas];
        listaTareas = new ArrayList<>();
    }

    public abstract void enviarRecordatorio();

    public void agregarPersona(Persona persona) {
        for (int i = 0; i < encargados.length; i++) {
            if (encargados[i] == null && !estaDni(persona.getDni())) {
                encargados[i] = persona;
                System.out.println("Persona agregada correctamente");
                return;
            }
        }
        System.out.println("No hay hueco disponible o el DNI ya existe");
    }

    public void quitarResponsable(String dni) {
        for (int i = 0; i < encargados.length; i++) {
            if (encargados[i] != null && encargados[i].getDni().equalsIgnoreCase(dni)) {
                encargados[i] = null;
                System.out.println("Responsable eliminado correctamente");
                return;
            }
        }
        System.out.println("La persona con DNI " + dni + " no está en esta tarea");
    }

    public boolean estaDni(String dni) {
        for (Persona p : encargados) {
            if (p != null && p.getDni().equalsIgnoreCase(dni)) return true;
        }
        return false;
    }

    public void mostrarResponsables() {
        int huecos = 0;
        for (Persona p : encargados) {
            if (p != null) System.out.println(p);
            else huecos++;
        }
        System.out.println("Huecos disponibles: " + huecos);
    }

    private Encargo estaEncargo(int id) {
        for (Encargo e : listaTareas) {
            if (e.getId() == id) return e;
        }
        return null;
    }

    public void agregarEncargo(Encargo encargo) {
        if (estaEncargo(encargo.getId()) != null) {
            System.out.println("Error: ID de encargo duplicado");
        } else {
            listaTareas.add(encargo);
            System.out.println("Encargo agregado correctamente");
        }
    }

    public void borrarEncargo(int id) {
        if (estaEncargo(id) != null) {
            listaTareas.remove(estaEncargo(id));
            System.out.println("Encargo eliminado correctamente");
        } else {
            System.out.println("El ID especificado no existe");
        }
    }

    public void listarEncargos() {
        if (listaTareas.isEmpty()) {
            System.out.println("No hay encargos");
            return;
        }
        for (Encargo e : listaTareas) {
            e.mostrarDatos();
        }
    }

    public void completarEncargo(int id) {
        Encargo e = estaEncargo(id);
        if (e != null && !e.isCompleta()) {
            e.setCompleta(true);
            System.out.println("Encargo completado correctamente");
        } else {
            System.out.println("El encargo no se puede completar o ya está completado");
        }
    }

    public void completarTarea() {
        for (Encargo e : listaTareas) {
            if (!e.isCompleta()) {
                System.out.println("No se puede completar la tarea, hay encargos pendientes");
                return;
            }
        }
        completada = true;
        System.out.println("Tarea completada con éxito");
    }

    public Persona[] getEncargados() {
        return encargados;
    }

    public ArrayList<Encargo> getListaTareas() {
        return listaTareas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isPrioritario() {
        return prioritario;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrioritario(boolean prioritario) {
        this.prioritario = prioritario;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", prioritario=" + prioritario +
                ", completada=" + completada +
                '}';
    }
}
