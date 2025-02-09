import java.time.LocalDateTime;

public class Cita {
    private int idCita;
    private LocalDateTime fechaHora;
    private String motivo;
    private Doctor doctor;
    private Paciente paciente;

    public Cita(int idCita, LocalDateTime fechaHora, String motivo, Doctor doctor, Paciente paciente) {
        this.idCita = idCita;
        this.fechaHora = fechaHora;
        this.motivo = motivo;
        this.doctor = doctor;
        this.paciente = paciente;
    }

    public String getDetallesCita() {
        return "Cita #" + idCita + " - Fecha: " + fechaHora +
                ", Motivo: " + motivo +
                ", Doctor: " + doctor.getNombre() +
                ", Paciente: " + paciente.getNombre();
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Paciente getPaciente() {
        return paciente;
    }
}