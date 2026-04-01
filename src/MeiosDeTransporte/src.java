/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MeiosDeTransporte;

/**
 *
 * @author aluno
 */
public class src {
    public static void main(String[] args){

        Carro carro = new Carro();
        Bicicleta bike =  new Bicicleta();
        Aviao aviao = new Aviao();
        Transporte trans = new Transporte();
        
        
        System.out.println(carro.mover());
        System.out.println(bike.mover());
        System.out.println(aviao.mover());
        System.out.println(trans.mover());

        
    }
}
