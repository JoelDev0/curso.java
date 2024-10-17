package Semana9;
/*• Crear la clase Boleta .
• Todos los datos deben estar inicializados .
• Identificar y programar los arreglos paralelos necesarios .
• El programa debe calcular el monto por
cada producto, el IGV y el importe total .
• El reporte ASCII debe generarse
haciendo uso de StringBuilder.append()*/
public class ReporteBoleta {
    public static void main(String[] args) {
// Datos inicializados en arreglos paralelos
        String[] codigos = {"7754125852147", "7752563210489", "7796525415"};
        String[] productos = {"DETERGENTE ULTRA", "JAM.PIZZA", "LECHE EN CAJA"};
        int[] cantidades = {6, 2, 12};
        double[] precios = {3.25, 12.90, 30.50};

        // Calcular los montos por producto
        double[] montos = new double[productos.length];
        double totalGravada = 0;
        for (int i = 0; i < productos.length; i++) {
            montos[i] = cantidades[i] * precios[i];
            totalGravada += montos[i];
        }

        // Calcular IGV (18%) e importe total
        double igv = totalGravada * 0.18;
        double importeTotal = totalGravada + igv;

        // Usar StringBuilder para generar el reporte
        StringBuilder reporte = new StringBuilder();
        reporte.append("TIENDA ABC\n");
        reporte.append("RUC 21521458563\n");
        reporte.append("Chiclayo-Peru\n\n");
        reporte.append("CAJERO: ROSA\n");
        reporte.append("--------------------------------------------------------\n");

        // Agregar cada producto al reporte
        for (int i = 0; i < productos.length; i++) {
            reporte.append(String.format("%s %-20s %2d X %6.2f %8.2f\n",
                    codigos[i], productos[i], cantidades[i], precios[i], montos[i]));
        }

        // Agregar los totales al reporte
        reporte.append("--------------------------------------------------------\n");
        reporte.append(String.format("OP. GRAVADA: %8.2f\n", totalGravada));
        reporte.append(String.format("I.G.V:        %8.6f\n", igv));
        reporte.append(String.format("IMPORTE TOTAL: %8.6f\n", importeTotal));
        reporte.append("--------------------------------------------------------\n");
        reporte.append("CLIENTE: CARLOS\n");

        // Imprimir el reporte
        System.out.println(reporte.toString());
    }
    }

