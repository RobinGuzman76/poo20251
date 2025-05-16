package clase9;
// Nombre del archivo: Pedido.java
public class Cliente {
    private final String cedula;
    private final String nombre;

    // Constructor de la clase Cliente
    public Cliente(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    // Métodos para obtener los atributos del cliente
    public String getCedula() {
        return cedula;
    }

    // Método para obtener el nombre del cliente
    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}