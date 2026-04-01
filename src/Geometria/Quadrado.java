/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Geometria;

/**
 *
 * @author aluno
 */
public class Quadrado extends Forma{
    
    private double lado;
    
    public Quadrado(String nome, double tamanho){
        this.lado = tamanho;
        super(nome);
    }
    
    @Override
    public double calcularArea(){
        return lado * lado;
    }
    
    @Override
    public double calcularPerimetro(){
        return lado * 4;
    }
    
    @Override
    public String exibirInfo(){
        return ("O " + getNome() + " tem: " + lado + " de lado, " + 
                calcularArea() + " De area e " + calcularPerimetro() + 
                " de perimetro");
    }
}
