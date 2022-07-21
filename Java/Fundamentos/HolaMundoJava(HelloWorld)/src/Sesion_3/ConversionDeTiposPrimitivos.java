package Sesion_3;

import java.util.Scanner;

public class ConversionDeTiposPrimitivos {

    public static void main(String[] args) {

        //Convertir tipo String a un tipo int
        var edad = Integer.parseInt("20");
        //var edad = "20";
        System.out.println("edad = " + (edad + 1));

        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        
//        Pedir valor
       
      var consola = new Scanner(System.in);
//        System.out.println("Ingrese su Edad");
//        edad = Integer.parseInt(consola.nextLine());
//        System.out.println("edad = " + edad);
        
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        var caracter = "Hola".charAt(3);
        System.out.println("caracter = " + caracter);
        
        System.out.println("Proporciona un caracter");
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracterFinal = " + caracter);
        
    }
}
