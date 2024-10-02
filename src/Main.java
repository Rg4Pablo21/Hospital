import model.Enfermeras;
import model.Salas;
import model.Secretarias;
import servicios.bdDoctores;
import view.DoctorView;
import model.DataSalas;
import view.SalasView;
import model.Medicamento;
import model.DataFarmacia;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class Main extends JFrame {
    public static void main(String[] args) {
        // Crear la instancia de la ventana principal
        Main ventanaPrincipal = new Main();
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaPrincipal.setSize(800, 600); // Ajustar el tamaño de la ventana
        ventanaPrincipal.setVisible(true);
    }

    public Main() {
        // Instanciar las clases que ya tienes
        Enfermeras enfermeras = new Enfermeras();
        Secretarias secretarias = new Secretarias();
        ArrayList<Salas> salas = DataSalas.obtenerSalas();
        bdDoctores bdDoctoresService = new bdDoctores();
        DoctorView doctorView = new DoctorView();

        // Mostrar la información en consola (como tenías anteriormente)
        System.out.println("Enfermeras: " + enfermeras);
        System.out.println("Salas: " + salas);
        System.out.println("Secretarias: " + secretarias);
        System.out.println("Paciente:");

        // Configurar el panel y botones
        JPanel panel = new JPanel();

        JButton btnFarmacia = new JButton("Farmacia");
        btnFarmacia.addActionListener(e -> mostrarTablaMedicamentos());

        // Agregar los botones al panel
        panel.add(btnFarmacia);

        // Agregar el panel a la ventana principal
        add(panel);

        // Mostrar la vista de Doctor
        doctorView.show();
    }

    // Método para mostrar la tabla de medicamentos al presionar el botón "Farmacia"
    private void mostrarTablaMedicamentos() {
        // Crear el modelo de tabla
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Forma Farmacéutica");
        modelo.addColumn("Dosis");
        modelo.addColumn("Principio Activo");
        modelo.addColumn("Fecha de Caducidad");
        modelo.addColumn("Número de Lote");
        modelo.addColumn("Precio");
        modelo.addColumn("Indicaciones");
        modelo.addColumn("Contraindicaciones");


        DataFarmacia dataFarmacia = new DataFarmacia();


        // Llenar la tabla con los datos de los medicamentos
        Medicamento[] Medicamento = new Medicamento[0];
        for (Medicamento med : Medicamento) {
            modelo.addRow(new Object[]{
                    med.getNombre(),
                    med.getFormaFarmaceutica(),
                    med.getDosis(),
                    med.getPrincipioActivo(),
                    med.getFechaCaducidad(),
                    med.getNumeroLote(),
                    med.getPrecio(),
                    med.getIndicaciones(),
                    med.getContraindicaciones()
            });
        }

        // Crear la tabla y el JScrollPane para mostrarla
        JTable tablaMedicamentos = new JTable(modelo);
        JScrollPane scrollPane = new JScrollPane(tablaMedicamentos);

        // Mostrar la tabla en un cuadro de diálogo
        JOptionPane.showMessageDialog(this, scrollPane, "Lista de Medicamentos", JOptionPane.INFORMATION_MESSAGE);
    }
}
