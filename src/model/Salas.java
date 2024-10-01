package model;

public class Salas {  // Cambiar a singular

    private String nombre;
    private String estado;

    public Salas(String nombre, String estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEstado() {
        return estado;
    }
}
