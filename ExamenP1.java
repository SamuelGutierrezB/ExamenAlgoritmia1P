//Samuel Gutierrez Barona 22310388 4P

import java.util.Random;
import java.util.Vector;

public class ExamenP1 {
    public static void main(String[] args) {
        int filas = 10;
        int columnas = 10;

        Vector<Vector<Integer>> matriz = new Vector<>(filas);

        for (int i = 0; i < filas; i++) {
            Vector<Integer> fila = new Vector<>(columnas);
            for (int j = 0; j < columnas; j++) {
                fila.add(0);
            }
            matriz.add(fila);
        }

        Random rand = new Random(); // Perdon, me gustan los randoms, no paint jajaja
                                    // pero se imprimen las conexiones *no* dirigidas
        int vertices = 0;
        while (vertices < 6) {
            int filaAleatoria = rand.nextInt(filas);
            int columnaAleatoria = rand.nextInt(columnas);
            if (matriz.get(filaAleatoria).get(columnaAleatoria) != 1) {
                matriz.get(filaAleatoria).set(columnaAleatoria, 1);
                matriz.get(columnaAleatoria).set(filaAleatoria, 1);
                vertices++;
            }
        }

        for (Vector<Integer> fila : matriz) { // por cada elemento en fila "x"
            for (int elemento : fila) { // por cada elemento en columna "y" jsjs
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}