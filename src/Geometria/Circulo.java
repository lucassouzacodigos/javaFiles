/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Geometria;

/**
 *
 * @author aluno
 */
public class Circulo extends Forma{
    
    private double raio;
    
    public Circulo(String nome, double raio){
        super(nome);
        this.raio = raio;
    }
    
    @Override
    public double calcularPerimetro(){
        return 2 * 3.14 * raio;
    }
    
    @Override
    public double calcularArea(){
        return 3.14 * (raio * raio);
    }
    
    @Override
    public String exibirInfo(){
        return ("O " + getNome() + " tem: " + raio + " de raio, " + 
                calcularArea() + " De area e " + calcularPerimetro() + 
                " de perimetro");
    }
    
}
