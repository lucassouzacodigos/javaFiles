/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VeiculosInterface;

/**
 *
 * @author aluno
 */
public class Bicicleta implements Veiculo{
    
    public String marca;
    public String tipo;
    public int velocidade;
    
    public Bicicleta(String marca, String tipo){
        this.marca = marca;
        this.tipo = tipo;
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
        System.out.println("Tipo: " + tipo);
        System.out.println("velocidade: " + velocidade);
        System.out.println("-------------");

    }
    
}
