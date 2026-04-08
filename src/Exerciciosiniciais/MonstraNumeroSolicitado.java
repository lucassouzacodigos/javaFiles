/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exerciciosiniciais;

import java.util.Scanner;
/**
 *
 * @author aluno
 */
public class MonstraNumeroSolicitado {
    public static void main(String[] args){
        
        
        Funcionarios lucas = new Funcionarios("Lucas", 500);
        System.out.println(lucas.exibirInfo());
        
        
        
        Gerente kevin = new Gerente("kevin", 1000, 100);
        System.out.println(kevin.exibirInfo());
        
        Estagiario Wallace = new Estagiario("Wallace", 2000, 50);
        System.out.println(Wallace.exibirInfo());

//        ContaBancaria lucas =  new ContaBancaria(500, "Lucas");
//        System.out.println("nome do titular: " + lucas.getNome());
//        System.out.println("Saldo: " + lucas.getSaldo());
//        lucas.depositar(500);
//        System.out.println(" ++ Deposito de R$: 500");
//        System.out.println("Saldo apos deposito: " + lucas.getSaldo());
//        lucas.setNome("Lucas Braga");
//        System.out.println("Nome apos troca: " + lucas.getNome());

        
        }
    }

