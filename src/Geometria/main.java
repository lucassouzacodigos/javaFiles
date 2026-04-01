/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Geometria;

/**
 *
 * @author aluno
 */
public class main {
    public static void main(String args[]){
        
        
        Retangulo retangulo = new Retangulo(15, 5, "retangulinho");
        Circulo bola = new Circulo("bola", 5);
        Quadrado square = new Quadrado ("bloco", 15);
        
        System.out.println(bola.exibirInfo());
        System.out.println(retangulo.exibirInfo());
        System.out.println(square.exibirInfo());
        
        
        
        
    }
}
