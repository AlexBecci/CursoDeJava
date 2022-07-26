package Seccion_6;

public class CicloFor {

    public static void main(String[] args) {
        
        inicio:
        for (var contador = 0; contador < 3; contador++) {
            if (contador % 2 != 0) {
                continue inicio;            
            }
            System.out.println("contador = " + contador);
        }
//        
//        for (var contador = 0; contador < 3; contador++) {
//            if (contador % 2 == 0) {
//                System.out.println("contador = " + contador);
//                  break;
//            }
//        }
    }
}
