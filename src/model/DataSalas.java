package model;
import java.util.ArrayList;

public class DataSalas {
    public static ArrayList<Salas> obtenerSalas() {
        ArrayList<Salas> salas = new ArrayList<>();
        salas.add(new Salas("Sala 1", "En uso"));
        salas.add(new Salas("Sala 2", "Disponible"));
        salas.add(new Salas("Sala 3", "Fuera de servicio"));
        salas.add(new Salas("Sala 4", "Disponible"));
        salas.add(new Salas("Sala 5", "En uso"));
        salas.add(new Salas("Sala 6", "Fuera de servicio"));
        salas.add(new Salas("Sala 7", "Disponible"));
        salas.add(new Salas("Sala 8", "En uso"));
        salas.add(new Salas("Sala 9", "Fuera de servicio"));
        salas.add(new Salas("Sala 10", "Disponible"));
        salas.add(new Salas("Sala 11", "En uso"));
        salas.add(new Salas("Sala 12", "Fuera de servicio"));
        return salas;
    }
}
