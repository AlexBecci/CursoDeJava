package Seccion_10;

public class Prueba {

    public static void main(String[] args) {
        Caja caja = new Caja();

        Caja cajaVolumen = new Caja(3, 2, 6);

        int resultado = cajaVolumen.calcularVolumen();
        System.out.println("Volumen de la Caja = " + resultado);

    }
}
