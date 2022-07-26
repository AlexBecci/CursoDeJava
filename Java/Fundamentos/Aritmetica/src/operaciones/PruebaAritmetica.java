package operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) 
    {
        //VARIABLES LOCALES
       // var a =5;
       // var b = 50;
        miMetodo();
        Aritmetica aritmetica1 = new Aritmetica();
        System.out.println("aritmetica1 a: "+ aritmetica1.a);
        System.out.println("aritmetica1 b: "+ aritmetica1.b);
        
        Aritmetica aritmetica2 = new Aritmetica(10, 20);
        System.out.println("aritmetica2 a: "+ aritmetica2.a);
        System.out.println("aritmetica2 b: "+ aritmetica2.b);       
    }
    public static void miMetodo()
    {
        //La variable "a" esta fuera de alcanze 
        //a = 10;
        System.out.println("OTRO METODO");
    }
}
/* 
        //SECCION 8
        aritmetica1.a = 5;
        aritmetica1.b = 2;
        aritmetica1.sumar();
      
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado con retorno'INT' = " + resultado);
        
        resultado = aritmetica1.sumarConArgumentos(10,20);
        System.out.println("resultado con argumentos = " + resultado);
        */