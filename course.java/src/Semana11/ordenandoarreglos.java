package Semana11;

import java.util.Arrays;

public class ordenandoarreglos {
    public static void main(String[] args) {
        int[][] matriz = {{5, 4, 7}, {1, 3, 8}, {2, 9, 6}};
        int[] vector = new int[9];
        int indice = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                vector[indice++] = matriz[i][j];
            }
        }
        Arrays.sort(vector);

        indice = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = vector[indice++];

            }
        }
    }

}
