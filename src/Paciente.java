public class Paciente extends Persona {
    private String historialMedico;

    public Paciente(int id, String nombre, String historialMedico) {
        super(id, nombre);
        this.historialMedico = historialMedico;
    }

    public String getHistorialMedico() {
        return historialMedico;
    }

    public String toString() {
        return getId() + "," + getNombre() + "," + historialMedico;

    }
}


