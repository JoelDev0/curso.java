package Semana15;
import java.util.Scanner;
class OperadorArreglos {

    // Método para sumar conjuntos (unión sin repetidos)
    public int[] sumarConjuntos(int[] arr1, int[] arr2) {
        int[] temporal = new int[arr1.length + arr2.length];
        int indice = 0;

        // Copiamos todos los elementos de arr1
        for (int num : arr1) {
            if (!existeEnArreglo(temporal, indice, num)) {
                temporal[indice++] = num;
            }
        }

        // Copiamos todos los elementos de arr2 que no están en arr1
        for (int num : arr2) {
            if (!existeEnArreglo(temporal, indice, num)) {
                temporal[indice++] = num;
            }
        }

        return copiarArreglo(temporal, indice);
    }

    // Método para restar conjuntos (diferencia: arr1 - arr2)
    public int[] restarConjuntos(int[] arr1, int[] arr2) {
        int[] temporal = new int[arr1.length];
        int indice = 0;

        for (int num : arr1) {
            if (!existeEnArreglo(arr2, arr2.length, num)) {
                temporal[indice++] = num;
            }
        }

        return copiarArreglo(temporal, indice);
    }

    // Método para intersectar conjuntos (intersección: arr1 ∩ arr2)
    public int[] intersectarConjuntos(int[] arr1, int[] arr2) {
        int[] temporal = new int[Math.min(arr1.length, arr2.length)];
        int indice = 0;

        for (int num : arr1) {
            if (existeEnArreglo(arr2, arr2.length, num) && !existeEnArreglo(temporal, indice, num)) {
                temporal[indice++] = num;
            }
        }

        return copiarArreglo(temporal, indice);
    }

    // Método auxiliar para verificar si un número existe en un arreglo
    private boolean existeEnArreglo(int[] arreglo, int tamaño, int numero) {
        for (int i = 0; i < tamaño; i++) {
            if (arreglo[i] == numero) {
                return true;
            }
        }
        return false;
    }

    // Método auxiliar para copiar un arreglo con un tamaño específico
    private int[] copiarArreglo(int[] arreglo, int tamaño) {
        int[] resultado = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            resultado[i] = arreglo[i];
        }
        return resultado;
    }
}
class LectorDatos {
    private static final Scanner scanner = new Scanner(System.in);

    // Leer un entero
    public static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextInt();
    }

    // Leer un arreglo de enteros
    public static int[] leerArreglo(String mensaje, int tamaño) {
        System.out.println(mensaje);
        int[] arreglo = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }
        return arreglo;
    }

    // Leer el tamaño de un arreglo
    public static int leerTamaño(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextInt();
    }
}
class Menu {

    public static void mostrarMenu() {
        System.out.println("\n--- Menú de Operaciones con Conjuntos ---");
        System.out.println("1. Sumar conjuntos (unión sin repetidos)");
        System.out.println("2. Restar conjuntos (diferencia sin repetidos)");
        System.out.println("3. Intersectar conjuntos (intersección sin repetidos)");
        System.out.println("4. Salir");
    }
}
public class AppPOO {
    public static void main(String[] args) {
        OperadorArreglos operador = new OperadorArreglos();
        boolean salir = false;

        while (!salir) {
            Menu.mostrarMenu();
            int opcion = LectorDatos.leerEntero("Elige una opción: ");

            switch (opcion) {
                case 1: // Sumar conjuntos
                    int[] arr1 = leerArregloUsuario("primer");
                    int[] arr2 = leerArregloUsuario("segundo");
                    int[] resultadoSuma = operador.sumarConjuntos(arr1, arr2);
                    mostrarArreglo("Resultado (Unión): ", resultadoSuma);
                    break;

                case 2: // Restar conjuntos
                    arr1 = leerArregloUsuario("primer");
                    arr2 = leerArregloUsuario("segundo");
                    int[] resultadoResta = operador.restarConjuntos(arr1, arr2);
                    mostrarArreglo("Resultado (Diferencia): ", resultadoResta);
                    break;

                case 3: // Intersectar conjuntos
                    arr1 = leerArregloUsuario("primer");
                    arr2 = leerArregloUsuario("segundo");
                    int[] resultadoInterseccion = operador.intersectarConjuntos(arr1, arr2);
                    mostrarArreglo("Resultado (Intersección): ", resultadoInterseccion);
                    break;

                case 4: // Salir
                    System.out.println("Saliendo del programa...");
                    salir = true;
                    break;

                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
                    break;
            }
        }
    }

    // Leer un arreglo del usuario
    private static int[] leerArregloUsuario(String nombreArreglo) {
        int tamaño = LectorDatos.leerTamaño("¿Cuántos elementos tiene el " + nombreArreglo + " arreglo? ");
        return LectorDatos.leerArreglo("Ingresa los elementos del " + nombreArreglo + " arreglo:", tamaño);
    }

    // Mostrar un arreglo
    private static void mostrarArreglo(String mensaje, int[] arreglo) {
        System.out.print(mensaje);
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
