
package operaciones;

public class Aritmetica 
{
    int a;
    int b;
    
    public void sumar(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }   
    
    public int sumarConRetorno()
    {
        //int resultado = a+b;
        //return resultado;
        return a+b;
    }
    
    public int sumarConArgumentos(int a,int b)
    {
       this.a = a;
        this.b = b;
        //return a+b;
        return this.sumarConRetorno();
    }   
}
