/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprimerparcial;

import Enums.Rol;
import static Enums.Rol.A;
import java.util.ArrayList;
import java.util.Random;

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
    public Autor(String nombre, String apellido, String correoElectronico,String institucion,String campoInvestigacion, String codigo, Rol rol) {
        super(nombre, apellido, correoElectronico, rol);
        this.institucion=institucion;
        this.campoInvestigacion=campoInvestigacion;
        this.codigo = codigo;
        this.rol = rol;
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
     * @return 
     */
    @Override
    public String toString() {
        return nombre + "," + apellido + "," + correoElectronico + ","
                + institucion + "," + campoInvestigacion+","+codigo+","+rol;
    }

    @Override
    public void revisarArticulo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


