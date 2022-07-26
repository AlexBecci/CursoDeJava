
package operaciones;

public class Aritmetica 
{
    //Inicializando atributos
    int a;
    int b;
    //Creando el constructor vacio!
    public Aritmetica()
    {
        System.out.println("Ejecutando el constructor Vacio");
    }
    
    public Aritmetica(int a, int b)
    {
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando el constructor con Argumentos");
    }
    //Metodos
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
