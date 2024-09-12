package Semana2;

import java.util.Scanner;

/*Escribir un programa en Java que solicite un número entero de tres cifras y muestre la suma de sus dígitos.*/
public class Ejercicio1 {
    public static void main(String[] args) {
// Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario un número entero de tres cifras
        System.out.print("Introduce un número entero de tres cifras: ");
        int numero = scanner.nextInt();

        // Validar que el número tiene tres cifras
        if (numero >= 100 && numero <= 999) {
            // Calcular la suma de los dígitos
            int centena = numero / 100;
            int decena = (numero / 10) % 10;
            int unidad = numero % 10;

            int suma = centena + decena + unidad;

            // Mostrar la suma de los dígitos
            System.out.println("La suma de los dígitos es: " + suma);
        } else {
            System.out.println("El número no tiene tres cifras.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}

