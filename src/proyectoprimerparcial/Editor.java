/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprimerparcial;

import Enums.Rol;
import static Enums.Rol.E;

/**
 *
 * @author danie
 */
public class Editor extends Usuario{

    private String journalName;
    private String user;
    private String code;

    /***
     * Constructor de Editor
     * @param nombre
     * @param apellido
     * @param correoElectronico 
     * @param journalName 
     * @param user 
     * @param code 
     * @param rol 
     */
    public Editor(String nombre, String apellido, String correoElectronico, String journalName, String user, String code, Rol rol) {
        super(nombre, apellido, correoElectronico, rol);
        this.journalName = journalName;
        this.user = user;
        this.code = code;
    }

    /***
     * 
     * @return 
     */
    public String getJournalName(){
        return journalName;
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
     * @param journalName 
     */
    public void setJournalName(String journalName){
        this.journalName= journalName;
    }

    /***
     * 
     * @param user 
     */
    public void setUser(String user){
        this.user= user;
    }

    /***
     * 
     * @param code 
     */
    public void setCode(String code){
        this.code=code;
    }

    /***
     * 
     */
    @Override
    public void revisarArticulo() {
    }
    
}
