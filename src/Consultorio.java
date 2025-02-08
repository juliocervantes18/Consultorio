import java.util.ArrayList;
import java.util.List;

public class Consultorio implements BaseDatos {
    private List<Doctor> doctores;
    private List<Paciente> pacientes;
    private List<Cita> citas;

    public Consultorio(){
        doctores = new ArrayList<>();
        pacientes = new ArrayList<>();
        citas = new ArrayList<>();
    }
    public void agregarDoctor(Doctor doctor) {
        doctores.add(doctor);

}
