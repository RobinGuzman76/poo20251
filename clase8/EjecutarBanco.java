package clase8;

public class EjecutarBanco {
    // Método main
    // Crear un objeto para validar las clases Cliente, Cuenta y Banco
    public static void main(String[] args) {

        /*  Crear un objeto de la clase Cuenta
        Cuenta ObjCuenta1 = new Cuenta(10203456, "Ahorros", 2000.0);
        Cuenta ObjCuenta2 = new Cuenta(10203457, "Corriente", 5000.0);
        */

        // Crear un objeto de la clase Cuenta con arreglo de objetos
        Cuenta[] cuentas = new Cuenta[2];
        cuentas[0] = new Cuenta(10203456, "Ahorros", 2000.0);
        cuentas[1] = new Cuenta(10203457, "Corriente", 5000.0);

        // Crear un objeto de la clase Cliente
        Cliente ObjCliente1 = new Cliente(1234567890, "Juan Pérez");
        Cliente ObjCliente2 = new Cliente(1234567891, "Ana Gómez");

        // Crear un objeto de la clase Banco
        Banco ObjBanco1 = new Banco("Banco Colpatria", "Av. 123", cuentas);
        Banco ObjBanco2 = new Banco("Banco Davivienda", "Calle 456", cuentas);

        // Mostrar los datos del banco
        System.out.println("Datos del banco:");
        System.out.println(ObjBanco1);

        // Mostrar los datos del cliente
        System.out.println("Datos del cliente:");
        System.out.println(ObjBanco1.consultarCliente(ObjCliente1));
        
        // Mostrar los datos del banco
        System.out.println("Datos del banco:");
        System.out.println(ObjBanco2);
        
        // Mostrar los datos del cliente
        System.out.println("Datos del cliente:");
        System.out.println(ObjBanco2.consultarCliente(ObjCliente2));
    }
}