import java.time.LocalDateTime;

public class Cita {
    private int idCita;
    private LocalDateTime fechaHora;
    private String motivo;
    Doctor doctor;
    Paciente paciente;

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

    @Override
    public String toString() {
        return idCita + "," + fechaHora + "," + motivo + "," + doctor.getId() + "," + paciente.getId();
    }
}