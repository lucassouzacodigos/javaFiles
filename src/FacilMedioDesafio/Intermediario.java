/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FacilMedioDesafio;

/**
 *
 * @author aluno, 
 */
public class Intermediario {
    
    
    public void tabuada(int n){
        for (int i=0; i<10; i++){
            System.out.printf("%d x %d = %d", n, i, n * i);
        }
    }
    
    public String somaEmedia(int a, int b, int c, int d, int e){
        double soma = (a + b + c + d + e);
        double media = soma / 5;

        return "A soma é: " + soma + ", A média é: " + media;
    }
    
    public String numeroprimo(int n){
       return "wip";
    }
    
    public String maiorEMenor(int[] numeros){
        
        int menor = 0;
        int maior = 0;
        
        for (int i=0; i<numeros.length; i++){
            if (numeros[i] < menor){
                menor = numeros[i];
            }
            
            if (numeros[i] > maior){
                maior = numeros[i];
            }
        }
        
        return "O menor é: " + menor + ", O maior é: " + maior;
    }
    
    public void reverterArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[array.length - i]);
        }
    }
    
    public int somarPares100(){
        int soma = 0;
        for(int i=0; i<100; i++){
            if (i % 2 == 0){
                soma += i;
            }
        }
        
        return soma;
    }
    
    public int contarVogais(String[] palavra){
        int vogais = 0;
        for (int i=0; i<palavra.length; i++){
            if (
                    palavra[i].contains("a") ||
                    palavra[i].contains("e") ||
                    palavra[i].contains("i") ||
                    palavra[i].contains("o") ||
                    palavra[i].contains("u")
               ){
                vogais++;
            }

        }
        return vogais;
    }
    
    public String mediaPonderada(int valorA, int valorB, int valorC){
        int pesoA = 2;
        int pesoB = 3;
        int pesoC = 5;
        
        double notaValores = (valorA * pesoA) + (valorB + pesoB) + (valorC * pesoC);
        double somaPesos = pesoA + pesoB + pesoC;
        double mediaPonderada = notaValores / somaPesos;
        
        return "A media dos valores é: " + mediaPonderada;
    }

    public String contarParesEimpares(int[] numeros){
        int impar = 0;
        int par = 0;
        
        for (int i=0; i<numeros.length; i++){
            if (numeros[i] % 2 == 0){
                par++;
            }
            else impar++;
        }
        
        return "Quantidade de Pares: " + par + "\n" + "Quantidade de impares: " + impar;
    }
    
    
    
    
}
