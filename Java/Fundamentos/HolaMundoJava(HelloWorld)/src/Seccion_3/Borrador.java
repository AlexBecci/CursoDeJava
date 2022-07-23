/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Seccion_3;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Borrador {
    public static void main(String[] args) {
        int n1 = 10;
        System.out.println("Todo valor ingresado se multiplicara por 10 \nIngrese un Valor");
        Scanner console = new Scanner(System.in);
        
        var n2 = Integer.parseInt(console.nextLine());
        
        var cuenta = n1 * n2;
        
        System.out.println("Valor del numero ingresado = " + cuenta);
        
        
    }
}
