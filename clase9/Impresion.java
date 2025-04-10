package clase9;

public class Impresion extends Producto {
    
    //Atributos
    private String color;
    private Foto[] foto;   //Arreglo de fotos
    
    //Métodos
    public void print(){
        System.out.println("Impresion: " + this.toString());
        for (int i = 0; i < foto.length; i++) {
            System.out.println(foto[i].toString());
        }
    }
    // Constructor
    public Impresion(int numero, String color, Foto[] foto) {
        super(numero);
        this.color = color;
        this.foto = foto;
    }
}