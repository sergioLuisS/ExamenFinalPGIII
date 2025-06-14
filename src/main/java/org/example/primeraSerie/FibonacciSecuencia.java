package org.example.primeraSerie;
import java.util.Arrays;

public class FibonacciSecuencia {
    public static int[] fibonacciSecuencia(int[] firma, int n) {
        if (n == 0) {
            return new int[0]; // Secuencia vacía
        }

        // Si n es 1 o 2, devolver los primeros n elementos de firma
        if (n == 1) {
            return new int[]{firma[0]};
        }
        if (n == 2) {
            return new int[]{firma[0], firma[1]};
        }

        // Si n > 2, construir la secuencia
        int[] secuencia = new int[n];
        secuencia[0] = firma[0];
        secuencia[1] = firma[1];

        for (int i = 2; i < n; i++) {
            secuencia[i] = secuencia[i - 1] + secuencia[i - 2];
        }

        return secuencia;
    }

    public static void main(String[] args) {
        int[] firma = {0, 1};
        int n = 9;

        int[] resultado = fibonacciSecuencia(firma, n);

        // Imprimir resultado
        System.out.println("Secuencia de Fibonacci: " + Arrays.toString(resultado));
    }
}


