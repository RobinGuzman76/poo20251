package clase3;

public class Ejercicio3 {
    public static void main(String[] args) {
        int sumaPares = 0, sumaImpares = 0;
        /*
         * Dado un arreglo lineal de numero, sumar separadamente los numero pares e
         * impares
         * Analisis: Declarar un arreglo, en dos variables ir guardando la suma de los
         * numeros pares e impares
         * Lo anterior debe iterar en un "for" con la condicion de validar si el numero
         * es par o impar (n%2 == 0 -> par)
         */
        int[] arreglo = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] % 2 == 0) {
                sumaPares += arreglo[i];
            } else {
                sumaImpares += arreglo[i];
            }
        }
        System.out.println("La suma de los numero pares es: " + sumaPares);
        System.out.println("La suma de los numero impares: " + sumaImpares);
    }

}
