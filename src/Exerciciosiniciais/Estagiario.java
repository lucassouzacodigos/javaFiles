/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exerciciosiniciais;

/**
 *
 * @author aluno
 */
public class Estagiario extends Funcionarios{
    
    private int horasTrabalhadas;
    
    public Estagiario(String name, double salario, int horasTrabalhadas){
        super(name, salario);
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    public String getHorasTrabalhadas(){
        return ("Horas Trabalhadas: " + horasTrabalhadas);
    }
    
    @Override
    public String exibirInfo(){
        return ("Nome: " + this.getName() + " Salario: " + this.getSalario() + " Horas: " + horasTrabalhadas);
    }
}
