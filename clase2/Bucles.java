public class Bucles {
    public static void main(String[] args) {
        // for (inicio; condiciones de parada; incremento o decremento)
        for (int i = 1; i <= 5; i++) {
            System.out.println("Numero de Iteracion: " + i);
        }
        /*
         * Estructura del while
         *
         * inicio:
         * while(condicion){
         * codigo----------
         * Incremento o decremento
         * }
         */
        int j = 1;
        while (j <= 5) {
            j++;
            System.out.println("Numero de Iteracion: " + j);
        }
    }
}
