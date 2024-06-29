/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprimerparcial;

import Enums.Estado;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author danie
 */
public class Articulo {
    private String titulo;
    private String resumen;
    private String contenido;
    private ArrayList<String> palabrasClave = new ArrayList<>();
    private String codigo;
    private Autor autor;
    private Revisor revisor1;
    private Revisor revisor2;
    
    
    String[] digitos = {"a", "b", "c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","1","2","3","4","5","6","7","8","9","0"};
    static Random rd = new Random();
    
    public Articulo(String titulo, String resumen, String contenido, ArrayList<String> palabrasClave, Autor autor, Revisor revisor1, Revisor revisor2){
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
        this.autor = autor;
        this.revisor1 = revisor1;
        this.revisor2 = revisor2;
    }
    
    /***
     * 
     * @return 
     */
    public String getTitulo() {
        return titulo;
    }

    /***
     * 
     * @param titulo 
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /***
     * 
     * @return 
     */
    public String getResumen() {
        return resumen;
    }

    /***
     * 
     * @param resumen 
     */
    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    /***
     * 
     * @return 
     */
    public String getContenido() {
        return contenido;
    }

    /***
     * 
     * @param contenido 
     */
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    /***
     * 
     * @return 
     */
    public ArrayList<String> getPalabrasClave() {
        return palabrasClave;
    }

    /***
     * 
     * @param palabrasClave 
     */
    public void setPalabrasClave(ArrayList<String> palabrasClave) {
        this.palabrasClave = palabrasClave;
    }

    /***
     * 
     * @return 
     */
    public String getCodigo() {
        return codigo;
    }

    /***
     * 
     * @param codigo 
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    /***
     * 
     * @return 
     */
    public String getAutorNombre(){
        return autor.nombre;
    }
    
    /***
     * 
     * @return 
     */
    @Override
    public String toString() {
        return titulo + "," + resumen + "," + contenido + ","
                + palabrasClave + "," + codigo+","+autor.nombre;
    }
    
    
}
