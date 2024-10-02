import model.Enfermeras;
import model.Salas;
import model.Salas;
import model.Secretarias;
import servicios.bdDoctores;
import view.DoctorView;
import model.DataSalas;
import view.SalasView;

import javax.swing.*;
import java.util.ArrayList;

public class Main extends JFrame {
    public static void main(String[] args) {

        Enfermeras enfermeras = new Enfermeras();
        Secretarias secretarias = new Secretarias();
        ArrayList<Salas> salas = DataSalas.obtenerSalas();
        bdDoctores bdDoctoresService = new bdDoctores();

        DoctorView doctorView = new DoctorView();

        System.out.println("Enfermeras: " + enfermeras);
        System.out.println("Salas: " + salas);
        System.out.println("Secretarias: " + secretarias);
        System.out.println("Paciente:");

        doctorView.show();
    }
}
