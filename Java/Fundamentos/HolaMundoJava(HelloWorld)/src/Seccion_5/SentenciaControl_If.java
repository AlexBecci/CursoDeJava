
package Seccion_5;

import java.util.Scanner;

public class SentenciaControl_If 
{
    public static void main(String[] args) 
    {
        boolean condicion = true;
        int numero;
       
        if(condicion)
        {
            System.out.println("Condicion verdadera");
        }
        else
        {
            System.out.println("Condicion falsa");
        }
        System.out.println("Ingrese un un numero del 1 al 4");
        Scanner consolaNumero = new Scanner(System.in);
        numero = Integer.parseInt(consolaNumero.nextLine());
        
        var numeroTexto = "Numero Desconocido";
        
        if(numero == 1)
        {
            numeroTexto = "Numero uno";
        }
        else if(numero == 2)
        {
            numeroTexto = "Numero dos";
        }
        else if(numero == 3)
        {
            numeroTexto = "Numero tres";
        }        
        else if(numero == 4)
        {
            numeroTexto = "Numero cuatro";
        }
        else
        {
            System.out.println("Numero no encontrado");
        }
        
        System.out.println(numeroTexto);        
    }
}
