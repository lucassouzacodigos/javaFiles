/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FacilMedioDesafio;

/**
 *
 * @author aluno
 */
public class Main {
    public static void main(String[] args){
        
        int[] numeros = {1,2,3,4,5};
        
        Facil facil = new Facil();
        Intermediario inter = new Intermediario();
        
        System.out.println(facil.somar(1, 1));
        System.out.println(facil.parImpar(3));
        System.out.println(facil.MaiordeIdade(18));
        System.out.println(facil.maiorDe3(1, 2, 3));
        System.out.println(facil.isPositivo(-1));
        System.out.println(facil.Cumprimento("Marcos"));
        System.out.println(facil.dobroTriplo(3));
        System.out.println(facil.converterTemperatura(25));
        facil.lista10();
        facil.somarde1a50();
        
        inter.tabuada(10);
        System.out.println(inter.somaEmedia(1, 2, 3, 4, 5));
        System.out.println(inter.numeroprimo(10));
        System.out.println(inter.maiorEMenor(numeros));
        inter.reverterArray(numeros);
        System.out.println(inter.somarPares100());
        System.out.println(inter.contarVogais("teste"));
        
        
        
    }
}
