/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprimerparcial;

/**
 *
 * @author danie
 */
public class Autor extends Usuario{
    
    private String codigo;
    private String institucion;
    private String campoInvestigacion;
    
    public Autor(String nombre, String apellido, String correoElectronico, String codigo,String institucion,String campoInvestigacion) {
        super(nombre, apellido, correoElectronico);
        this.codigo=codigo;
        this.institucion=institucion;
        this.campoInvestigacion=campoInvestigacion;
    }    

    
    public String getCodigo(){
        return codigo;
    }
    
    public String getInstitucion(){
        return institucion;
    }
    
    public String getCampoInvestigacion(){
        return campoInvestigacion;
    }
    
    public void setCodigo(String codigo){
        this.codigo=codigo;
    }
    
    public void setInstitucion(String institucion){
        this.institucion=institucion;
    }
    
    public void setCampoInvestigacion(String campoInvestigacion){
        this.campoInvestigacion=campoInvestigacion;
    }
}


