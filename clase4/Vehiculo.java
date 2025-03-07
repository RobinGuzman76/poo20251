package clase4;

public class Vehiculo {
    // Atributos de la clase
    private String marca;
    private String color;
    private double cilindraje;
    private String chassis;
    private double peso;
    private String potencia;

    // Constructor de la clase me permite inicializar el objeto
    // El constructor de la clase se reconoce porque tiene el mismo nombre de la
    // clase

    public Vehiculo(String marca, String color, double cilindraje, String chassis, double peso, String potencia) {
        this.marca = marca;
        this.color = color;
        this.cilindraje = cilindraje;
        this.chassis = chassis;
        this.peso = peso;
        this.potencia = potencia;
    }

    public String getMarca() {
        return marca;
    }

    // this.marca hace referencia al atributo de la clase
    // marca hace referencia al parámetro del método
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Métodos de la clase
    // Permite mostrar el estado del objeto
    public String toString() {
        return "Vehiculo {Marca: " + marca + "\nColor: " + color + "\nCilindraje: " + cilindraje + "\nChassis: "
         + chassis + "\nPeso: " + peso + "\nPotencia: " + potencia + "}";
    }

    public void acelerar() {
        System.out.println("El vehículo está acelerando");
    }
    
    public void frenar() {
        System.out.println("El vehículo está frenando");
    }

    public void girarIzquierda() {
        System.out.println("El vehículo está girando a la izquierda");
    }

    public void girarDerecha() {
        System.out.println("El vehículo está girando a la derecha");
    }

    public void retroceder() {
        System.out.println("El vehículo está retrocediendo");
    }
}
