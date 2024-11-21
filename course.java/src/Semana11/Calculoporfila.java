package Semana11;

import java.util.Scanner;

public class Calculoporfila {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //declaracion de la matriz y vectores paralelos
        double[][] matriz=new double[3][3];
        double[]sumas = new double[3];
        double[]promedios = new double[3];

        //Entrada de datos para la matriz
        System.out.println("Introduce los numeros para la matriz 3x3");
        for (int i=0; i<3;i++){
            System.out.println("Fila " + (i + 1) + ":");
            for (int j=0; j<3;j++){
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextDouble();
            }
        }
        //Calculo de sumas y promedios
        for (int i=0;i<3;i++){
            double sumarFila = 0;
            for(int j=0;j<3;j++){
                sumarFila+= matriz[i][j];
            }
            sumas[i]=sumarFila;
            promedios[i]+=sumarFila/3;
        }
        // Mostrar resultados
        System.out.println("\nResultados:");
        System.out.println("Matriz ingresada:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nSuma de cada fila:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Fila " + i + ": " + sumas[i]);
        }

        System.out.println("\nPromedio de cada fila:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Fila " + i + ": " + promedios[i]);
        }
    }
}
