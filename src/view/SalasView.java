package view;

import model.DataSalas;
import model.Salas;
import model.Salas;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class SalasView extends JPanel {

    public SalasView(ArrayList<Salas> salas) {
        this.setLayout(new GridLayout(4, 3));

        for (Salas sala : salas) {
            JPanel panelSala = crearPanelSala(sala.getNombre(), sala.getEstado());
            this.add(panelSala);
        }
    }

    private JPanel crearPanelSala(String nombre, String estado) {
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder(nombre));

        // Cambiar el color del panel según el estado
        switch (estado) {
            case "En uso":
                panel.setBackground(Color.RED);
                break;
            case "Disponible":
                panel.setBackground(Color.GREEN);
                break;
            case "Fuera de servicio":
                panel.setBackground(Color.YELLOW);
                break;
            default:
                panel.setBackground(Color.WHITE);
                break;
        }

        return panel;
    }
}
