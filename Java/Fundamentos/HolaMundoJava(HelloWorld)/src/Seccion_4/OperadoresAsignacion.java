package Seccion_4;

public class OperadoresAsignacion {

    public static void main(String[] args) {
        int a = 3, b = 2;
        var c = a + 5F - b;
        var n1 = 5F;
        System.out.println("c = " + c);

        a += 1;// a = a +1;
        System.out.println("a = " + a);

        a += 3;// a = a+ 3;
        System.out.println("a = " + a);

        a -= 2;// a = a-2;
        System.out.println("a = " + a);

        n1 *= 5;// n1 = n1 * 5;
        System.out.println("n1 = " + n1);

        n1 *= b;
        System.out.println("n1 = " + n1);

        n1 /= 50;
        System.out.println("n1 = " + n1);

        n1 *= 100;
        System.out.println("n1 = " + n1);
        c--;
        n1 /= c;
        System.out.println("n1 = " + n1);
        
        if (n1 % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }

    }
}
