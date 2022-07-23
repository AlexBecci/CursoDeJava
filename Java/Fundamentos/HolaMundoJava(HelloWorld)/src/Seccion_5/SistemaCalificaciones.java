
package Seccion_5;

import java.util.Scanner;

public class SistemaCalificaciones 
{
    public static void main(String args[])
    {
        System.out.println("Proporciona un valor entre 0 y 10");
        Scanner consolaValor = new Scanner(System.in);
        var calificacion = Float.parseFloat(consolaValor.nextLine());
        var nota = "Valor desconocido";
        
        if(calificacion>=9&& calificacion<=10)
        {
            nota = "A";
        }
        else if(calificacion >=8&& calificacion<9)
        {
            nota = "B";
        }
        else if(calificacion >=7&& calificacion<8)
        {
            nota = "C";
        }
        else if(calificacion >=6&& calificacion<7)
        {
            nota = "D";
        }
        else if(calificacion >=0&& calificacion<6)
        {
            nota = "F";
        }
           
        System.out.println("Nota: "+ nota);
    }
}
