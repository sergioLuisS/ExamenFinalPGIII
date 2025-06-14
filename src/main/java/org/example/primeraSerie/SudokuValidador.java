package org.example.primeraSerie;

public class SudokuValidador {

    public static boolean esTableroValido(char[][] tablero) {
        // Creamos arreglos booleanos para filas, columnas y subcuadros
        boolean[][] filas = new boolean[9][9];
        boolean[][] columnas = new boolean[9][9];
        boolean[][] subcuadros = new boolean[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char valor = tablero[i][j];

                if (valor == '.') {
                    continue; // Solo validar celdas llenas
                }

                int num = valor - '1'; // Convertimos '1'-'9' a 0-8
                int subcuadroIndex = (i / 3) * 3 + (j / 3); // Índice de subcuadro (0-8)

                // Verificar si ya está en la fila, columna o subcuadro
                if (filas[i][num] || columnas[j][num] || subcuadros[subcuadroIndex][num]) {
                    return false; // Número repetido
                }

                // Marcar el número como presente
                filas[i][num] = true;
                columnas[j][num] = true;
                subcuadros[subcuadroIndex][num] = true;
            }
        }

        return true; // Si pasa todas las validaciones, es válido
    }

    public static void main(String[] args) {
        char[][] tablero = {
                {'8','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        boolean resultado = esTableroValido(tablero);
        System.out.println("¿El tablero es válido? " + resultado);
    }
}



