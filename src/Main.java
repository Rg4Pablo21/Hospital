import model.Enfermeras;
import model.Salas;
import model.Secretarias;
import servicios.bdDoctores;
import view.DoctorView;



import javax.swing.*;

public class Main extends JFrame {
    public static void main(String[] args) {


        Enfermeras enfermeras = new Enfermeras();
        Salas salas = new Salas();
        Secretarias secretarias = new Secretarias();

        bdDoctores bdDoctoresService = new bdDoctores();




        DoctorView doctorView = new DoctorView();


        System.out.println("Enfermeras: " + enfermeras);
        System.out.println("Salas: " + salas);
        System.out.println("Secretarias: " + secretarias);
        System.out.println("Paciente;");


        doctorView.show();
    }
}
