
import java.io.*;
import java.util.*;

public class Consultorio implements BaseDatos {
    private List<Doctor> doctores;
    private List<Paciente> pacientes;
    private List<Cita> citas;
    private List<Usuario> usuarios;
    private final String archivo = "db";

    public Consultorio() {
        this.doctores = new ArrayList<>();
        this.pacientes = new ArrayList<>();
        this.citas = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        File Diretorio = new File(archivo);
        if (!Diretorio.exists()) {
            Diretorio.mkdir();
        }
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
        if (doctores.contains(cita.doctor) && pacientes.contains(cita.paciente)) {
            citas.add(cita);
            guardarDatos();
        } else {
            System.out.println("Error: Doctor o paciente no registrado.");
        }
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public boolean validaracceso(String user, String pass) {
        for (Usuario u : usuarios) {
            if (u.validaracceso(user, pass)) {
                return true;
            }
        }
        return false;
    }


    @Override
    public void guardarDatos() {
        try (PrintWriter doctorWriter = new PrintWriter(new FileWriter(archivo + "/doctores.txt"));
             PrintWriter pacienteWriter = new PrintWriter(new FileWriter(archivo + "/pacientes.txt"));
             PrintWriter citaWriter = new PrintWriter(new FileWriter(archivo + "/citas.txt"))) {

            for (Doctor d : doctores) doctorWriter.println(d);
            for (Paciente p : pacientes) pacienteWriter.println(p);
            for (Cita c : citas) citaWriter.println(c);

        } catch (IOException e) {
            System.out.println("Error al guardar los datos: " + e.getMessage());
        }
    }

    @Override
    public void cargarDatos() {
        try {
            File doctorFile = new File(archivo + "/doctores.txt");
            if (doctorFile.exists()) {
                Scanner scanner = new Scanner(doctorFile);
                while (scanner.hasNextLine()) {
                    String[] data = scanner.nextLine().split(",");
                    doctores.add(new Doctor(Integer.parseInt(data[0]), data[1], data[2]));
                }
                scanner.close();
            }

            File pacienteFile = new File(archivo + "/pacientes.txt");
            if (pacienteFile.exists()) {
                Scanner scanner = new Scanner(pacienteFile);
                while (scanner.hasNextLine()) {
                    String[] data = scanner.nextLine().split(",");
                    pacientes.add(new Paciente(Integer.parseInt(data[0]), data[1], data[2]));
                }
                scanner.close();
            }
        } catch (IOException e) {
            System.out.println("Error al cargar los datos: " + e.getMessage());
        }
    }
}


