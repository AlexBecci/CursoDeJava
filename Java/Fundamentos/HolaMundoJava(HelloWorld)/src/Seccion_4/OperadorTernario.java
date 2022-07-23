/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Seccion_4;

/**
 *
 * @author usuario
 */
public class OperadorTernario {
    
    public static void main(String[] args) {
        var resultado = (1>2) ?"Verdadero" : "Falso" ;
        System.out.println("resultado = " + resultado);
        
        var numero = 8;
        resultado = (numero %2 == 0) ?"Es par" :"Es impar" ;
        System.out.println("numero = " + resultado);
    }
}
