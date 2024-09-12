package Semana2;

import java.util.Scanner;

/*Escribe un programa que genere una boleta de venta como la mostrada (salida con formato).
• Debes solicitar: nombre de cliente, nombre del producto, precio y cantidad comprada.
• Si el cliente se llama ANA o JUAN (String.equals), descontar el 5%.
• Si el nombre del producto contiene la palabra GAMER (String.contains), descontar adicionalmente el 2%.
• Ingresar los datos de dos productos distintos.*/
public class Ejercicio4 {
    public static void main(String[] args) {
// Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar los datos del cliente
        System.out.print("Introduce el nombre del cliente: ");
        String cliente = scanner.nextLine();

        // Variables para almacenar los totales de los productos
        double total = 0;

        // -------------------- Producto 1 --------------------
        System.out.println("Producto 1:");
        System.out.print("Introduce el nombre del producto: ");
        String producto1 = scanner.nextLine();

        System.out.print("Introduce el precio del producto: ");
        double precio1 = scanner.nextDouble();

        System.out.print("Introduce la cantidad comprada: ");
        int cantidad1 = scanner.nextInt();
        scanner.nextLine();  // Limpiar el buffer de entrada

        // Calcular el subtotal para el primer producto
        double subtotal1 = precio1 * cantidad1;

        // Aplicar descuentos si el cliente es ANA o JUAN y si el producto contiene "GAMER"
        if (cliente.equalsIgnoreCase("ANA") || cliente.equalsIgnoreCase("JUAN")) {
            subtotal1 *= 0.95;  // Descuento del 5%
        }
        if (producto1.toUpperCase().contains("GAMER")) {
            subtotal1 *= 0.98;  // Descuento adicional del 2%
        }

        // Acumular el subtotal1 al total
        total += subtotal1;

        // -------------------- Producto 2 --------------------
        System.out.println("Producto 2:");
        System.out.print("Introduce el nombre del producto: ");
        String producto2 = scanner.nextLine();

        System.out.print("Introduce el precio del producto: ");
        double precio2 = scanner.nextDouble();

        System.out.print("Introduce la cantidad comprada: ");
        int cantidad2 = scanner.nextInt();
        scanner.nextLine();  // Limpiar el buffer de entrada

        // Calcular el subtotal para el segundo producto
        double subtotal2 = precio2 * cantidad2;

        // Aplicar descuentos si el cliente es ANA o JUAN y si el producto contiene "GAMER"
        if (cliente.equalsIgnoreCase("ANA") || cliente.equalsIgnoreCase("JUAN")) {
            subtotal2 *= 0.95;  // Descuento del 5%
        }
        if (producto2.toUpperCase().contains("GAMER")) {
            subtotal2 *= 0.98;  // Descuento adicional del 2%
        }

        // Acumular el subtotal2 al total
        total += subtotal2;

        // Mostrar la boleta formateada
        System.out.println("\n####################################");
        System.out.println("############ TIENDA ABC ############");
        System.out.println("####################################");
        System.out.println("ID: 0000252145");
        System.out.println("####################################");
        System.out.println("COMPRAS");
        System.out.println("AV. SAENZ PEÑA 376");
        System.out.println("CHICLAYO");
        System.out.println("LOTE: B   TERM: 5268");
        System.out.println("####################################");
        System.out.println("FECHA: 07MAR22  HORA: 15:35");
        System.out.println("VEND: JUAN   CLI: " + cliente.toUpperCase());
        System.out.println("####################################");

        // Mostrar el total con dos decimales usando printf
        System.out.printf("PAGO TOTAL: S/. %.2f\n", total);
        System.out.println("####################################");
        System.out.println("¡¡VUELVA PRONTO!!");
        System.out.println("####################################");

        // Cerrar el objeto Scanner
        scanner.close();
    }
}

