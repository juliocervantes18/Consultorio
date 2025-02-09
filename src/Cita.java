import javax.xml.crypto.Data;

public class Cita {
    private int idCita;
    private Data fechahora;
    private String motivo;
    private Doctor doctor;
    private Paciente paciente;

    public Cita(int idCita, Data fechahora, String motivo, Doctor doctor, Paciente paciente){
        this.idCita = idCita;
        this.fechahora = fechahora;
        this.motivo = motivo;
        this.doctor = doctor;
        this.paciente = paciente;
    }
public Object getDetallesCita(){
        return "Identificacion de la Cita: "+ idCita + "Fecha: "+ fechahora + "Motivo de la cita: " + motivo + "Doctor adicinado a " + doctor.getNombre() + paciente + "Paciente " + paciente.getNombre();
    }

}

