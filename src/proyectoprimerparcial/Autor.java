/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprimerparcial;

import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class Autor extends Usuario{
    
    private ArrayList<Articulo> articulos;
    private String codigo;
    private String institucion;
    private String campoInvestigacion;
    
    /***
     * Constructor de Autor
     * @param nombre
     * @param apellido
     * @param correoElectronico
     * @param codigo
     * @param institucion
     * @param campoInvestigacion 
     */
    public Autor(String nombre, String apellido, String correoElectronico, String codigo,String institucion,String campoInvestigacion) {
        super(nombre, apellido, correoElectronico);
        this.codigo=codigo;
        this.institucion=institucion;
        this.campoInvestigacion=campoInvestigacion;
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
     * Metodo utilizado para registar los datos del autor
     */
    public void registrarDatos(){
        
    }
    
    /***
     * Metodo utilizado para someter el articulo
     */
    public void someterArticulo(){
        
    }
}


