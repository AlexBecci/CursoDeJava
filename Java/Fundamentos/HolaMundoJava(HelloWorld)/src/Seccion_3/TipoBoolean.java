
package Seccion_3;

public class TipoBoolean 
{
    public static void main(String[] args) 
    {
        boolean varBoolean = true;
        System.out.println("varBoolean = " + varBoolean);
        
        if(varBoolean == true)
        {
            System.out.println("La bandera es Verdadera");
        }
        else
        {
            System.out.println("La bandera es Falsa");
        }
        
        var edad = 19;
        
       // var esAdulto = edad >= 18;
        
        if(edad >=18)
        {
            System.out.println("Eres mayor de edad");
        }
        else
        {
            System.out.println("Eres menor de edad");
        }
    }
}
