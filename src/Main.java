import javax.swing.*;
import java.awt.*;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Naturás");
        Dimension width;
        ventana.setSize(1800,1000);

        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.BLUE);
        mainPanel.setLayout(new GridLayout(1,2));

        JPanel panel1= new JPanel();
        panel1.setBackground(Color.BLACK);

        JPanel panel2=new JPanel();
        panel2.setBackground(Color.pink);
        panel2.setLayout(new GridLayout(1,2));


        mainPanel.add(panel1);
        mainPanel.add(panel2);

        ventana.add(mainPanel);
        ventana.setVisible(true);

        ventana.setVisible(true);


    }
}