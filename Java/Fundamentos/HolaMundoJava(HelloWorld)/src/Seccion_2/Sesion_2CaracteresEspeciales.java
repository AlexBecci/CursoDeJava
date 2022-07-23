package Seccion_2;


public class Sesion_2CaracteresEspeciales 
{
    public static void main(String args[])
    {
        var nombre = "Alex";
        
        System.out.println("Nueva Linea : \n" + nombre);//Genera que lo que le sigue al caracter se pongan en una linea debajo 
        System.out.println("Tabulador : \t" + nombre);//Funciona como TABULADOR
        System.out.println("Retroceso : \b" + nombre);//Genera un retroceso
        System.out.println("Comilla simple : '"+ nombre + "'");//Genera una comilla simple
        System.out.println("Comilla doble : \""+ nombre +"\"");//Genera una comilla doble
    }
}
