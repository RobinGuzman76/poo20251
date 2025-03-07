package clase4;

public class ParkingNow {
    private String placa;
    private int cilindraje;
    private long horaIngreso;
    private long horaSalida;

    // Constructor de la clase
    public ParkingNow(String placa, int cilindraje, long horaIngreso, long horaSalida) {
        this.placa = placa;
        this.cilindraje = cilindraje;
        this.horaIngreso = horaIngreso;
        this.horaSalida = horaSalida;
    }

    // Métodos de la clase
    public String getPlaca() {
        return placa;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public long getHoraIngreso() {
        return horaIngreso;
    }

    public long getHoraSalida() {
        return horaSalida;
    }

    // this.placa hace referencia al atributo de la clase
    // placa hace referencia al parámetro del método
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public void setHoraIngreso(long horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public void setHoraSalida(long horaSalida) {
        this.horaSalida = horaSalida;
    }

    // Permite mostrar el estado del objeto
    public String toString() {
        return "Bienvenido a ParkingNow | Placa: " + placa + "\nCilindraje: " + cilindraje + "\nHora de ingreso: " + horaIngreso
                + "\nHora de Salida: " + horaSalida +" | ";
    }

    public void ingresoVehiculo() {
        System.out.println("El vehículo con placa " + placa + " ha ingresado al parqueadero" + " a las " + horaIngreso);
    }

    // Método para retirar el vehículo
    public void retirarVehiculo(long horaSalida) {
        long tiempoTranscurrido = horaSalida - horaIngreso;
        double tiempoHoras = tiempoTranscurrido / 3600000.0;
        double valorPagar = 0.0;

        if (tiempoHoras <= 1) {
            valorPagar = 2000.0;
        } else if (tiempoHoras > 1 && tiempoHoras <= 3) {
            valorPagar = 3000.0;
        } else if (tiempoHoras > 3 && tiempoHoras <= 5) {
            valorPagar = 4000.0;
        } else if (tiempoHoras > 5 && tiempoHoras <= 8) {
            valorPagar = 5000.0;
        } else {
            valorPagar = 6000.0;
        }

        System.out.println("El valor a pagar es: " + valorPagar);
    }

    public class Parqueadero {
        private ParkingNow[] motosBajoCilindraje; // Arreglo para motos de bajo cilindraje
        private ParkingNow[] motosAltoCilindraje; // Arreglo para motos de alto cilindraje
        private static final int TARIFA_MIN_30 = 0;
        private static final int TARIFA_31_60 = 800;
        private static final int TARIFA_MAS_60 = 2000;

        public Parqueadero() {
            motosBajoCilindraje = new ParkingNow[20]; //20 puestos para motos de 400cc o menos
            motosAltoCilindraje = new ParkingNow[10]; //10 puestos para motos de más de 400cc
        }
            // Metodo para registrar la entrada de una moto
        public boolean registrarEntradaMoto(String placa, int cilindraje, long horaIngreso, int puesto, long horaSalida) {
            long horaDeIngreso = System.currentTimeMillis(); // Captura la hora de ingreso

            // Verificar si hay espacio en el parqueadero
            if (cilindraje <= 400) {
                if (puesto >= 0 && puesto < 20 && motosBajoCilindraje[puesto] == null) {
                    motosBajoCilindraje[puesto] = new ParkingNow(placa, cilindraje, horaIngreso, horaSalida);
                    return true;
                }
            } else {
                if (puesto >= 0 && puesto < 10 && motosAltoCilindraje[puesto] == null) {
                    motosAltoCilindraje[puesto] = new ParkingNow(placa, cilindraje, horaIngreso, horaSalida);
                    return true;
                }
            }
            return false; // No hay espacio en el parqueadero
        }

        // Motodo para calcular el valor a pagar

        public int calcularValorPagar(long horaIngreso) {
            long tiempoTranscurrido = (System.currentTimeMillis() - horaIngreso) / 60000; // Tiempo en minutos

            if (tiempoTranscurrido <= 30) {
                return TARIFA_MIN_30;
            } else if (tiempoTranscurrido > 30 && tiempoTranscurrido <= 60) {
                return TARIFA_31_60;
            } else {
                return TARIFA_MAS_60;
            }
        }
    }
}