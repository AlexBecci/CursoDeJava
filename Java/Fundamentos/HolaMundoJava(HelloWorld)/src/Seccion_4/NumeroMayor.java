package Seccion_4;

import java.util.Scanner;

public class NumeroMayor {

    public static void main(String[] args) {

        System.out.println("Proporciona el primer numero");
        Scanner consolaN1 = new Scanner(System.in);
        var numero1 = Integer.parseInt(consolaN1.nextLine());

        System.out.println("Proporciona el segundo numero");
        Scanner consolaN2 = new Scanner(System.in);
        var numero2 = Integer.parseInt(consolaN2.nextLine());

        if (numero1 > numero2) {
            System.out.println("El numero mayor es: \n" + numero1);
        }
        if (numero2 > numero1) {
            System.out.println("El numero mayor es: \n" + numero2);
        }

        if (numero1 == numero2) {
            System.out.println("Los dos numero son iguales");
        }
    }
}
