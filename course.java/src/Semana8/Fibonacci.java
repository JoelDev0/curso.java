package Semana8;
/*Escribir un programa para mostrar los N
primeros números de la serie de
Fibonacci, donde N es un valor entero
positivo ingresado por el usuario
(validar)
• Mostrar al final, la suma de los números
mostrados.
• Utilizar String.format() para acumular en
una cadena la serie de números a
mostrar.*/
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N;

        // Validar que el número N sea un entero positivo
        do {
            System.out.println("Ingrese un número entero positivo para N: ");
            N = scanner.nextInt();
            if (N <= 0) {
                System.out.println("El número debe ser mayor que 0. Intente nuevamente.");
            }
        } while (N <= 0);

        // Variables para la serie de Fibonacci
        int num1 = 0, num2 = 1, suma = 0;

        // Variable para acumular la serie y la suma
        String serieFibonacci = "";

        // Generar la serie de Fibonacci
        for (int i = 1; i <= N; i++) {
            // Acumular el número en la serie con formato
            serieFibonacci += String.format("%d", num1);
            if (i < N) {
                serieFibonacci += ", ";  // Agregar coma solo si no es el último número
            }

            // Sumar el número actual
            suma += num1;

            // Calcular el siguiente número en la serie
            int siguiente = num1 + num2;
            num1 = num2;
            num2 = siguiente;
        }

        // Generar el reporte final
        String reporte = String.format(
                "Los primeros %d números de la serie de Fibonacci son:\n%s\n" +
                        "La suma de los números mostrados es: %d",
                N, serieFibonacci, suma
        );

        // Mostrar el reporte
        System.out.println(reporte);

    }
}
