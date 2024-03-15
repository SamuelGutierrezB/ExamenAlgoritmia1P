//Samuel Gutierrez Barona 22310388 4P

import java.util.Vector;

public class ExamenP1 {
    public static void main(String[] args) {
        int filas = 4;
        int columnas = 4;

        Vector<Vector<Integer>> matriz = new Vector<>(filas);

        for (int i = 0; i < filas; i++) {
            Vector<Integer> fila = new Vector<>(columnas);
            for (int j = 0; j < columnas; j++) {
                fila.add(0);
            }
            matriz.add(fila);

        }

        for (Vector<Integer> fila : matriz) { // por cada elemento en fila "x"
            for (int elemento : fila) { // por cada elemento en columna "y" jsjs
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}