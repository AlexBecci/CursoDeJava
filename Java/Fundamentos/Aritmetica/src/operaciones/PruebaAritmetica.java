package operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) 
    {
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 5;
        aritmetica1.b = 2;
        aritmetica1.sumar();
      
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado con retorno'INT' = " + resultado);
        
        resultado = aritmetica1.sumarConArgumentos(10,20);
        System.out.println("resultado con argumentos = " + resultado);
    }
}
