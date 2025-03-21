package clase7;

public class Consultor extends Trabajador {
    // Atributos
    private double comision;
    public final double SALARIO_BASE = 3500.0; // Constante

    // Constructor
    public Consultor(int idTrabajador, String nombre, String apellido, double comision) {
        super(idTrabajador, nombre, apellido);
        this.comision = comision;
    }
    
    // Metodo pagar
    public double pagar(){
        return SALARIO_BASE + (SALARIO_BASE * (comision / 100));
    }

    public String toString() {
        return "Consultor{" +
                "idTrabajador: " + super.getIdTrabajador() +
                ", nombre: '" + super.getNombre() + '\'' +
                ", apellido: '" + super.getApellido() + '\'' +
                ", comision: " + comision +
                '}';
    }
}
