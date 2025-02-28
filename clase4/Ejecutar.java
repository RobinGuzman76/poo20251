package clase4;

public class Ejecutar {
    public static void main(String[] args) {
        // Crear un objeto de la clase Vehiculo FORMA 1
        Vehiculo objvehiculo1 = new Vehiculo("Toyota", "Blanco", 4.6, "TS1234WE56", 2.8, "120HP");
        
        // Crear un objeto de la clase Vehiculo FORMA 2
        Vehiculo objvehiculo2 = new Vehiculo("Ferrari", "Rojo", 2.0, "MA1234WE56", 1.8, "100HP");
        
        // Mostrar la marca del vehiculo del objeto objvehiculo1
        System.out.println(objvehiculo2.getMarca());

        // Se va a modificar la marca del vehiculo del objeto objvehiculo1
        objvehiculo1.setMarca("Mazda");

        // Mostrar todo el objeto objvehiculo1
        System.out.println(objvehiculo1.toString());
        System.out.println(objvehiculo2);

    }
    
}
