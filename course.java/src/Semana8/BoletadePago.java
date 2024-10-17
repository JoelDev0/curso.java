package Semana8;

import java.util.Scanner;

/*Elaborar un programa que permita ingresar mediante un menú la información de un empleado, su salario y sus boletas emitidas .
Opción 1: Se debe pedir el nombre y el tipo de empleado (contratado o nombrado)
Opción 2: Se debe ingresar el salario mensual, número de boletas emitidas y número de mes en curso .
Opción 3: Elaborar el reporte ASCII (validar que los datos hayan sido ingresados)
• Utilizar String.format() para generar el reporte. Almacene el reporte en una variable String.*/
public class BoletadePago {
    Scanner scanner =new Scanner(System.in);
    String nombreEmpleado = "";
    String tipoEmpleado = "";
    double salarioMensual = 0;
    boolean[] boletasEmitidas = new boolean[12]; // Para 12 meses
    int mesActual = 0;
    boolean datosIngresados = false;

    while (true){
        System.out.println("Menú:");
        System.out.println("1. Ingresar nombre y tipo de empleado");
        System.out.println("2. Ingresar salario, boletas emitidas y mes actual");
        System.out.println("3. Generar reporte ASCII");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();  // Limpiar el buffer

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el nombre del empleado: ");
                nombreEmpleado = sc.nextLine();

                System.out.print("Ingrese el tipo de empleado (Contratado/Nombrado): ");
                tipoEmpleado = sc.nextLine().toLowerCase().contains("contratado") ? "Contratado" : "Nombrado";

                datosIngresados = true;
                break;

            case 2:
                System.out.print("Ingrese el salario mensual: ");
                salarioMensual = sc.nextDouble();

                System.out.print("Ingrese el número de mes actual (1-12): ");
                mesActual = sc.nextInt();

                for (int i = 0; i < mesActual; i++) {
                    System.out.printf("¿Se emitió boleta para el mes %d? (1 para Sí, 0 para No): ", i + 1);
                    int emitida = sc.nextInt();
                    boletasEmitidas[i] = emitida == 1;
                }
                break;

            case 3:
                if (!datosIngresados) {
                    System.out.println("Primero debe ingresar los datos del empleado.");
                    break;
                }
    }
}
