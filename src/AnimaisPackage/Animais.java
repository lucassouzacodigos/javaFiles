/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnimaisPackage;

/**
 *
 * @author aluno
 */
public class Animais {
    public static void main(String args[]){
        
        
        Gato gato = new Gato();
        Cachorro dog = new Cachorro();
        Vaca vaca = new Vaca();
        AnimaisBase animal = new AnimaisBase();
        
        
        AnimaisBase arrayAnimais[] = {gato, dog, vaca, animal};
        
        System.out.println("Array de animais");
        for (int i=0; i<arrayAnimais.length; i++){
            System.out.println(arrayAnimais[i].fazerSom());
        }

    }
}
