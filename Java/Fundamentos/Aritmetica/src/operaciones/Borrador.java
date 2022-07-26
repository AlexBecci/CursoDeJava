
package operaciones;

import java.util.Scanner;

public class Borrador 
{
    public static void main(String[] args) {
        Aritmetica aritmetica = new Aritmetica();
        
        
        System.out.println("Ingrese el primer numero");
        Scanner valor1 = new Scanner(System.in);
        int n1 = Integer.parseInt(valor1.nextLine());
        
        System.out.println("Ingrese el segundo numero");
        Scanner valor2 = new Scanner(System.in);
        int n2 = Integer.parseInt(valor1.nextLine());
        
        aritmetica.a = n1;
        aritmetica.b = n2;
        aritmetica.sumar();
        
        int resultadoFinal = aritmetica.sumarConRetorno();
        System.out.println("resutado con retorno = " + resultadoFinal);
        
        
        resultadoFinal = aritmetica.sumarConArgumentos(n1, n2);
        System.out.println("Resultado con ARGUMENTOS= " + resultadoFinal);
    }
}
