package Seccion_10;

public class Caja 
{
    //Atributos
    int ancho;
    int alto;
    int profundo;
    
    public Caja()
    {
        System.out.println("Constructor VACIO");
    }
    
    public Caja(int ancho,int alto, int profundo)
    {
        System.out.println("Constructor con 3 ARGUMENTOS");
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
        calcularVolumen();
    }
    
    public int calcularVolumen()
    {
        int volumen = this.ancho*this.alto*this.profundo;
        return volumen;
    }
}
