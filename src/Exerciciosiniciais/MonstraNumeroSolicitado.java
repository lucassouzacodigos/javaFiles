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

        }
    }

