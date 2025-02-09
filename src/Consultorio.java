import java.util.*;

public class Consultorio implements BaseDatos {
    private List<Doctor> doctores;
    private List<Paciente> pacientes;
    private List<Cita> citas;

    public Consultorio() {
        this.doctores = new ArrayList<>();
        this.pacientes = new ArrayList<>();
        this.citas = new ArrayList<>();
        cargarDatos();
    }

    public void agregarDoctor(Doctor doctor) {
        doctores.add(doctor);
        guardarDatos();
    }

    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
        guardarDatos();
    }

    public void crearCita(Cita cita) {
        if (doctores.contains(cita.getDoctor()) && pacientes.contains(cita.getPaciente())) {
            citas.add(cita);
            guardarDatos();
        } else {
            System.out.println("Error: Doctor o paciente no registrado.");
        }
    }

    @Override
    public void guardarDatos() {
        System.out.println("Datos guardados correctamente.");
    }

    @Override
    public void cargarDatos() {
        System.out.println("Datos cargados correctamente.");
    }
}