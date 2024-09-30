package view;

import model.Paciente;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DoctorView extends JFrame {
    private ArrayList<Paciente> listaPacientes;
    private int[] pantalla = {1300, 800};

    public DoctorView() {

        listaPacientes = new ArrayList<>();
        listaPacientes.add(new Paciente("Pedro Sánchez", "psanchez@gmail.com", "555-1112", "Calle Luna 123",
                "15/03/1991", "09:00 AM", "Chequeo General", 2, "Dr. Reyes"));
        listaPacientes.add(new Paciente("Lucía Herrera", "lherrera@yahoo.com", "555-2223", "Av. Sol 789",
                "21/07/1984", "10:30 AM", "Consulta por Dolor", 1, "Dra. Molina"));
        listaPacientes.add(new Paciente("Miguel Ramírez", "mramirez@gmail.com", "555-3334", "Calle Estrella 321",
                "05/09/1979", "02:00 PM", "Chequeo General", 3, "Dr. Torres"));
        listaPacientes.add(new Paciente("Sara Pérez", "sarap@gmail.com", "555-4445", "Calle Mar 456",
                "11/06/1990", "11:00 AM", "Consulta por Dolor", 2, "Dra. Gómez"));
        listaPacientes.add(new Paciente("Javier Ruiz", "jruiz@hotmail.com", "555-5556", "Av. Nube 654",
                "09/01/1983", "01:30 PM", "Chequeo General", 1, "Dr. Reyes"));
        listaPacientes.add(new Paciente("Carmen López", "clopez@outlook.com", "555-6667", "Calle Brisa 234",
                "28/10/1996", "10:00 AM", "Consulta por Dolor", 4, "Dra. Molina"));
        listaPacientes.add(new Paciente("Roberto Díaz", "rdiaz@gmail.com", "555-7778", "Av. Lluvia 987",
                "03/04/1992", "03:00 PM", "Examen de Laboratorio", 3, "Dr. Torres"));
        listaPacientes.add(new Paciente("María Castro", "mcastro@gmail.com", "555-8889", "Calle Nieve 543",
                "16/12/1987", "04:00 PM", "Chequeo General", 1, "Dra. Gómez"));
        listaPacientes.add(new Paciente("Carlos Rodríguez", "crodriguez@hotmail.com", "555-9990", "Av. Viento 213",
                "22/02/1975", "08:30 AM", "Consulta por Dolor", 2, "Dr. Reyes"));
        listaPacientes.add(new Paciente("Elena Fernández", "efernandez@gmail.com", "555-1011", "Calle Flor 876",
                "30/06/1997", "11:30 AM", "Chequeo General", 1, "Dra. Molina"));
        listaPacientes.add(new Paciente("Luis Sánchez", "lsanchez@gmail.com", "555-2022", "Av. Montaña 654",
                "14/08/1985", "01:00 PM", "Consulta por Dolor", 3, "Dr. Torres"));
        listaPacientes.add(new Paciente("Sofía Martínez", "smartinez@yahoo.com", "555-3033", "Calle Arena 876",
                "27/11/1993", "02:30 PM", "Chequeo General", 2, "Dra. Gómez"));
        listaPacientes.add(new Paciente("Tomás Gil", "tgil@hotmail.com", "555-4044", "Calle Cielo 654",
                "12/05/1988", "09:30 AM", "Examen de Laboratorio", 4, "Dr. Reyes"));
        listaPacientes.add(new Paciente("Valeria Rivas", "vrivas@gmail.com", "555-5055", "Av. Río 321",
                "05/09/1992", "10:15 AM", "Consulta por Dolor", 1, "Dra. Molina"));
        listaPacientes.add(new Paciente("Gabriel Vargas", "gvargas@gmail.com", "555-6066", "Calle Lago 987",
                "18/03/1977", "03:15 PM", "Chequeo General", 3, "Dr. Torres"));
        listaPacientes.add(new Paciente("Daniela Moreno", "dmoreno@outlook.com", "555-7077", "Calle Loma 654",
                "23/08/1995", "04:30 PM", "Consulta por Dolor", 2, "Dra. Gómez"));
        listaPacientes.add(new Paciente("Ricardo Jiménez", "rjimenez@gmail.com", "555-8088", "Av. Viento 876",
                "01/10/1991", "01:45 PM", "Chequeo General", 1, "Dr. Reyes"));
        listaPacientes.add(new Paciente("Inés Gutiérrez", "igutierrez@gmail.com", "555-9099", "Calle Sol 765",
                "15/04/1989", "11:45 AM", "Consulta por Dolor", 4, "Dra. Molina"));
        listaPacientes.add(new Paciente("Héctor Cruz", "hcruz@gmail.com", "555-1113", "Av. Brisa 543",
                "09/07/1980", "02:45 PM", "Examen de Laboratorio", 2, "Dr. Torres"));
        listaPacientes.add(new Paciente("Clara Medina", "cmedina@hotmail.com", "555-2224", "Calle Verde 987",
                "11/12/1982", "04:45 PM", "Chequeo General", 1, "Dra. Gómez"));


        setTitle("Perfil del doctor");
        setSize(pantalla[0], pantalla[1]);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel de encabezado
        JPanel headerPanel = new JPanel();
        headerPanel.setPreferredSize(new Dimension(1300, 60));
        headerPanel.setBackground(Color.DARK_GRAY);
        headerPanel.setLayout(new BorderLayout());

        JLabel hospitalLabel = new JLabel("Hospital Santa Catalina");
        hospitalLabel.setForeground(Color.WHITE);
        hospitalLabel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));
        headerPanel.add(hospitalLabel, BorderLayout.WEST);

        // Panel de usuario
        JPanel userPanel = new JPanel();
        userPanel.setLayout(new GridBagLayout());
        userPanel.setBackground(Color.DARK_GRAY);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);

        JPanel logoPanel = new JPanel();
        logoPanel.setBackground(Color.white);
        logoPanel.setPreferredSize(new Dimension(100, 100));
        userPanel.add(logoPanel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        JLabel doctorNameLabel = new JLabel("Pablo Girón");
        doctorNameLabel.setForeground(Color.WHITE);
        userPanel.add(doctorNameLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        JLabel doctorSpecialtyLabel = new JLabel("Enfermeria");
        doctorSpecialtyLabel.setForeground(Color.WHITE);
        userPanel.add(doctorSpecialtyLabel, gbc);

        headerPanel.add(userPanel, BorderLayout.EAST);
        add(headerPanel, BorderLayout.NORTH);
        add(componentesLateral(), BorderLayout.WEST);
        add(panelPacientes(), BorderLayout.CENTER);

        setVisible(true);
    }

    private JPanel componentesLateral() {
        JPanel menuPanel = new JPanel();
        menuPanel.setPreferredSize(new Dimension(250, pantalla[1]));
        menuPanel.setBackground(Color.DARK_GRAY);

        JPanel menu = new JPanel();
        menu.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;

        menu.add(op("Consultas"), gbc);
        menu.add(op("Salas"), gbc);
        menu.add(op("Farmacia"), gbc);
        menu.add(op("Pacientes Registrados"), gbc);
        menu.add(op("Citar en otra area"), gbc);

        menuPanel.add(menu);
        return menuPanel;
    }

    private JButton op(String texto) {
        JButton op = new JButton(texto);
        op.addActionListener(e -> {
            System.out.println(texto);
        });
        return op;
    }
    private JPanel panelPacientes() {
        PacienteView pacienteView = new PacienteView();
        return pacienteView.panelPaciente(listaPacientes);
    }

    public static void main(String[] args) {
        new DoctorView();
    }
}