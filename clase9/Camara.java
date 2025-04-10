package clase9;

public class Camara extends Producto {

    //Atributos
    private String marca;
    private String modelo;

    // Constructor
    public Camara(int numero, String marca, String modelo) {
        super(numero);
        this.marca = marca;
        this.modelo = modelo;
    }
    // Método toString
    public String toString() {
        return super.toString() + " - Camara: " + marca + " - Modelo: " + modelo;
    }
    
    
}