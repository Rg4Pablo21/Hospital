package view;

import model.DoctorGeneral;
import servicios.bdDoctores;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class LoginView extends JFrame {

    //Objetos Globales
    private JLabel user;
    private JTextField usuario;
    private JPasswordField password;
    private JButton boton;

    public LoginView(){

        //CONFIGURACIÓN DE MI VENTANA
        this.setLocationRelativeTo(null);
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

        JLabel user = new JLabel("Email");
        panel2.add(user, restricciones);

        // Usar la variable global "usuario"
        this.usuario = new JTextField();
        usuario.setPreferredSize(new Dimension(350, 40));
        restricciones.gridx = 0;
        restricciones.gridy = 1;
        panel2.add(usuario, restricciones);

        JLabel contra = new JLabel("Password");
        restricciones.gridy = 2;
        restricciones.gridx = 0;
        panel2.add(contra, restricciones);

        // Usar la variable global "password"
        this.password = new JPasswordField();
        password.setPreferredSize(new Dimension(350, 40));
        restricciones.gridx = 0;
        restricciones.gridy = 3;
        panel2.add(password, restricciones);

        //BOTÓN
        // Usar la variable global "boton"
        this.boton = new JButton("Login");
        boton.setPreferredSize(new Dimension(100, 25));
        restricciones.gridy = 4;
        restricciones.gridx = 0;
        panel2.add(boton, restricciones);

        //AGREGAR PANELES AL MAIN PANEL
        mainPanel.add(panel1);
        mainPanel.add(panel2);

        this.add(mainPanel);
        this.setVisible(true);
    }

    //Métodos del login
    public String getCorreo(){
        return usuario.getText();
    }

    public String getPassword(){
        return new String(password.getPassword());
    }

    public void addLoginViewListener(ActionListener listener){
        boton.addActionListener(listener);
    }
}
