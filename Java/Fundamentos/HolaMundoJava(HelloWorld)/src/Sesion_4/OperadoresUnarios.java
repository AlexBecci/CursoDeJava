/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sesion_4;

/**
 *
 * @author usuario
 */
public class OperadoresUnarios 
{
    public static void main(String[] args) 
    {
        var a = 3;
        var b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        var c = true;
        var d = !c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        //INCREMENTO
        //1.PreIncremento (Simbolo antes de la variable)
        var e = 3;
        var f = ++e;//Primero se incrementa la variable y despues se utiliza
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        
        //2.PostIncremento(Simbolo despues de la variable)
        var g = 5;
        var h = g++;//Primero se usa la variable y despues se incrementa
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        
        //DECREMENTO!!!!
        //1.PreDecremento
        var i = 2;
        var j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        //2.PostDecremento
        var k =1;
        var l = k--;
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        
        
        
    }
}
