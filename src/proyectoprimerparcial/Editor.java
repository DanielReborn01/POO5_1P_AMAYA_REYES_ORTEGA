/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprimerparcial;

/**
 *
 * @author danie
 */
public class Editor extends Usuario{

    private String journalName;
    private String user;
    private String code;

    
    public Editor(String nombre, String apellido, String correoElectronico) {
        super(nombre, apellido, correoElectronico);
    }

    public String getJournalName(){
        return journalName;
    }

    public String getUser(){
        return user;
    }

    public String getCode(){
        return code;
    }

    public void setJournalName(String journalName){
        this.journalName= journalName;
    }

    public void setUser(String user){
        this.user= user;
    }

    public void setCode(String code){
        this.code=code;
    }
    
}
