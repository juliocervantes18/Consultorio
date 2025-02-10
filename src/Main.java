import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Consultorio consultorio = new Consultorio();

        Doctor doctor1 = new Doctor(1, "Dr. Cervantes", "Cardiologia");
        Paciente paciente1 = new Paciente(101, "Julian", "No tiene");

        consultorio.agregarDoctor(doctor1);
        consultorio.agregarPaciente(paciente1);

        LocalDateTime fechaHora = LocalDateTime.of(2025, 1, 25,  11, 0);
        Cita cita1 = new Cita(1, fechaHora, "Revision anual", doctor1, paciente1);
        consultorio.crearCita(cita1);

        System.out.println(cita1.getDetallesCita());

        Usuario admin = new Usuario("admin", "1234");
        if (admin.validaracceso("admin", "1234")) {
            System.out.println("Bienvenido.");
        } else {
            System.out.println("Ingrese bien su Usuario o contraseña.");
        }
    }
}