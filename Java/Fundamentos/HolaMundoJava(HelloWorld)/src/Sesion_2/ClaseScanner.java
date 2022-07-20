
package Sesion_2;

import java.util.Scanner;

public class ClaseScanner 
{
    public static void main(String args[])
    {
        /*System.out.println("Introduzca su USUARIO : ");
        Scanner consola = new Scanner(System.in);
        var usuario = consola.nextLine();
        System.out.println("Introduzca su TITULO : ");
        Scanner consolaTitulo = new Scanner(System.in);
        var titulo = consolaTitulo.nextLine();
        System.out.println("Usuario : " + usuario);
        System.out.println("Titulo : " + titulo);
*/
        //Tarea
        System.out.println("Proporciona el titulo:");
        Scanner scannerTitulo = new Scanner(System.in);
        var titulo = scannerTitulo.nextLine();
        
        System.out.println("Proporciona el autor:");
        Scanner scannerAutor = new Scanner(System.in);
        var autor = scannerAutor.nextLine();
        
        System.out.println(titulo + " Fue escrito por  " + autor);
        
        
        
        
       
    }
}
