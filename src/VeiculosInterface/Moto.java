/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VeiculosInterface;

/**
 *
 * @author aluno
 */
public class Moto implements Veiculo{
    
    public String marca;
    public int cilindrada;
    public int velocidade;
    
    
    public Moto(String marca, int cilindrada){
        this.marca = marca;
        this.cilindrada = cilindrada;
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
        System.out.println("nome: " + marca);
        System.out.println("Cilindradas: " + cilindrada);
        System.out.println("velocidade: " + velocidade);
        System.out.println("-------------");
    }
    
    
    
    
    
}
