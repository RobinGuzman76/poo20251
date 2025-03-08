package clase4;

public class ParkingNow {
    private String[] motosBajoCilindraje = new String[20]; // Placas
    private String[] motosAltoCilindraje = new String[10];
    private int[] horaIngresoBajoCilindraje = new int[20]; // Hora en HHMM
    private int[] horaIngresoAltoCilindraje = new int[10];

    private static final int TARIFA_MIN_30 = 0;
    private static final int TARIFA_31_60 = 800;
    private static final int TARIFA_MAS_60 = 2000;
    private static final int HORA_APERTURA = 700; // 07:00 AM
    private static final int HORA_CIERRE = 2200; // 10:00 PM

    // Método para verificar si la hora es válida dentro del horario del parqueadero
    private boolean esHoraValida(int hora) {
        return hora >= HORA_APERTURA && hora <= HORA_CIERRE;
    }

    // Método para registrar una moto y mostrar disponibilidad
    public boolean registrarMoto(String placa, int cilindraje, int puesto, int horaIngreso) {
        if (!esHoraValida(horaIngreso)) {
            System.out.println("Error: El parqueadero solo está disponible de 07:00 a 22:00.");
            return false;
        }

        if (cilindraje < 400) { // Bajo cilindraje
            if (puesto >= 0 && puesto < 20 && motosBajoCilindraje[puesto] == null) {
                motosBajoCilindraje[puesto] = placa;
                horaIngresoBajoCilindraje[puesto] = horaIngreso;
                System.out.println("Moto registrada en puesto " + puesto + " (Bajo Cilindraje).");
                mostrarPuestos();
                return true;
            }
        } else { // Alto cilindraje
            if (puesto >= 0 && puesto < 10 && motosAltoCilindraje[puesto] == null) {
                motosAltoCilindraje[puesto] = placa;
                horaIngresoAltoCilindraje[puesto] = horaIngreso;
                System.out.println("Moto registrada en puesto " + puesto + " (Alto Cilindraje).");
                mostrarPuestos();
                return true;
            }
        }
        return false; // No se pudo registrar
    }

    // Método para calcular la diferencia de tiempo en minutos
    private int calcularDiferenciaMinutos(int horaEntrada, int horaSalida) {
        int horasEntrada = horaEntrada / 100;
        int minutosEntrada = horaEntrada % 100;
        int horasSalida = horaSalida / 100;
        int minutosSalida = horaSalida % 100;

        int minutosTotalesEntrada = (horasEntrada * 60) + minutosEntrada;
        int minutosTotalesSalida = (horasSalida * 60) + minutosSalida;

        return minutosTotalesSalida - minutosTotalesEntrada;
    }

    // Método para calcular el cobro basado en la diferencia de tiempo
    public int calcularCobro(int horaIngreso, int horaSalida) {
        int tiempoTranscurrido = calcularDiferenciaMinutos(horaIngreso, horaSalida);

        if (tiempoTranscurrido <= 30) {
            return TARIFA_MIN_30;
        } else if (tiempoTranscurrido <= 60) {
            return TARIFA_31_60;
        } else {
            return TARIFA_MAS_60;
        }
    }

    // Liberar un puesto, calcular cobro y mostrar disponibilidad
    public int liberarPuesto(int cilindraje, int puesto, int horaSalida) {
        if (!esHoraValida(horaSalida)) {
            System.out.println("Error: El parqueadero solo está disponible de 07:00 a 22:00.");
            return -1;
        }

        if (cilindraje < 400) { // Bajo cilindraje
            if (puesto >= 0 && puesto < 20 && motosBajoCilindraje[puesto] != null) {
                int horaIngreso = horaIngresoBajoCilindraje[puesto];
                motosBajoCilindraje[puesto] = null;
                horaIngresoBajoCilindraje[puesto] = 0;
                int cobro = calcularCobro(horaIngreso, horaSalida);
                System.out.println("Moto retirada del puesto " + puesto + ". Total a pagar: $" + cobro);
                mostrarPuestos();
                return cobro;
            }
        } else { // Alto cilindraje
            if (puesto >= 0 && puesto < 10 && motosAltoCilindraje[puesto] != null) {
                int horaIngreso = horaIngresoAltoCilindraje[puesto];
                motosAltoCilindraje[puesto] = null;
                horaIngresoAltoCilindraje[puesto] = 0;
                int cobro = calcularCobro(horaIngreso, horaSalida);
                System.out.println("Moto retirada del puesto " + puesto + ". Total a pagar: $" + cobro);
                mostrarPuestos();
                return cobro;
            }
        }
        return -1; // No se encontró moto
    }

    // Mostrar estado de los puestos con la placa de la moto
    public void mostrarPuestos() {
        System.out.println("\nPuestos para motos de bajo cilindraje:");
        for (int i = 0; i < 20; i++) {
            if (motosBajoCilindraje[i] == null) {
                System.out.print("[Libre] ");
            } else {
                System.out.print("[" + motosBajoCilindraje[i] + "] ");
            }
        }
        System.out.println("\nPuestos para motos de alto cilindraje:");
        for (int i = 0; i < 10; i++) {
            if (motosAltoCilindraje[i] == null) {
                System.out.print("[Libre] ");
            } else {
                System.out.print("[" + motosAltoCilindraje[i] + "] ");
            }
        }
        System.out.println();
    }
}