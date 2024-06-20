/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprimerparcial;

/**
 *
 * @author danie
 */
public class Revisor extends Usuario{
    private String especialidad;
    private int numArticulos;
    private String user;
    private String code;
    
    public Revisor(String nombre, String apellido, String correoElectronico, String especialidad, int numArticulos, String user, String code) {
        super(nombre, apellido, correoElectronico);
        this.especialidad = especialidad;
        this.numArticulos = numArticulos;
        this.user = user;
        this.code = code;
    }
    /***
     * 
     * @return 
     */
    public String especialidad(){
        return especialidad;
    }
    /***
     * 
     * @return 
     */
    public int getNumArticulos(){
        return numArticulos;
    }
    /***
     * 
     * @return 
     */
    public String getUser(){
        return user;
    }
    /***
     * 
     * @return 
     */
    public String getCode(){
        return code;
    }
    /***
     * 
     * @param especialidad 
     */
    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }
    /***
     * 
     * @param numArticulos 
     */
    public void setNumArticulos(int numArticulos){
        this.numArticulos = numArticulos;
    }
    /***
     * 
     * @param user 
     */
    public void setUser(String user){
        this.user = user;
    }
    /***
     * 
     * @param code 
     */
    public void setCode(String code){
        this.code = code;
    }
    
}
