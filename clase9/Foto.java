package clase9;

public class Foto {
    
    //Atributos
    private String fichero;

    //Métodos
    public void print(){
    }

    // Constructor
    public Foto(String fichero) {
        this.fichero = fichero;
    }
    // Método toString
    public String toString() {
        return " - Foto: " + fichero;
    }
    // Método getFichero
    public String getFichero() {
        return fichero;
    }
    // Método setFichero
    public void setFichero(String fichero) {
        this.fichero = fichero;
    }
    
}
