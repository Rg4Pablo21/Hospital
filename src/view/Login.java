package view;

import javax.swing.*;
import java.awt.*;

class Login extends JFrame {

    public Login() {
        // Configurar el JFrame
        this.setTitle("Login");
        this.setLayout(null);
        this.setBounds(100, 100, 400, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear el panel principal (único)
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 400, 500);
        panel.setBackground(Color.WHITE);

        // Crear y configurar el label de Correo
        JLabel emailLabel = new JLabel("Correo:");
        emailLabel.setBounds(50, 100, 100, 30);
        emailLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        emailLabel.setForeground(Color.DARK_GRAY);
        panel.add(emailLabel);

        // Crear el campo de texto para el correo
        JTextField emailField = new JTextField();
        emailField.setBounds(150, 100, 200, 30);
        panel.add(emailField);

        // Crear y configurar el label de Contraseña
        JLabel passwordLabel = new JLabel("Contraseña:");
        passwordLabel.setBounds(50, 160, 100, 30);
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        passwordLabel.setForeground(Color.DARK_GRAY);
        panel.add(passwordLabel);

        // Crear el campo de contraseña
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(150, 160, 200, 30);
        panel.add(passwordField);

        // Crear el botón de inicio de sesión
        JButton loginButton = new JButton("Iniciar sesión");
        loginButton.setBounds(150, 220, 200, 30);
        loginButton.setFont(new Font("Arial", Font.PLAIN, 14));
        loginButton.setBackground(Color.LIGHT_GRAY);
        loginButton.setFocusPainted(false);
        panel.add(loginButton);


        this.add(panel);


        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }
}
