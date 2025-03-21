package clase7;

public class Operario extends Trabajador {
    // Atributos
    private double horas;
    public final double SALARIO_BASE = 100.0; // Constante

    // Constructor hereda de la superclase idTrabajador, nombre, apellido
    public Operario(int idTrabajador, String nombre, String apellido, double horas) {
        super(idTrabajador, nombre, apellido);
        this.horas = horas;
    }

    // Metodo pagar
    public double pagar(){
        return SALARIO_BASE * horas;
    }

    public String toString() {
        return "Operario{" +
                "idTrabajador=" + super.getIdTrabajador() +
                ", nombre='" + super.getNombre() + '\'' +
                ", apellido='" + super.getApellido() + '\'' +
                ", horas=" + horas +
                '}';
    }
}
