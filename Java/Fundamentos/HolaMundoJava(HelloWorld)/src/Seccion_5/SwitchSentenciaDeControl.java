package Seccion_5;

import java.util.Scanner;

public class SwitchSentenciaDeControl {

    public static void main(String[] args) 
    {
        System.out.println("Ingresa un numero del 1 al 4");
        Scanner consolaNumero = new Scanner(System.in);
        var numero = Integer.parseInt(consolaNumero.nextLine());
        
        var numeroTexto = "Numero no encontrado";

        switch (numero) {
            case 1:
                numeroTexto = "Numero uno";
                break;
            case 2:
                numeroTexto = "Numero dos";
                break;
            case 3:
                numeroTexto = "Numero tres";
                break;
            case 4:
                numeroTexto = "Numero cuatro";
                break;
            default:
                numeroTexto = "Caso no encontrado";
                break;
        }
        System.out.println("numeroTexto = " + numeroTexto);
    }
}
