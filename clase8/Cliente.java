package clase8;

public class Cliente {
    // Atributos
    private long cedula;
    private String nombre;

    // Constructor
    public Cliente(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    // Método toString
    public String toString() {
        return " - Cliente: " + cedula + " - Nombre: " + nombre;
    }
}
