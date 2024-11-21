package Semana11;

import java.lang.reflect.Array;
import java.util.Arrays;

/*• Utiliza arreglos paralelos, siendo uno
de ellos una matriz que almacene las
notas de PC1, PC2, PC3 y EF.
• Los arreglos deben inicializarse con
los datos mostrados.
• Todos los promedios deben ser
calculados por el programa.
• Deberá mostrarse el reporte
ordenado por nombre.*/
public class reporteASCII {


    public static void main(String[] args) {
        // Datos inicializados
        String[] nombres = {
                "ANA MARIELA TORRES MONTEZ",
                "CARLOS ALBERTO ROJAS CHAN",
                "GABRIELA LUCIA ALVITES CH",
                "JUAN CARLOS GARCIA RODRIG",
                "ROSA INOÑAN FARRO"
        };
        int[] edades = {25, 24, 25, 19, 22};
        int[] grados = {5, 5, 5, 5, 4};
        double[][] notas = {
                {20, 17, 18, 16}, // Notas de ANA MARIELA
                {16, 18, 15, 12}, // Notas de CARLOS ALBERTO
                {20, 20, 14, 15}, // Notas de GABRIELA LUCIA
                {19, 15, 17, 15}, // Notas de JUAN CARLOS
                {20, 18, 12, 13}  // Notas de ROSA INOÑAN
        };
        // Vectores para almacenar promedios individuales y el promedio total
        double[] promedios = new double[nombres.length];
        double sumaPromedios = 0;

        // Calcular promedios por estudiante
        for (int i = 0; i < nombres.length; i++) {
            double sumaNotas = 0;
            for (int j = 0; j < 4; j++) { // Sumar las 4 notas de cada estudiante
                sumaNotas += notas[i][j];
            }
            promedios[i] = sumaNotas / 4; // Promedio individual
            sumaPromedios += promedios[i]; // Sumar al total
        }
        // Promedio total del grupo
        double promedioTotal = sumaPromedios / nombres.length;

        // Ordenar los datos por nombre (usando burbuja)
        for (int i = 0; i < nombres.length - 1; i++) {
            for (int j = 0; j < nombres.length - 1 - i; j++) {
                if (nombres[j].compareTo(nombres[j + 1]) > 0) {
                    // Intercambiar nombres
                    String tempNombre = nombres[j];
                    nombres[j] = nombres[j + 1];
                    nombres[j + 1] = tempNombre;

                    // Intercambiar edades
                    int tempEdad = edades[j];
                    edades[j] = edades[j + 1];
                    edades[j + 1] = tempEdad;

                    // Intercambiar grados
                    int tempGrado = grados[j];
                    grados[j] = grados[j + 1];
                    grados[j + 1] = tempGrado;

                    // Intercambiar notas
                    double[] tempNotas = notas[j];
                    notas[j] = notas[j + 1];
                    notas[j + 1] = tempNotas;

                    // Intercambiar promedios
                    double tempPromedio = promedios[j];
                    promedios[j] = promedios[j + 1];
                    promedios[j + 1] = tempPromedio;
                }
            }
        }

        // Mostrar el reporte
        System.out.println("################################# REPORTE DE NOTAS #################################");
        System.out.println("NOMBRE                               EDAD  GRADO   PC1   PC2   PC3   EF   PROM");
        System.out.println("####################################################################################");
        for (int i = 0; i < nombres.length; i++) {
            System.out.printf("%-35s %4d %6d %5.0f %5.0f %5.0f %5.0f %6.2f\n",
                    nombres[i], edades[i], grados[i], notas[i][0], notas[i][1], notas[i][2], notas[i][3], promedios[i]);
        }
        System.out.println("####################################################################################");
        System.out.printf("PROMEDIO TOTAL: %.2f\n", promedioTotal);
    }
    }

