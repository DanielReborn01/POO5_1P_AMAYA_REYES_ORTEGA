/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprimerparcial;

/**
 *
 * @author danie
 */
public abstract class Usuario {
    protected String nombre;
    protected String apellido;
    protected String correoElectronico;
    
    /***
     * Constructor de Usuario
     * @param nombre
     * @param apellido
     * @param correoElectronico 
     */
    public Usuario(String nombre, String apellido, String correoElectronico){
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
    }
    /***
     * 
     * @return 
     */
    public String getNombre(){
        return nombre;
    }
    /***
     * 
     * @return 
     */
    public String getApellido(){
        return apellido;
    }
    /***
     * 
     * @return 
     */
    public String getCorreo(){
        return correoElectronico;
    }
    /***
     * 
     * @param nombre 
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    /***
     * 
     * @param apellido 
     */
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    /***
     * 
     * @param correoElectronico 
     */
    public void setCorreo(String correoElectronico){
        this.correoElectronico = correoElectronico;
    }
    
    public abstract void revisarArticulo();
    
}
