import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Consultorio consultorio = new Consultorio();
        Scanner scanner = new Scanner(System.in);

        consultorio.agregarUsuario(new Usuario("admin", "1234"));
        consultorio.agregarUsuario(new Usuario("doctor1", "medico123"));

        System.out.print("Ingrese usuario: ");
        String usuario = scanner.nextLine();
        System.out.print("Ingrese contraseña: ");
        String contrasena = scanner.nextLine();

        if (consultorio.validaracceso(usuario, contrasena)) {
            System.out.println("Bienvenido al sistema.");
        } else {
            System.out.println("Acceso denegado.");
            return;
        }


        Doctor doctor1 = new Doctor(1, "Dr. Cervantes", "Cardiología");
        Paciente paciente1 = new Paciente(101, "Julian", "Sin antecedentes");
        consultorio.agregarDoctor(doctor1);
        consultorio.agregarPaciente(paciente1);


        LocalDateTime fechaHora = LocalDateTime.of(2025, 1, 25, 11, 0);
        Cita cita1 = new Cita(1, fechaHora, "Revisión anual", doctor1, paciente1);
        consultorio.crearCita(cita1);

        System.out.println(cita1.getDetallesCita());
    }
}
