package model;

import model.DataFarmacia;
import model.Medicamento;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class mostrarTablaMedicamentos {

    private DataFarmacia dataFarmacia;

    public mostrarTablaMedicamentos() {
        this.dataFarmacia = new DataFarmacia(); // Instancia de DataFarmacia
    }

    public void mostrar() {
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

        // Obtener la lista de medicamentos
        List<Medicamento> medicamentos = dataFarmacia.getMedicamentos();

        // Llenar la tabla con los datos de los medicamentos
        for (Medicamento med : medicamentos) {
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
        JOptionPane.showMessageDialog(null, scrollPane, "Lista de Medicamentos", JOptionPane.INFORMATION_MESSAGE);
    }
}
