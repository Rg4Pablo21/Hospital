package view;

import model.Paciente;

import java.util.ArrayList;
import java.util.List;

public class DataPacientes {
    private List<Paciente> pacientes;

    public DataPacientes() {
        pacientes = new ArrayList<>();


        pacientes.add(new Paciente("Pedro Sánchez", "psanchez@gmail.com", "555-1112", "Calle Luna 123",
                "15/03/1991", "09:00 AM", "Chequeo General", 2, "Dr. Reyes"));
        pacientes.add(new Paciente("Lucía Herrera", "lherrera@yahoo.com", "555-2223", "Av. Sol 789",
                "21/07/1984", "10:30 AM", "Consulta por Dolor", 1, "Dra. Molina"));
        pacientes.add(new Paciente("Miguel Ramírez", "mramirez@gmail.com", "555-3334", "Calle Estrella 321",
                "05/09/1979", "02:00 PM", "Chequeo General", 3, "Dr. Torres"));
        pacientes.add(new Paciente("Sara Pérez", "sarap@gmail.com", "555-4445", "Calle Mar 456",
                "11/06/1990", "11:00 AM", "Consulta por Dolor", 2, "Dra. Gómez"));
        pacientes.add(new Paciente("Javier Ruiz", "jruiz@hotmail.com", "555-5556", "Av. Nube 654",
                "09/01/1983", "01:30 PM", "Chequeo General", 1, "Dr. Reyes"));
        pacientes.add(new Paciente("Carmen López", "clopez@outlook.com", "555-6667", "Calle Brisa 234",
                "28/10/1996", "10:00 AM", "Consulta por Dolor", 4, "Dra. Molina"));
        pacientes.add(new Paciente("Roberto Díaz", "rdiaz@gmail.com", "555-7778", "Av. Lluvia 987",
                "03/04/1992", "03:00 PM", "Examen de Laboratorio", 3, "Dr. Torres"));
        pacientes.add(new Paciente("María Castro", "mcastro@gmail.com", "555-8889", "Calle Nieve 543",
                "16/12/1987", "04:00 PM", "Chequeo General", 1, "Dra. Gómez"));
        pacientes.add(new Paciente("Carlos Rodríguez", "crodriguez@hotmail.com", "555-9990", "Av. Viento 213",
                "22/02/1975", "08:30 AM", "Consulta por Dolor", 2, "Dr. Reyes"));
        pacientes.add(new Paciente("Elena Fernández", "efernandez@gmail.com", "555-1011", "Calle Flor 876",
                "30/06/1997", "11:30 AM", "Chequeo General", 1, "Dra. Molina"));
        pacientes.add(new Paciente("Luis Sánchez", "lsanchez@gmail.com", "555-2022", "Av. Montaña 654",
                "14/08/1985", "01:00 PM", "Consulta por Dolor", 3, "Dr. Torres"));
        pacientes.add(new Paciente("Sofía Martínez", "smartinez@yahoo.com", "555-3033", "Calle Arena 876",
                "27/11/1993", "02:30 PM", "Chequeo General", 2, "Dra. Gómez"));
        pacientes.add(new Paciente("Tomás Gil", "tgil@hotmail.com", "555-4044", "Calle Cielo 654",
                "12/05/1988", "09:30 AM", "Examen de Laboratorio", 4, "Dr. Reyes"));
        pacientes.add(new Paciente("Valeria Rivas", "vrivas@gmail.com", "555-5055", "Av. Río 321",
                "05/09/1992", "10:15 AM", "Consulta por Dolor", 1, "Dra. Molina"));
        pacientes.add(new Paciente("Gabriel Vargas", "gvargas@gmail.com", "555-6066", "Calle Lago 987",
                "18/03/1977", "03:15 PM", "Chequeo General", 3, "Dr. Torres"));
        pacientes.add(new Paciente("Daniela Moreno", "dmoreno@outlook.com", "555-7077", "Calle Loma 654",
                "23/08/1995", "04:30 PM", "Consulta por Dolor", 2, "Dra. Gómez"));
        pacientes.add(new Paciente("Ricardo Jiménez", "rjimenez@gmail.com", "555-8088", "Av. Viento 876",
                "01/10/1991", "01:45 PM", "Chequeo General", 1, "Dr. Reyes"));
        pacientes.add(new Paciente("Inés Gutiérrez", "igutierrez@gmail.com", "555-9099", "Calle Sol 765",
                "15/04/1989", "11:45 AM", "Consulta por Dolor", 4, "Dra. Molina"));
        pacientes.add(new Paciente("Héctor Cruz", "hcruz@gmail.com", "555-1113", "Av. Brisa 543",
                "09/07/1980", "02:45 PM", "Examen de Laboratorio", 2, "Dr. Torres"));
        pacientes.add(new Paciente("Clara Medina", "cmedina@hotmail.com", "555-2224", "Calle Verde 987",
                "11/12/1982", "04:45 PM", "Chequeo General", 1, "Dra. Gómez"));

    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }
}
