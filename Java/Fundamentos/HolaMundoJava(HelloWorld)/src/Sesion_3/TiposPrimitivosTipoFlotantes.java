package Sesion_3;

public class TiposPrimitivosTipoFlotantes {

    public static void main(String args[]) {
        /*
        Tipos primitivos de tipo flotante: Float y Double
         */

        float numeroFloat = (float) 3.4028236E38D;//INFINITOOO!

        float numeroFloat2 = 3.4028235E38F; //VALOR MAX
        System.out.println("numeroFloat = " + numeroFloat2);
        System.out.println("Valor minimo de Float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo de Float: " + Float.MAX_VALUE);
        System.out.println(" ");

        double numeroDouble = 1.7976931348623157E308;//Valor MAX
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor minimo de Double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo de Double: " + Double.MAX_VALUE);
    }
}
