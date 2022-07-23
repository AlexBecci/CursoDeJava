package Seccion_4;

import java.util.Scanner;

public class Rectangulo {

    public static void main(String[] args) 
    {
        int alto;
        int ancho;

        System.out.println("Proporciona el alto");
        Scanner consolaAlto = new Scanner(System.in);
        alto = Integer.parseInt(consolaAlto.nextLine());

        System.out.println("Proporciona el ancho");
        Scanner consolaAncho = new Scanner(System.in);
        ancho = Integer.parseInt(consolaAncho.nextLine());

        System.out.println("Area : " + alto * ancho);
        System.out.println("Perimetro: " + (alto + ancho) * 2);
    }
}
