package Semana12;

public class constructorParametrizado {
    static class caja{
        public double width;
        private double height;
        private double depth;
//puede tener varios constructores parametrizados
        public  caja(){
            width=height=depth=10;
        }
        public caja(double width, double height, double depth){
            this.width=width;
            this.height=height;
            this.depth=depth;
        }

    }
    public static void main(String[] args) {
        caja otracaja=new caja();
        System.out.printf("Volumen = %9.2f cm3\n",otracaja.width* otracaja.height* otracaja.depth);
        caja micaja= new caja(12.5,13.7,10.4);
        System.out.printf("Volumen = %9.2f cm3",micaja.width* micaja.height* micaja.depth);
    }
}
