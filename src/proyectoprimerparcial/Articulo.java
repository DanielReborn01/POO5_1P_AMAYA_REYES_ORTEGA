/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprimerparcial;

import Enums.Estado;
import java.util.Random;

/**
 *
 * @author danie
 */
public class Articulo {
    private String titulo;
    private String resumen;
    private String contenido;
    private String[] palabrasClave;
    private String codigo;
    
    String[] digitos = {"a", "b", "c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","1","2","3","4","5","6","7","8","9","0"};
    static Random rd = new Random();
    
    public Articulo(String titulo, String resumen, String contenido, String[] palabrasClave, Estado estado){
        this.titulo = titulo;
        this.resumen = resumen;
        this.contenido = contenido;
        this.palabrasClave = palabrasClave;
        String cod="";
        for(int i =0;i<4;i++){
            int randomNumber = rd.nextInt(36);
            cod += digitos[randomNumber];
        }
        this.codigo = cod;
    }
    
    @Override
    public String toString() {
        return titulo + "," + resumen + "," + contenido + ","
                + palabrasClave + "," + codigo;
    }
    
    
}
