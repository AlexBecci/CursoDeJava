package Seccion_2;


public class Sesion_2Concatenacion {

    public static void main(String args[]) {
        var usuario = "Alex";
        var titulo = "Licenciado en desarrollo de videojuegos";
        var union = usuario + " " + titulo;
        System.out.println("union = " + union);

        var n1 = 5;
        var n2 = 10;

        System.out.println(n1 + n2); // Suma de numeros
        System.out.println(n1 + n2 + usuario);// Evaluacion de izq a der, suma y despues concatenacion
        System.out.println(usuario + n1 + n2);// Contexto cadena, todo es una cadena
        System.out.println(usuario + (n1 + n2));//Uso de parentesis modifica la prioridad de lectura de la consola
    }
}
