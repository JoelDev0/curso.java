package Semana2;

import java.util.Scanner;

/*Escribe un programa que calcule la distancia que recorre la luz en N días, sabiendo que en un segundo la luz viaja a 299792458 m/s.
• Leer el número de días utilizando la clase Scanner.
• Crear una constante para almacenar la velocidad de la luz.
• Muestra el resultado utilizando salida con formato.*/
public class Ejercicio3 {
    public static void main(String[] args) {
            // Definir una constante para la velocidad de la luz en metros por segundo
            long VELOCIDAD_LUZ = 299792458; // m/s

            // Crear un objeto Scanner para leer la entrada del usuario
            Scanner scanner = new Scanner(System.in);

            // Solicitar el número de días al usuario
            System.out.print("Introduce el número de días: ");
            int dias = scanner.nextInt();

            // Calcular el número de segundos en N días
            long segundos = dias * 24L * 60 * 60;

            // Calcular la distancia que recorre la luz
            long distancia = VELOCIDAD_LUZ * segundos;

            // Mostrar el resultado formateado
            System.out.printf("En %d días, la luz recorre %,d metros.%n", dias, distancia);

            // Cerrar el objeto Scanner
            scanner.close();
        }
    }

