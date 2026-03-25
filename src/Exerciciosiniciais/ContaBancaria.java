/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exerciciosiniciais;

/**
 *
 * @author aluno
 */
public class ContaBancaria {
    
    
    private double saldo;
    private String titular;
    
    public ContaBancaria(double saldo, String titular){
        this.saldo = saldo;
        this.titular = titular;
    }
    
    public void depositar(double valor){
        saldo += valor;
    }
    
    public void sacar(double valor){
        saldo -= valor;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public String getNome(){
        return this.titular;
    }
    
    public void setNome(String nome){
        this.titular = nome;
    }
}
