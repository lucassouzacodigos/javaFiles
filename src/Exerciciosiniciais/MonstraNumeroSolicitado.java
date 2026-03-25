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
        Scanner sc = new Scanner(System.in); 
//        System.out.println("Informe sua idade: ");
//        int idade = sc.nextInt();
//        System.out.println("Sua idade é :" + idade);
        
        ContaBancaria conta = new ContaBancaria(100, "Kawan");
        System.out.println("A conta pertence a: " + conta.getNome());
        System.out.println("O saldo da conta é: " + conta.getSaldo());
        
        conta.depositar(20);
        System.out.println("O saldo da conta é: " + conta.getSaldo());
        
        conta.sacar(50);
        System.out.println("O saldo da conta é: " + conta.getSaldo());
        
        conta.setNome("Lucas Braga");
        System.out.println("A Conta pertence a: " + conta.getNome());

        }
    }

