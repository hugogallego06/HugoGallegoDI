package model;


public class Encargo {
    private String descripcion;
    private int id;
    private boolean completa;

    public Encargo() {
    }

    public Encargo(String descripcion, int id) {
        this.descripcion = descripcion;
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getId() {
        return id;
    }

    public boolean isCompleta() {
        return completa;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCompleta(boolean completa) {
        this.completa = completa;
    }

    @Override
    public String toString() {
        return "Encargo{" +
                "descripcion='" + descripcion + '\'' +
                ", id=" + id +
                ", completa=" + completa +
                '}';
    }

    public void mostrarDatos(){
        System.out.println("id = " + id);
        System.out.println("descripcion = " + descripcion);
        System.out.println("completa = " + completa);
    }
}
