/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprimerparcial;

import ManejoArchivos.ManejoArchivos;
import static ManejoArchivos.ManejoArchivos.LeerValidando;
import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class Sistema {
    static ArrayList<Usuario> listaAutores = new ArrayList<>();
    static ArrayList<Editor> listaEditores = new ArrayList<>();
    static ArrayList<Revisor> listaRevisores = new ArrayList<>();
    static ArrayList<Articulo> listaArticulos = new ArrayList<>();
    static ArrayList<Revision> listaRevisiones = new ArrayList<>();
    /***
     * 
     * @param args 
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    
    /***
     * 
     * @param correoElectronico 
     */
    public void validarAcceso(String correoElectronico){
        
    }
    
    /***
     * 
     * @param user
     * @param code 
     */
    public static void iniciarSesion(String user, String code){
        
    }
    
    /***
     * 
     */
    public static void mostrarMenu(){
        System.out.println("1. Someter articulo\n2. Iniciar sesion");
    }
    
    
    /***
     * 
     */
    public static void guardarDatosAutor(){
        
    }
    
    /***
     * Metodo utilizado para rellenar el ArrayList listaAutores
     */
    public static void cargarAutores(){
        ArrayList<String[]> datosAutores = LeerValidando("autores.txt", false);
        for (String[] dato:datosAutores){
            listaAutores.add(new Autor(dato[0], dato[1], dato[2], dato[3], dato[4], dato[5]));
        }
    }
    
    /***
     * Metodo utilizado para rellenar el ArrayList listaRevisores
     */
    public static void cargarRevisores(){
        ArrayList<String[]> datosRevisores = LeerValidando("revisores.txt", false);
        for (String[] dato:datosRevisores){
            listaRevisores.add(new Revisor(dato[0], dato[1], dato[2], dato[3], Integer.parseInt(dato[4]), dato[5], dato[6]));
        }
    }
    
    /***
     * Metodo utilizado para rellenar el ArrayList listaEditores
     */
    public static void cargarEditores(){
        ArrayList<String[]> datosEditores = LeerValidando("editores.txt", false);
        for (String[] dato:datosEditores){
            listaEditores.add(new Editor(dato[0], dato[1], dato[2], dato[3], dato[4], dato[5]));
        }
    }
    
    /**
     * Metodo que permite registrar la revision en el fichero
     *
     * @param revision Revision que se desea guardar
     */
    public static void createRevision(Revision revision) {
        // Código para registrar la revisión en un archivo y guardar la información.
        listaRevisiones.add(revision);
        ManejoArchivos.EscribirArchivo("revisiones.txt", revision.toString());
    }
}
