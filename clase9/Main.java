package clase9;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\nMenú Interactivo:");
            System.out.println("1. Crear Pedido");
            System.out.println("2. Imprimir Detalles del Pedido");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    Pedido pedido = crearPedidoInteractivo(scanner);
                    imprimirDetallesPedido(pedido);
                    break;
                case 2:
                    System.out.println("Primero debe crear un pedido.");
                    break;
                case 3:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }

        scanner.close();
    }

    private static Pedido crearPedidoInteractivo(Scanner scanner) {
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el ID del cliente: ");
        String id = scanner.nextLine();
        Cliente cliente = new Cliente(id, nombre);

        List<Producto> productos = new ArrayList<>();
        boolean agregarProductos = true;

        while (agregarProductos) {
            System.out.println("\nSeleccione el tipo de producto a agregar:");
            System.out.println("1. Foto");
            System.out.println("2. Cámara");
            System.out.println("3. Finalizar");
            System.out.print("Opción: ");

            int opcionProducto = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcionProducto) {
                case 1:
                    System.out.print("Ingrese el nombre del archivo de la foto: ");
                    String nombreFoto = scanner.nextLine();
                    Foto foto = new Foto(nombreFoto);
                    productos.add(foto);
                    break;
                case 2:
                    System.out.print("Ingrese la marca de la cámara: ");
                    String marca = scanner.nextLine();
                    System.out.print("Ingrese el modelo de la cámara: ");
                    String modelo = scanner.nextLine();
                    Camara camara = new Camara(productos.size() + 1, marca, modelo);
                    productos.add(camara);
                    break;
                case 3:
                    agregarProductos = false;
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
        if (productos.isEmpty()) {
            System.out.println("No se agregaron productos al pedido. Por favor, agregue al menos un producto.");
            return null;
        }

        return new Pedido(cliente, productos, LocalDate.now(), 12345678);
    }

    private static void imprimirDetallesPedido(Pedido pedido) {
        System.out.println("\nCliente: " + pedido.getCliente().getNombre());
        System.out.println("Productos en el pedido:");
        for (Producto producto : pedido.getProductos()) {
            System.out.println(producto.descripcion());
        }
    }
}