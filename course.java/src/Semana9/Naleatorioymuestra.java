package Semana9;

import java.util.Random;
import java.util.Scanner;

/*Crear un programa en Java que almacene N valores
enteros aleatorios en un arreglo y luego los muestre
en pantalla.
• Acumular los números en una cadena (separados por
coma) utilizando append() de la clase StringBuilder.
• Adicionalmente, debe calcular y mostrar la suma de
los números.
• Recorrer el arreglo utilizando las tres estructuras
repetitivas conocidas.*/
public class Naleatorioymuestra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Solicitar al usuario el valor de N
        System.out.println("Ingrese la cantidad de números aleatorios (N): ");
        int N = scanner.nextInt();

        // Crear el arreglo de tamaño N
        int[] numeros = new int[N];
        int suma = 0;

        // Usar StringBuilder para acumular los números
        StringBuilder cadenaNumeros = new StringBuilder();

        // 1. Llenar el arreglo usando un ciclo 'for'
        for (int i = 0; i < N; i++) {
            numeros[i] = random.nextInt(100);  // Números aleatorios entre 0 y 99
            suma += numeros[i];

            // Acumular en StringBuilder
            cadenaNumeros.append(numeros[i]);
            if (i < N - 1) {
                cadenaNumeros.append(", ");  // Agregar coma solo si no es el último número
            }
        }

        // Mostrar el arreglo usando un ciclo 'while'
        System.out.println("Números generados (usando 'while'): ");
        int index = 0;
        while (index < N) {
            System.out.print(numeros[index]);
            if (index < N - 1) {
                System.out.print(", ");
            }
            index++;
        }
        System.out.println();

        // Mostrar el arreglo usando un ciclo 'do-while'
        System.out.println("Números generados (usando 'do-while'): ");
        int j = 0;
        if (N > 0) {
            do {
                System.out.print(numeros[j]);
                if (j < N - 1) {
                    System.out.print(", ");
                }
                j++;
            } while (j < N);
        }
        System.out.println();

        // Mostrar el reporte final
        System.out.println("Reporte final:");
        System.out.println("Números generados (usando 'for'): " + cadenaNumeros.toString());
        System.out.println("La suma de los números es: " + suma);

        scanner.close();
    }
}
