package Sesion_3;

public class TiposPrimitivos {

    public static void main(String args[]) {
        /*
        Tipos primitivos enteros: byte, short, int, long
         */
        System.out.println("BYTE");
        byte numeroByte = (byte) 129;
        System.out.println("Valor de numeroByte: " + numeroByte);
        System.out.println("Valor minimo de Byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo de Byte: " + Byte.MAX_VALUE);
        System.out.println(" ");

        System.out.println("SHORT");
        short numeroShort = (short) 32768;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Valor minimo de Short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo de Short: " + Short.MAX_VALUE);
        System.out.println(" ");

        System.out.println("INT");
        int numeroInt = (int) 2147483648L;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Valor minimo de Int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo de Int: " + Integer.MAX_VALUE);
        System.out.println(" ");
        
        System.out.println("LONG");
        long numeroLong = (long)9223372036854775807D;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Valor minimo de Long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo de Long: " + Long.MAX_VALUE);
        System.out.println(" ");
    }
}
