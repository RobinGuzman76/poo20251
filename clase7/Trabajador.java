package clase7;

public class Trabajador {
    // Atributos
    private int idTrabajador;
    private String nombre;
    private String apellido;

    // Constructor
    public Trabajador(int idTrabajador, String nombre, String apellido) {
        this.idTrabajador = idTrabajador;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Métodos getter

    public int getIdTrabajador() {
        return idTrabajador;
    }

    public String getNombre() {
        return nombre;
    }

    // Metodo pagar
    public double pagar(){
        return 0.0;
    }

    // Metodo toString
    @Override
    public String toString() {
        return "Trabajador{" +
                "idTrabajador=" + idTrabajador +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }



}
