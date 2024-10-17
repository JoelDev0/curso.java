package Semana8;

import java.util.Scanner;

/*Elaborar un programa que permita ingresar mediante un menú la información de un empleado, su salario y sus boletas emitidas .
Opción 1: Se debe pedir el nombre y el tipo de empleado (contratado o nombrado)
Opción 2: Se debe ingresar el salario mensual, número de boletas emitidas y número de mes en curso .
Opción 3: Elaborar el reporte ASCII (validar que los datos hayan sido ingresados)
• Utilizar String.format() para generar el reporte. Almacene el reporte en una variable String.*/
public class BoletadePago {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String nombreEmpleado = "";
        String tipoEmpleado = "";
        double salarioMensual = 0;
        boolean[] boletasEmitidas = new boolean[12]; // Para 12 meses
        int mesActual = 0;
        boolean datosIngresados = false;


        while (true){
            System.out.println("--------------\nMenú:");
            System.out.println("1. Ingresar nombre y tipo de empleado");
            System.out.println("2. Ingresar salario, boletas emitidas y mes actual");
            System.out.println("3. Generar reporte ASCII");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción:");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer.

            switch (opcion) {
                case 1:
                    // Opción 1: Ingresar nombre y tipo de empleado
                    System.out.print("Ingrese el nombre del empleado: ");
                    nombreEmpleado = scanner.nextLine();
                    System.out.print("Ingrese el tipo de empleado (Contratado/Nombrado): ");
                    tipoEmpleado=scanner.nextLine();

                    if (tipoEmpleado.equals("contratado") || tipoEmpleado.equals("nombrado")) {
                        tipoEmpleado = tipoEmpleado.equals("contratado") ? "Contratado" : "Nombrado";
                        datosIngresados = true;
                        break;  // Si la entrada es válida, salir del bucle
                    } else {
                        System.out.println("Entrada inválida. Por favor ingrese 'Contratado' o 'Nombrado'.");
                    }
                    break;

                case 2:
                    // Opción 2: Ingresar salario, boletas emitidas y mes actual
                    System.out.print("Ingrese el salario mensual: ");
                    salarioMensual = scanner.nextDouble();
                    System.out.print("Ingrese el número de mes actual (1-12): ");
                    mesActual = scanner.nextInt();

                    for (int i = 0; i < mesActual; i++) {
                        System.out.printf("¿Se emitió boleta para el mes %d? (1 para Sí, 0 para No): ", i + 1);
                        int emitida = scanner.nextInt();
                        boletasEmitidas[i] = emitida == 1;
                    }
                    break;

                case 3:
                    // Opción 3: Generar reporte ASCII
                    if (!datosIngresados) {
                        System.out.println("Primero debe ingresar los datos del empleado.");
                    } else {
                        // Generar el reporte usando String.format()
                        String reporte =
                                "#############################################\n" +
                                        "# RESUMEN DE BOLETAS DE PAGO                #\n" +
                                        "#############################################\n" +
                                        String.format("# Empleado: %-33s #\n", nombreEmpleado) +
                                        String.format("# Tipo: [X] %-27s #\n", tipoEmpleado) +
                                        "#############################################\n" +
                                        "# Datos del Salario          Boleta          #\n";

                        int boletasEmitidasCount = 0;
                        for (int i = 0; i < mesActual; i++) {
                            String mes = "";
                            switch (i) {
                                case 0:
                                    mes = "ENE";
                                    break;
                                case 1:
                                    mes = "FEB";
                                    break;
                                case 2:
                                    mes = "MAR";
                                    break;
                                case 3:
                                    mes = "ABR";
                                    break;
                                case 4:
                                    mes = "MAY";
                                    break;
                                case 5:
                                    mes = "JUN";
                                    break;
                                case 6:
                                    mes = "JUL";
                                    break;
                                case 7:
                                    mes = "AGO";
                                    break;
                                case 8:
                                    mes = "SEP";
                                    break;
                                case 9:
                                    mes = "OCT";
                                    break;
                                case 10:
                                    mes = "NOV";
                                    break;
                                case 11:
                                    mes = "DIC";
                                    break;
                            }

                            String boleta = boletasEmitidas[i] ? "SI" : "NO";
                            if (boletasEmitidas[i]) {
                                boletasEmitidasCount++;
                            }
                            reporte += String.format("# Salario %s: S/. %-9.2f %-4s #\n", mes, salarioMensual, boleta);
                        }

                        int boletasRestantes = mesActual - boletasEmitidasCount;
                        double totalPagado = boletasEmitidasCount * salarioMensual;

                        reporte +=
                                "#############################################\n" +
                                        String.format("# Boletas emitidas: %-3d  Boletas Restantes: %-3d #\n", boletasEmitidasCount, boletasRestantes) +
                                        String.format("# Monto total pagado: S/. %-17.2f #\n", totalPagado) +
                                        "#############################################\n";

                        // Mostrar el reporte
                        System.out.println(reporte);
                    }
                    break;
                case 4:
                    // Opción 4: Salir del programa
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        }
    }
    }

