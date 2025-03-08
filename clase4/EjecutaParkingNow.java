package clase4;

import java.util.Scanner;

public class EjecutaParkingNow {
    public static void main(String[] args) {
        ParkingNow parqueadero = new ParkingNow();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println(" _____________________________________");
            System.out.println("|       --- MENU PRINCIPAL ---        |");
            System.out.println("|_____________________________________|");
            System.out.println("| 1. Registrar Moto                   |");
            System.out.println("| 2. Cobrar y Liberar Puesto          |");
            System.out.println("| 3. Mostrar Estado del Parqueadero   |");
            System.out.println("| 4. Salir                            |");
            System.out.print("| Seleccione una opción:              |");
            System.out.println("\n|_____________________________________|");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese placa de la moto: ");
                    String placa = scanner.next();
                    System.out.print("Ingrese cilindraje de la moto: ");
                    int cilindraje = scanner.nextInt();
                    System.out.print("Ingrese el puesto (0-19 para Motos menores a 400cc, 0-9 para Motos iguales o mayores a 400cc): ");
                    int puesto = scanner.nextInt();
                    System.out.print("Ingrese la hora de ingreso (HHMM): ");
                    int horaIngreso = scanner.nextInt();

                    if (!parqueadero.registrarMoto(placa, cilindraje, puesto, horaIngreso)) {
                        System.out.println("Error: No se pudo registrar la moto.");
                    }
                    break;

                case 2:
                    System.out.print("Ingrese cilindraje de la moto a liberar: ");
                    int cilindrajeCobro = scanner.nextInt();
                    System.out.print("Ingrese el puesto ocupado: ");
                    int puestoCobro = scanner.nextInt();
                    System.out.print("Ingrese la hora de salida (HHMM): ");
                    int horaSalida = scanner.nextInt();

                    int cobro = parqueadero.liberarPuesto(cilindrajeCobro, puestoCobro, horaSalida);
                    if (cobro == -1) {
                        System.out.println("Error: No hay moto registrada en ese puesto o fuera de horario.");
                    }
                    break;

                case 3:
                    parqueadero.mostrarPuestos();
                    break;

                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}