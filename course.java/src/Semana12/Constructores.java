package Semana12;


public class Constructores {
    static class contructorvacio {
        public double width;
        private double height;
        private double depth;

        //el contructor vacio
        public contructorvacio() {
            width = 10;
            height = 10;
            depth = 10;
        }

    }
    public static void main(String[] args) {
        contructorvacio micaja = new contructorvacio();
        System.out.printf("Volumen = %9.2f cm3",micaja.width*micaja.height* micaja.depth);
    }


}


