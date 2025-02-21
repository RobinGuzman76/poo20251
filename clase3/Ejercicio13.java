package clase3;

public class Ejercicio13 {
    public static void main(String[] args) {
        /*
         * Dado un arreglo A de N elementos se desea almacenar, los elementos mayores y
         * menores que la media
         * Almacenarlos en Arreglos diferentes
         * Analisis: necesitamos crear el arreglo del tamaño aleatorio y generar numeros
         * aleatorios para que
         * sean almacenados en el arreglos, posteriormente obtenemos la media del
         * arreglo y comparamos cada
         * posiscion del arreglo para determinar si es mayor o menor a la media.
         * 
         * n sera el numero aleatorio para el tamaño del arreglo
         */
        int n = (int) (Math.random() * (15 - 5)) + 5;
        // Declarar el arreglo
        int[] a = new int[n];
        // Llenar el arreglo con numero aleatorios en 0 y 50.
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (50 - 0 + 1)) + 50;
            System.out.println(a[i] + "");
        }
        // Calcular la media del arreglo a
        // Declarar un variable que almacene la del arreglo
        int sumaArreglo = 0;
        for (int i = 0; i < a.length; i++) {
            sumaArreglo += a[i];
        }
        double media = sumaArreglo / a.length;
        System.out.println("Media del arreglo..." + media);
        // Definis la cantidad de elementos que tiene el arreglo por encima y por debajo
        // de la media
        int contadorMayorMedia = 0, contadorMenorMedia = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= media) {
                contadorMayorMedia++;
            } else {
                contadorMenorMedia++;
            }
        }
        // Creacion de los arreglos que almacenan los numeros mayores y menores a la
        // media
        int[] mayores = new int[contadorMayorMedia];
        int[] menores = new int[contadorMenorMedia];

        int posMayores = 0, posMenores = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= media) {
                mayores[posMayores] = a[i];
                posMayores++;
            } else {
                menores[posMenores] = a[i];
                posMenores++;
            }
        }
        // Mostrar el arreglo de los mayores a la media
        for (int i = 0; i < mayores.length; i++) {
            System.out.println(mayores[i] + "");
        }
        System.out.println();
        // Mostrar el arreglo de los mayores a la media
        for (int i = 0; i < menores.length; i++) {
            System.out.println(menores[i] + "");
        }
    }
}
