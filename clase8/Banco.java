package clase8;

import java.util.Arrays;

public class Banco {
    // Atributos
    private String nombre;
    private String direccion;
    // private Cuenta cuenta;
    private Cuenta[] cuenta;

    // Constructor
    /*public Banco(String nombre, String direccion, Cuenta cuenta) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cuenta = cuenta;
    } */
   
    public Banco(String nombre, String direccion, Cuenta[] cuenta) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cuenta = cuenta;
    }

    // Métodos
    public String consultarCliente(Cliente cliente) {
        return cliente.toString();
    }

    /*public String toString() {
        return " - Banco: " + nombre + " - Dirección: " + direccion + "\n" + " - Cuenta: " + cuenta;
    }
    */
    public String toString() {
        return " - Banco: " + nombre + " - Dirección: " + direccion + "\n" + " - Cuenta: " + Arrays.toString(cuenta);
    }
}