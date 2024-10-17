package Semana8;

import java.util.Scanner;

/*Escribir un programa para recoger los votos
de 10 personas que elegirán un color para
una campaña publicitaria. Los colores son:
celeste, morado y turquesa.
- Mostrar al final, cuántos votos obtuvo cada
color, su porcentaje y qué color resultó
elegido
- Todo el reporte debe generarse y almacenarse en una cadena utilizando String.format */
public class votosCampañaP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Contadores para cada color
        int votosCeleste = 0;
        int votosMorado = 0;
        int votosTurquesa = 0;
        int totalVotos = 10;  // Sabemos que votarán 10 personas
// Ingresar los votos
        for (int i = 1; i <= totalVotos; i++) {
            System.out.println("Persona " + i + ", elija un color (celeste, morado, turquesa): ");
            String voto = scanner.nextLine().toLowerCase();  // Convertimos a minúsculas para evitar errores

            // Incrementar el contador según el color elegido
            if (voto.equals("celeste")) {
                votosCeleste++;
            } else if (voto.equals("morado")) {
                votosMorado++;
            } else if (voto.equals("turquesa")) {
                votosTurquesa++;
            } else {
                System.out.println("Voto inválido, no se contará.");
                i--;  // Si el voto es inválido, repetir el turno
            }
        }
        // Calcular los porcentajes
        double porcentajeCeleste = (votosCeleste * 100.0) / totalVotos;
        double porcentajeMorado = (votosMorado * 100.0) / totalVotos;
        double porcentajeTurquesa = (votosTurquesa * 100.0) / totalVotos;

        // Determinar el color elegido
        String colorElegido;
        if (votosCeleste > votosMorado && votosCeleste > votosTurquesa) {
            colorElegido = "Celeste";
        } else if (votosMorado > votosCeleste && votosMorado > votosTurquesa) {
            colorElegido = "Morado";
        } else if (votosTurquesa > votosCeleste && votosTurquesa > votosMorado) {
            colorElegido = "Turquesa";
        } else {
            colorElegido = "Empate";
        }
        // Generar el reporte
        String reporte = String.format(
                "Resultados de la votación:\n" +
                        "Celeste: %d votos (%.2f%%)\n" +
                        "Morado: %d votos (%.2f%%)\n" +
                        "Turquesa: %d votos (%.2f%%)\n" +
                        "El color elegido es: %s",
                votosCeleste, porcentajeCeleste,
                votosMorado, porcentajeMorado,
                votosTurquesa, porcentajeTurquesa,
                colorElegido
        );

        // Mostrar el reporte
        System.out.println(reporte);


    }
}
