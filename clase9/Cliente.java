package clase9;

public class Cliente{

    //Atributos
    private String cedula;
    private String nombre;

    // Constructor
    public Cliente(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }
    // Método toString
    public String toString() {
        return " - Cliente: " + cedula + " - Nombre: " + nombre;
    }
}