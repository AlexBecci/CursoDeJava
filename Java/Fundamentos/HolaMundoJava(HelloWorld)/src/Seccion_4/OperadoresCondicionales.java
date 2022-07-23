package Seccion_4;

public class OperadoresCondicionales {

    public static void main(String[] args) {
        var a = 5;
        var valorMinimo = 0;
        var valorMaximo = 10;
        //OPERADOR AND &&
        if (a >= valorMinimo && a <= valorMaximo) {
            System.out.println("Dentro de rango");
        } else {
            System.out.println("Fuera de rango");
        }

        //OPERADOR OR ||
        var vacaciones = false;
        var descanso = true;

        if (vacaciones == true || descanso == true) {
            System.out.println("Puede asistir");
        } else {
            System.out.println("No puede asistir");
        }
    }
}
