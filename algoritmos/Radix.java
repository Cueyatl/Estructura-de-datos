class Radix extends Auxiliares {
    // Función de utilidad para obtener el valor máximo en arr[]
    // La función principal que ordena arr[] de
    // tamaño n usando Radix Sort
    static void metodoRadix(int arr[], int n) {
        // Encuentra el número máximo para conocer la cantidad de dígitos
        int m = getMax(arr, n);
        // Hace counting sort para cada dígito. Nota que
        // en lugar de pasar el número de dígito, se pasa exp.
        // exp es 10^i donde i es el número de dígito actual
        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(arr, n, exp);
        printArray(arr);
    }
}