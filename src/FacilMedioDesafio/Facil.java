/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FacilMedioDesafio;

/**
 *
 * @author aluno
 */
public class Facil {
    
    public int somar(int a, int b){
        return a + b;
    }
    
    public String parImpar(int n){
        if(n % 2 == 0){
            return "Par";
        }
        else{
            return "Impar";
        }
    }
    
    public String MaiordeIdade(int n){
        if(n >= 18){
            return "Maior de idade";
        }
        else{
            return "Menor de idade";
        }
    }
    
    public int maiorDe3(int a, int b, int c){
        int maior = 0;
        if (a > maior){
            maior = a;
        }
        else if (b > maior){
            maior = b;
        }
        else if (c > maior) {
            maior = c;
        }
        return maior;
    }
    
    public String isPositivo(int n){
        if(n == 0){
            return "é zero!";
        }
        
        if (n > 0){
            return n + "é positivo";
        }
        else return n + "é negativo";
    }
    
    public String Cumprimento(String nome){
        return "Olá " + nome;
    }
    
    public String dobroTriplo(int n){
        int dobro = n * 2;
        int triplo = n * 3;
        return "O Dobro de " + n + " é " + dobro + " e o triplo é: " + triplo;
    }
    
    public double converterTemperatura(int celsius){
        double faren = (celsius * 1.8) + 32;
        return faren;
    }
    
    public void lista10(){
        for (int i=0; i<10; i++){
            System.out.println(i + 1);
        }
    }
    
    public void somarde1a50(){
        int soma = 0;
        int contador = 1;
        
        while(contador <= 50){
            soma += contador;
        }
        
        System.out.println(soma);
    }
    
    
    
    
}
