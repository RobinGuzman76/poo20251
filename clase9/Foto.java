package clase9;

public class Foto extends Producto {
    private String nombreArchivo;

    public Foto(String nombreArchivo) {
        super(0); // Se asigna un valor predeterminado para el número
        this.nombreArchivo = nombreArchivo;
    }

    @Override
    public String descripcion() {
        return "Foto: " + nombreArchivo;
    }
    public void print() {
        System.out.println("Imprimiendo foto: " + nombreArchivo);
    }
}