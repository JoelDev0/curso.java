package Semana10;
// Programa que solicita los nombres y edades de 5 personas y muestra los datos formateados y un mensaje que indica si son mayores o menos de edad

import java.util.Scanner;

public class EjemploArreglos1 {

    public static void main(String[] args) {
        String[] nombres = new String[5];
        int[] edades= new int[5];
        Scanner scanner =new Scanner(System.in);

        for(int i = 0; i < nombres.length;i++){
            System.out.printf("%d° Persona \n", i+1);
            System.out.printf("Ingrese nombre: ");
            nombres[i]= scanner.nextLine();
            System.out.printf("Ingrese edad: ");
            edades[i] = scanner.nextInt();
            scanner.nextLine();
        }

        for (int i=0;i<nombres.length; i++){
            System.out.printf("%-16s %2d [%s]\n",//los numeros son para el formateado en la salida
            nombres[i],edades[i],
                 edades[i] >=18?
                    "Mayor de edad": "Menor de edad");
        }
    }
}
