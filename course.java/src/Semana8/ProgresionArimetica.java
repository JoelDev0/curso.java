package Semana8;
/*Escribir un programa en Java para mostrar
los N primeros números de una progresión
aritmética o geométrica.
• El usuario determina el tipo de progresión,
y proporciona el valor inicial, la razón y el
número de términos a generar.
• La serie de números debe acumularse en
una cadena utilizando String.format() antes
de mostrar la progresión.*/
import java.util.Scanner;
public class ProgresionArimetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicitar los datos del usuario
        System.out.println("Ingrese el tipo de progresión (aritmética o geométrica): ");
        String tipoProgresion = scanner.nextLine().toLowerCase();
        System.out.print("Ingrese el valor inicial: ");
        int valorInicial = scanner.nextInt();
        System.out.print("Ingrese la razón (diferencia para aritmética o factor para geométrica): ");
        int razon = scanner.nextInt();
        System.out.print("Ingrese el número de términos a generar: ");
        int n = scanner.nextInt();

        // Crear la cadena que acumula la serie de la progresión
        StringBuilder serie = new StringBuilder();

        // Generar la progresión aritmética o geométrica
        int valorActual = valorInicial;
        for (int i = 0; i < n; i++) {
            serie.append(String.format("%d ", valorActual));  // Formatear y acumular en la cadena
            if (tipoProgresion.equals("aritmetica")) {
                valorActual += razon;  // Progresión aritmética (suma)
            } else if (tipoProgresion.equals("geometrica")) {
                valorActual *= razon;  // Progresión geométrica (multiplicación)
            } else {
                System.out.println("Tipo de progresión no válido.");
                return;
            }
        }

        // Mostrar la serie completa
        System.out.println("La serie de " + tipoProgresion + " es:");
        System.out.println(serie.toString().trim());  // Trim para quitar espacio al final
    }
}
