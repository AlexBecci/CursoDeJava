
package Seccion_7;

public class PruebaPersona 
{
    public static void main(String[] args) {
        Persona persona1;
        persona1 = new Persona();
        persona1.nombre = "Alex";
        persona1.apellido = "Becci";
        persona1.pedirInformacion();
        
        Persona persona2 = new Persona();
        
        System.out.println("persona1 = " + persona1);
        System.out.println("persona2 = " + persona2);
        persona2.pedirInformacion();
        persona2.apellido = "Anriquez";
        persona2.nombre="Lourdes";
        persona2.pedirInformacion();
    }
}
