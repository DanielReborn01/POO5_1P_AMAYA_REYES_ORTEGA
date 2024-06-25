/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoprimerparcial;

import java.util.Random;

/**
 *
 * @author danie
 */
public class ProyectoPrimerParcial {

    static String[] digitos = {"a", "b", "c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","1","2","3","4","5","6","7","8","9","0"};
    static Random rd = new Random();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(digitos.length);
        String cod="";
        for(int i =0;i<4;i++){
            int randomNumber = rd.nextInt(36);
            cod += digitos[randomNumber];
        }
        System.out.println(cod);
    }
    
}
