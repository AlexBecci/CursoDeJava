package Seccion_4;

public class OperadoresDeIgualdadYRelaciones 
{
    public static void main(String[] args) 
    {
        var a = 3;
        var b = 2;

        var c = a == b;
        System.out.println("c = " + c);

        var d = a != b;
        System.out.println("d = " + d);

        var cadena1 = "Hola";
        var cadena2 = "Hola";

        var e = cadena1 == cadena2;//COMPARA REFERENCIA DE OBJETOS
        System.out.println("e = " + e);

        var f = cadena1.equals(cadena2);//COMPARA CONTENIDO DE CADENAS
        System.out.println("f = " + f);

        var g = a >= b;
        System.out.println("g = " + g);

        if (a % 2 == 0) {
            System.out.println("Es Par");
        } else {
            System.out.println("Es Impar");
        }

        var edad = 10;
        var adulto = 18;

        if (edad >= adulto) 
        {
            System.out.println("Eres mayor de edad");
        } 
        else 
        {
            System.out.println("No eres mayor de edad");
        }
    }
}
