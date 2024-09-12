package Semana5;

import java.util.Scanner;

/*• Una tienda de celulares ofrece distintos planes tarifarios en función de la marca que se compre, así como descuentos aplicados de acuerdo con el plazo de pago promocional escogido (ver tablas).
• Escribe un programa en Java que solicite al usuario la marca del celular y el plazo de pago, y muestre el monto del plan, el descuento que le corresponda y el monto final a pagar.
• Mostrar un mensaje de error si alguna opción ingresada es incorrecta.*/
public class TiendaCelulares {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int opcionMarca;
        int opcionPlazo;
        double planTarifario = 0,
                porcentageDescuento = 0,
                montoDescuento;
        System.out.printf("Marcas de celular disponibles:\n" +
                "[1] Motorola\n" +
                "[2] LG\n" +
                "[3] Samsung\n" +
                "[4] Huawei\n" +
                "[5] iPhone\nIngrese una opción: ");
        opcionMarca = lector.nextInt();
        switch (opcionMarca) {
            case 1:
                planTarifario = 29.90;
                break;
            case 2:
                planTarifario = 36.00;
                break;
            case 3:
                planTarifario = 46.80;
                break;
            case 4:
                planTarifario = 62.00;
                break;
            case 5:
                planTarifario = 71.00;
                break;
            default:
                System.out.println("Opción de celular incorrecta");
                break;
        }
        if (opcionMarca >= 1 && opcionMarca <= 5) {
            System.out.printf("\nPlazos de pago:\n" +
                    "[1] A 06 meses\n" +
                    "[2] A 12 meses\n" +
                    "[3] A 18 meses\nIngrese una opción: ");
            opcionPlazo = lector.nextInt();
            switch (opcionPlazo) {
                case 1:
                    porcentageDescuento = 13.2;
                    break;
                case 2:
                    porcentageDescuento = 12.0;
                    break;
                case 3:
                    porcentageDescuento = 11.2;
                    break;
                default:
                    System.out.printf("Opción de plazo incorrecto.");
                    break;
            }
            if (opcionPlazo >= 1 && opcionPlazo <= 3) {
                montoDescuento = planTarifario * porcentageDescuento / 100.0;
                System.out.printf("\n%-25s : %8.2f\n%-25s : %8.2f\n" +
                                "%-25s : %8.2f\n%-25s : %8.2f",
                        "Plan tarifario", planTarifario,
                        "Porcentage de descuento", porcentageDescuento,
                        "Monto de descuento", montoDescuento,
                        "Pago final mensual", (planTarifario - montoDescuento));
            }
        }
    }

}

