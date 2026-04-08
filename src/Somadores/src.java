/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Somadores;

/**
 *
 * @author aluno
 */
public class src {
    public static void main(String[] args){
        
        somador calculadora = new somador();
        
        System.out.println(calculadora.somar(1, 2));           // somar INT
        System.out.println(calculadora.somar(1.5, 2.5));       // somar Double
        System.out.println(calculadora.somar(1, 2, 3));        // somar 3 int
        System.out.println(calculadora.multiplicar(1, 2));     // multiplicar int
        System.out.println(calculadora.multiplicar(1.5, 2.5)); // multiplicar double
    }
}
