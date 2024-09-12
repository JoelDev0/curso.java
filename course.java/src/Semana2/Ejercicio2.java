package Semana2;

import java.util.Scanner;

/*Mostrar el reporte formateado como se indica. Por ejemplo, si el usuario ingresa 235, la suma de sus dígitos es 10, y deberá mostrarse el mensaje: “la suma de 2 + 3 + 5 = 10”
-Indicar adicionalmente si el número ingresado tuvo o no tres cifras.*/
public class Ejercicio2 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario un número entero de tres cifras
        System.out.print("Introduce un número entero de tres cifras: ");
        int numero = scanner.nextInt();

        // Verificar si el número tiene tres cifras
        if (numero >= 100 && numero <= 999) {
            // Descomponer el número en centenas, decenas y unidades
            int centena = numero / 100;
            int decena = (numero / 10) % 10;
            int unidad = numero % 10;

            // Calcular la suma de los dígitos
            int suma = centena + decena + unidad;

            // Mostrar el reporte formateado
            System.out.println("La suma de " + centena + " + " + decena + " + " + unidad + " = " + suma);
        } else {
            // Informar que el número no tiene tres cifras
            System.out.println("El número ingresado no tiene tres cifras.");
        }

        // Cerrar el objeto Scanner
        scanner.close();


    }
}
