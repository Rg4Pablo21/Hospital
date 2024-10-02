package view;
import model.Paciente;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PacienteView {
    private ArrayList<Paciente> listaPacientes;

    public PacienteView() {
        listaPacientes = new ArrayList<>();
    }

    public JPanel panelPaciente(ArrayList<Paciente> listaPacientes) {
        this.listaPacientes = listaPacientes;

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel titulo = new JLabel("Listado de pacientes");
        titulo.setFont(new Font("Arial", Font.BOLD, 16));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(titulo, BorderLayout.NORTH);

        JPanel panelDatos = new JPanel();
        panelDatos.setLayout(new GridLayout(listaPacientes.size() + 1, 4, 10, 10));

        String[] campos = {"NOMBRE", "FECHA_NACIMIENTO", "HORARIO_CITA", "VISITA"};

        for (String campo : campos) {
            JLabel etiqueta = new JLabel(campo);
            etiqueta.setFont(new Font("Arial", Font.BOLD, 12));
            panelDatos.add(etiqueta);
        }

        for (Paciente paciente : listaPacientes) {
            panelDatos.add(new JLabel(paciente.getNombre()));
            panelDatos.add(new JLabel(paciente.getFechaNacimiento()));

        }

        panel.add(new JScrollPane(panelDatos), BorderLayout.CENTER);

        return panel;
    }


}