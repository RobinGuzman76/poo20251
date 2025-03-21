package clase7;

public class EjecutarHerencia {
    public static void main(String[] args) {
        //Arreglo de objetos
        Trabajador[] TB = new Trabajador[3];

        // Crear objetos (instancias)
        TB[0] = new Operario(1, "Juan", "Perez", 135.0);
        TB[1] = new Consultor(2, "Maria", "Gomez", 10);
        TB[2] = new Consultor(3, "Pedro", "Garcia", 20);

        // Mostrar información
        System.out.println("Trabajadores");
        for (Trabajador X : TB) {
            System.out.println(X.getClass() + "-" + X.pagar());
        }
    }    
}