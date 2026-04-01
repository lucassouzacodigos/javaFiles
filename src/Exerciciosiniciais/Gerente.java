/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exerciciosiniciais;

/**
 *
 * @author aluno
 */
public class Gerente extends Funcionarios{
    
    private double bonus;
    
    public Gerente(String name, double salario, double bonus){
        super(name, salario);
        this.bonus = bonus;
    }
    
    @Override
    public String exibirInfo(){
        return ("Nome: " + this.getName() + " Salario: " +   this.getSalario() + " Bonus: " +  this.bonus).toString();
    }
}
