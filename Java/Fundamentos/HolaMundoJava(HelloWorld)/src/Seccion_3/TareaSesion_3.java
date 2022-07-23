package Seccion_3;

import java.util.Scanner;

public class TareaSesion_3 {

    public static void main(String[] args) 
    {
        char precioSimbolo = '\u0024';
        char idSimbolo = '\u0023';
        boolean envioGratuito = true;

        System.out.println("Proporciona el nombre");
        Scanner consolaNombre = new Scanner(System.in);
        var nombre = consolaNombre.nextLine();

        System.out.println("Proporciona el id");
        Scanner consolaId = new Scanner(System.in);
        var id = Integer.parseInt(consolaId.nextLine());

        System.out.println("Proporciona el precio");
        Scanner consolaPrecio = new Scanner(System.in);
        var precio = Integer.parseInt(consolaPrecio.nextLine());

        //Muestra por pantalla
        System.out.println(nombre + " " + idSimbolo + id);
        System.out.println("precio = " + precioSimbolo + precio);
        if (envioGratuito) {
            System.out.println("Envio gratuito = " + envioGratuito);
        } else {
            System.out.println("Envio gratuito = " + envioGratuito);
        }
    }
}
