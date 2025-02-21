package clase3;

public class Arreglos {
    public static void main(String[] args) {
        // Creacion del arreglo de enteros
        int[] a = { 3, 5, 6, 10, 20, 1, 4, 9 };
        // Recorre y mostrar los lementos del arreglo
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]=" + a[i]);
        }
    }
}