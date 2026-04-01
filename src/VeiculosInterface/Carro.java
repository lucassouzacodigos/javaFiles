/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VeiculosInterface;

/**
 *
 * @author aluno
 */
public class Carro implements Veiculo{
    public String marca;
    public String modelo;
    public int velocidade;
    
    public Carro(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = 0;
    }
    
    @Override
    public void acelerar(){
        this.velocidade += 10;
    }
    
    @Override
    public void freiar(){
        this.velocidade -= 10;
    }
    
    public void exibirInfo(){
        System.out.println("nome: " + marca + modelo);
        System.out.println("velocidade: " + velocidade);
        System.out.println("-------------");

    }
    
    
}
