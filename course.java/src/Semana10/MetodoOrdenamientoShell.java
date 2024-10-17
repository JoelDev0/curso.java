package Semana10;
public class MetodoOrdenamientoShell {

    public static void main(String[] args) {
        int salto, aux,i;
        boolean cambios;
        int[] A ={5,4,8,2,7,9,5,3};

        System.out.println("Arreglo Original");
        System.out.println("----------------");

        for(int elem:A){ //for-each , imprime los datos del array
            System.out.print(elem+" - ");
        }

        //Metodo Sort
        for (salto=A.length/2; salto !=0;salto /=2){
            cambios=true;
            while(cambios){ //Mientras se intercambie algun elemento
                cambios=false;
                for(i=salto; i< A.length;i++){ //se da una pasada
                    if (A[i-salto]>A[i]) {  //y si estan desordenados
                        aux=A[i];           //se reordena
                        A[i]=A[i-salto];
                        A[i - salto]=aux;
                        cambios=true;       //y se marca como cambio.
                    }
                }
            }
        }
        System.out.println("Arreglo Ordenado");
        System.out.println("----------------");

        for(int elem:A){ //for-each , imprime los datos del array
            System.out.print(elem+" - ");
        }
    }
}
