package model;

public class DoctorGeneral {
    private String usuario;
    private String contraseña;
    private String nombre;
    private String correo;
    private String especialidad;

    // Constructor
    public DoctorGeneral(String usuario, String contraseña, String nombre, String correo, String especialidad) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.correo = correo;
        this.especialidad = especialidad;
    }

    // Métodos getter
    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getEspecialidad() {
        return especialidad;
    }
}
