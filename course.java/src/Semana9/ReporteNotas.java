package Semana9;
/*Generar el reporte mostrado.
• Utilizar arreglos paralelos
inicializados .
• Calcular promedio por alumno
y promedio total
• Los datos deben calcularse a partir de una copia de los arreglos paralelos .
• El reporte ASCII debe generarse haciendo uso de StringBuilder.append()*/
public class ReporteNotas {
    public static void main(String[] args) {
        // Arreglos paralelos
        String[] nombres = {
                "JUAN CARLOS GARCIA RODRIG",
                "ANA MARIELA TORRES MONTEZ",
                "ROSA INOÑAN FARRO",
                "CARLOS ALBERTO ROJAS CHAN",
                "GABRIELA LUCIA ALVITES CH"
        };
        int[] edades = {19, 25, 22, 24, 25};
        int[] grados = {5, 5, 4, 5, 5};
        int[][] notas = {
                {20, 19, 15, 17},  // PC1, PC2, PC3, EF para Juan Carlos
                {20, 18, 16, 15},  // Ana Mariela
                {20, 18, 13, 12},  // Rosa
                {16, 18, 15, 12},  // Carlos Alberto
                {20, 20, 14, 15}   // Gabriela Lucia
        };
        double[] promedios = new double[nombres.length];
        double sumaTotal = 0;
// Usar StringBuilder para generar el reporte
        StringBuilder reporte = new StringBuilder();
        reporte.append("################## REPORTE DE NOTAS ###################\n");
        reporte.append("NOMBRE                            EDAD GRADO PC1 PC2 PC3 EF PROM\n");
        reporte.append("###########################################################\n");

        // Calcular los promedios por alumno y acumular el reporte
        for (int i = 0; i < nombres.length; i++) {
            // Calcular promedio por alumno
            double sumaNotas = 0;
            for (int j = 0; j < notas[i].length; j++) {
                sumaNotas += notas[i][j];
            }
            promedios[i] = sumaNotas / notas[i].length;
            sumaTotal += promedios[i];

            // Formato del reporte por alumno
            reporte.append(String.format(
                    "%-35s %4d %5d %4d %4d %4d %4d %6.2f\n",
                    nombres[i], edades[i], grados[i], notas[i][0], notas[i][1], notas[i][2], notas[i][3], promedios[i]
            ));
        }

        // Calcular promedio total
        double promedioTotal = sumaTotal / nombres.length;

        // Acumular la parte final del reporte
        reporte.append("###########################################################\n");
        reporte.append(String.format("PROMEDIO TOTAL:                                      %.2f\n", promedioTotal));

        // Imprimir el reporte
        System.out.println(reporte.toString());
    }
    }

