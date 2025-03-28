package clase8;

public class Cuenta {
    // Atributos
    private int numCuenta;
    private String tipoCuenta;
    private double saldo;

    // Constructor
    public Cuenta(int numCuenta, String tipoCuenta, double saldo) {
        this.numCuenta = numCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
    }

    // Método toString
    public String toString() {
        return " - Numero: " + numCuenta + " - Tipo: " + tipoCuenta + " - Saldo: " + saldo;
    }
}
