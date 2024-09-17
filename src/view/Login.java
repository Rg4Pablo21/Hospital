package view;

import model.DoctorGeneral;
import servicios.bdDoctores;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

public class Login extends JFrame {

    //Objetos Globales
    private JLabel user;
    private JTextField usuario;
    private JPasswordField password;
    private JButton boton;

    public Login() {

        //CONFIGURACIÓN DE MI VENTANA
        this.setBounds(0, 0, 1600, 1000);

        //PANEL PRINCIPAL
        JPanel mainPanel = new JPanel(new GridLayout(1, 2));

        //PANEL DEL BANNER
        JPanel panel1 = new JPanel(new GridBagLayout());
        panel1.setBackground(Color.black);

        //SEGUNDO PANEL
        JPanel panel2 = new JPanel(new GridBagLayout());
        panel2.setBackground(Color.white);

        //RESTRICCIONES
        GridBagConstraints restricciones = new GridBagConstraints();
        restricciones.gridx = 0;
        restricciones.gridy = 0;

        user = new JLabel("Email");
        panel2.add(user, restricciones);

        usuario = new JTextField();
        usuario.setPreferredSize(new Dimension(350, 40));
        restricciones.gridy = 1;
        panel2.add(usuario, restricciones);

        JLabel contra = new JLabel("Password");
        restricciones.gridy = 2;
        panel2.add(contra, restricciones);

        password = new JPasswordField();
        password.setPreferredSize(new Dimension(350, 40));
        restricciones.gridy = 3;
        panel2.add(password, restricciones);

        //BOTÓN
        boton = new JButton("Login");
        boton.setPreferredSize(new Dimension(100, 25));
        restricciones.gridy = 4;
        panel2.add(boton, restricciones);

        //ACCIÓN DEL BOTÓN
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes implementar la lógica cuando se presione el botón

            }
        });

        mainPanel.add(panel1);
        mainPanel.add(panel2);

        this.add(mainPanel);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public class LoginView {
        // Simulación de los campos de formulario
        private String usuario;
        private String contraseña;

        public LoginView(String usuario, String Contraseña) {
            this.usuario = usuario;
            this.contraseña = Contraseña;
        }

        // Métodos get para recuperar los datos
        public String getUsuario() {
            return usuario;
        }

        public String getContraseña() {
            return contraseña;
        }
    }
}
