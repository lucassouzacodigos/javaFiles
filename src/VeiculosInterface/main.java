/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VeiculosInterface;

/**
 *
 * @author aluno
 */
public class main {
    public static void main(String args[]){
        
        Bicicleta bike = new Bicicleta("Caloi", "BMX");
        Carro car = new Carro("Renault", "Logan");
        Moto motinha = new Moto("Yamaha", 160);
        
        
        Veiculo array[] = {bike, car, motinha};
        
        for (int i=0; i<array.length; i++){
            array[i].exibirInfo();
        }
        
        for (int i=0; i<array.length; i++){
            array[i].acelerar();
        }
        
        for (int i=0; i<array.length; i++){
            array[i].exibirInfo();
        }
        
        for (int i=0; i<array.length; i++){
            array[i].freiar();
        }
        
        for (int i=0; i<array.length; i++){
            array[i].exibirInfo();
        }
    }
}
