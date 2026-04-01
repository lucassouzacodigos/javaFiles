/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Geometria;

/**
 *
 * @author aluno
 */
public abstract class Forma {
    
    protected String nome;
    
    public Forma(String nome){
        this.nome = nome;
    }
    
    abstract double calcularArea();
    
    abstract double calcularPerimetro();
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome (String nome){
        this.nome = nome;
    }
    
    abstract String exibirInfo();
}
