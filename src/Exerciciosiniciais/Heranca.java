/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exerciciosiniciais;

/**
 *
 * @author aluno
 */
public class Heranca {
    public String name;
    public double salario;
    
    public Heranca(String name, double salario){
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
}
