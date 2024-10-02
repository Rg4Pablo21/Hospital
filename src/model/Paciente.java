package model;

public class Paciente {
    private String nombre;
    private String email;
    private String telefono;
    private String direccion;
    private String fechaNacimiento;
    private String horaCita;
    private String motivoCita;
    private int prioridad;
    private String doctor;

    public Paciente(String nombre, String email, String telefono, String direccion,
                    String fechaNacimiento, String horaCita, String motivoCita,
                    int prioridad, String doctor) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.horaCita = horaCita;
        this.motivoCita = motivoCita;
        this.prioridad = prioridad;
        this.doctor = doctor;
    }

    // Getters y setters (encapsulamiento)
    public String getNombre() { return nombre; }
    public String getEmail() { return email; }
    public String getTelefono() { return telefono; }
    public String getDireccion() { return direccion; }
    public String getFechaNacimiento() { return fechaNacimiento; }
    public String getHoraCita() { return horaCita; }
    public String getMotivoCita() { return motivoCita; }
    public int getPrioridad() { return prioridad; }
    public String getDoctor() { return doctor; }
}
