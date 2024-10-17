package Semana10;
import java.util.Scanner;
/*Escribir un programa que solicite los nombres y edades de
cinco personas y muestre un reporte ASCII con los datos
ingresados, ordenados por edad, en orden ascendente.*/
public class OrdenarEdad {
    public static void main(String[] args) {
        String[] nombres = new String[5];
        int[] edades= new int[5];
        Scanner scanner =new Scanner(System.in);

        //Solicitar los nombres y edades
        for(int i =0;i<nombres.length;i++){
            System.out.printf("%d° Persona \n", i+1);
            System.out.print("Ingrese el nombre: ");
            nombres[i]=scanner.nextLine();
            System.out.print("Ingrese la edad de ");
            edades[i]=scanner.nextInt();
            scanner.nextLine(); //Limpiar el buffer de entrada
        }

        //Ordenar los datos por edad en orden ascendete Bubble sort
        for (int i = 0; i < edades.length - 1; i++) {
            for (int j = 0; j < edades.length - 1 - i; j++) {
                if (edades[j] > edades[j + 1]) {
                    // Intercambiar las edades
                    int tempEdad = edades[j];
                    edades[j] = edades[j + 1];
                    edades[j + 1] = tempEdad;

                    // Intercambiar los nombres correspondientes
                    String tempNombre = nombres[j];
                    nombres[j] = nombres[j + 1];
                    nombres[j + 1] = tempNombre;
                }
            }
        }

        // Mostrar reporte ASCII con los nombres y edades ordenados por edad
        System.out.println("\n--- Reporte de Personas (Ordenado por Edad) ---");
        System.out.printf("%-20s %s\n", "Nombre", "Edad");
        System.out.println("-------------------- -----");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%-20s %d\n", nombres[i], edades[i]);
        }

    }
}
