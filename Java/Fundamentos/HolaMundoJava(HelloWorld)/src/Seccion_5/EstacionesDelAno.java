package Seccion_5;

import java.util.Scanner;

public class EstacionesDelAno {
    public static void main(String[] args)
    {
        System.out.println("Ingrese el numero del mes solicitado para saber la estacion del mismo");
        Scanner consolaMes = new Scanner(System.in);
        int mes = Integer.parseInt(consolaMes.nextLine());
        
        var estacion = "Estacion desconocida";
        
        if(mes == 1|| mes == 2 || mes == 12 )
        {
            estacion = "Verano";
            
        }
        else if(mes == 3|| mes == 4 || mes == 5 )
        {
            estacion = "Otonio";
        }
        else if (mes == 6 || mes == 7|| mes == 8)
        {
            estacion = "Invierno";
        }
        else if(mes == 9 || mes == 10|| mes ==11)
        {
            estacion = "Primavera";
        }
        
        System.out.println("Estacion: "+ estacion);       
    }
}
