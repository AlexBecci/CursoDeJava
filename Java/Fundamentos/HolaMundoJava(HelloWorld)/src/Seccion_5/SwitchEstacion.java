
package Seccion_5;

import java.util.Scanner;

public class SwitchEstacion 
{
    public static void main(String args[])
    {
        System.out.println("Ingrese el numero del mes deseado");
        Scanner consolaNumero= new Scanner(System.in);
        int mes = Integer.parseInt(consolaNumero.nextLine());
        var estacion = "Estacion no encontrada.\nPor favor vuelva a poner un valor correcto.";
        
        switch(mes)
        {
            case 1: case 2: case 12:
                estacion= "Verano";
                break;
            case 3: case 4: case 5:
                estacion = "Otonio";
                break;
            case 6: case 7: case 8:
                estacion = "Invierno";
                break;
            case 9: case 10: case 11:
                estacion = "Primavera";
                break;            
        }
        System.out.println("Estacion :"+ estacion);
    }
}
