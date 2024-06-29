/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprimerparcial;

import Enums.Rol;
import static Enums.Rol.A;
import java.util.ArrayList;
import java.util.Random;
import static proyectoprimerparcial.Articulo.rd;

/**
 *
 * @author danie
 */
public class Autor extends Usuario{
    
    private ArrayList<Articulo> articulos;
    private String codigo;
    private String institucion;
    private String campoInvestigacion;
    private Rol rol;
    
    /***
     * Constructor de Autor
     * @param nombre
     * @param apellido
     * @param correoElectronico
     * @param codigo
     * @param institucion
     * @param campoInvestigacion 
     */
    String[] digitos = {"a", "b", "c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","1","2","3","4","5","6","7","8","9","0"};
    static Random rd = new Random();
    public Autor(String nombre, String apellido, String correoElectronico,String institucion,String campoInvestigacion) {
        super(nombre, apellido, correoElectronico);
        this.institucion=institucion;
        this.campoInvestigacion=campoInvestigacion;
        String cod="";
        for(int i =0;i<4;i++){
            int randomNumber = rd.nextInt(36);
            cod += digitos[randomNumber];
        }
        this.codigo = cod;
        this.rol = A;
    }    

    /***
     * 
     * @return 
     */
    public String getCodigo(){
        return codigo;
    }
    
    /***
     * 
     * @return 
     */
    public String getInstitucion(){
        return institucion;
    }
    
    /***
     * 
     * @return 
     */
    public String getCampoInvestigacion(){
        return campoInvestigacion;
    }

    /***
     * 
     * @param codigo 
     */
    public void setCodigo(String codigo){
        this.codigo=codigo;
    }
    
    /***
     * 
     * @param institucion 
     */
    public void setInstitucion(String institucion){
        this.institucion=institucion;
    }
    
    /***
     * 
     * @param campoInvestigacion 
     */
    public void setCampoInvestigacion(String campoInvestigacion){
        this.campoInvestigacion=campoInvestigacion;
    }
    
    
    /***
     * 
     */
    @Override
    public void revisarArticulo() {
    }
    
    
    /***
     * Metodo utilizado para someter el articulo
     */
    public void someterArticulo(){
        
    }
}


