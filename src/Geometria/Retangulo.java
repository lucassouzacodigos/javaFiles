/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Geometria;

/**
 *
 * @author aluno
 */
public class Retangulo extends Forma{
    
    private double altura;
    private double largura;
    
    public Retangulo(double altura, double largura, String name){
        super(name);
        this.altura = altura;
        this.largura = largura;
    }
    
    @Override
    public double calcularArea(){
        return altura * largura;
    }
    
    @Override
    public double calcularPerimetro(){
        return (altura + largura) * 2;
    }
    
    
    @Override
    public String exibirInfo(){
        return ("O " + getNome() + " tem: " + altura + " de altura, "
                + largura + " de Largura " + 
                calcularArea() + " De area e " + calcularPerimetro() + 
                " de perimetro");
    }
}
