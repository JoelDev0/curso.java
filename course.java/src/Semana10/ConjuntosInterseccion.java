package Semana10;
/*Escribir un programa en Java que realice una intersección de conjuntos. Dado dos arreglos de
10 números enteros (inicializados), mostrar qué números del primer arreglo están
también en el segundo arreglo.*/

public class ConjuntosInterseccion {
    public static void main(String[] args) {
        // Arreglos de ejemplo con 10 números enteros cada uno
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] B = {4, 5, 6, 11, 12, 13, 14, 15, 16, 17};

       //Mostrar la interseccion de los dos arreglos, encontrar los iguales
       System.out.println("Intersección de A y B");
       for(int i=0;i< A.length;i++){
           for (int j=0;j< B.length;j++){
               if (A[i]==B[j]) {
                   System.out.print(A[i]+" ");
               }
           }
       }
    }
}
