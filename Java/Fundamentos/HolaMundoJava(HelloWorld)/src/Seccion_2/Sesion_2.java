package Seccion_2;


public class Sesion_2 {

    public static void main(String args[]) {
        //SESION 2!!!!
        System.out.println("Sesion 2!!!");
        //Definicion de Variable
        int miVariableEntera = 25;
        System.out.println("Mi variable vale = " + miVariableEntera);
        //Modificamos la variable entera
        miVariableEntera = 10;
        System.out.println("Mi variable vale = " + miVariableEntera);
        //Definicion de la variable tipo STRING
        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);
        //Modificacion de la variable
        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);

        //var - interferencia entre los tipos en JAVA
        var miVariableEntera2 = 18;
        System.out.println(miVariableEntera2);

        var miVariableCadena2 = "Nueva Cadena";
        //Concatenacion de Cadenas
        System.out.println("miVariableCadena2 = " + miVariableCadena2);

        //Valores permitidos en el nombre de mis variables
        var miVariable = 1;
        var _miVariable = 2;
        var $miVariable = 3;
        var suma = miVariable + _miVariable + $miVariable;
        System.out.println(suma);
        //var áVariable = 4; se puede pero no se recomienda utilizar
        // var #miVariable = 5; no se puede por el caracter especial.

    }
}
