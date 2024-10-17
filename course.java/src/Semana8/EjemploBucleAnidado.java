package Semana8;
/*El ejemplo muestra un bucle que itera 3 veces (semanas) y dentro de éste,
otro bucle que itera 7 veces (días)
Se hace uso de String.format() para formatear la salida antes de enviarla a la pantalla.*/
public class EjemploBucleAnidado {
    public static void main(String[] args) {
    int semanas = 3, dias=7;
    String expresion1, expresion2;

    for (int i=1;i<=semanas;i++){
        expresion1=String.format("Semana %d\n",i);
        System.out.println(expresion1);

        for (int j=1;j<=dias;j++){
            expresion2=String.format("\tDias %d\n",j);
            System.out.println(expresion2);
        }
    }
    }
}
