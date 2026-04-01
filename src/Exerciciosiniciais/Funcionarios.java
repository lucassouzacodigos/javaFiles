/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exerciciosiniciais;

/**
 *
 * @author aluno
 */
public class Funcionarios {
    private String name;
    private double salario;
    
    public Funcionarios(String name, double salario){
        this.name = name;
        this.salario = salario;
    }
    
    public void setNome(String name){
        this.name = name;
    }
    
    public void setSalario (double salario){
        this.salario = salario;
    }
    
    public double getSalario(){
        return this.salario;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String exibirInfo(){
        return ("Nome: " + this.name + " Salario:" +  this.salario).toString();
    }
}
