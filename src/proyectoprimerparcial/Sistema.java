/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprimerparcial;

import Enums.Rol;
import ManejoArchivos.ManejoArchivos;
import static ManejoArchivos.ManejoArchivos.LeerValidando;
import java.util.ArrayList;
import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Someter articulo\n2. Iniciar sesion");
        String eleccion = sc.nextLine();
        switch(eleccion){
            case "1" -> {
                ArrayList<String>palabras = new ArrayList<>();
                System.out.println("Ingrese su nombre");
                String nombre = sc.nextLine();
                System.out.println("Ingrese su Apellido");
                String apellido = sc.nextLine();
                System.out.println("Ingrese su correo");
                String correo = sc.nextLine();
                System.out.println("Ingrese la institucion para la que trabaja");
                String instit = sc.nextLine();
                System.out.println("Ingrese su campo de investigacion");
                String campInv = sc.nextLine();
                Autor autor = new Autor(nombre,apellido,correo,instit,campInv);
                listaAutores.add(autor);
                ManejoArchivos.EscribirArchivo("autores.txt", autor.toString());
                sc.nextLine();
                System.out.println("Ahora registre los datos de su articulo");
                System.out.println("Ingrese el titulo");
                String titulo = sc.nextLine();
                System.out.println("Ingrese un resumen");
                String resumen = sc.nextLine();
                System.out.println("Ingrese el contenido");
                String contenido = sc.nextLine();
                System.out.println("Cuantas palabras clave tendra?");
                int num = sc.nextInt();
                for(int i = 0; i<num ;i++){
                    System.out.println("Ingrese una palabra clave");
                    String palabraClave = sc.nextLine();
                    palabras.add(palabraClave);
                }
                Articulo articulo = new Articulo(titulo,resumen,contenido,palabras,autor);
                listaArticulos.add(articulo);
                ManejoArchivos.EscribirArchivo("articulos.txt", articulo.toString());
            }
            case "2" -> {
                
            }
        }
        
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
            listaAutores.add(new Autor(dato[0], dato[1], dato[2], dato[3], dato[4]));
        }
    }
    
    /***
     * Metodo utilizado para rellenar el ArrayList listaRevisores
     */
    public static void cargarRevisores(){
        ArrayList<String[]> datosRevisores = LeerValidando("revisores.txt", false);
        for (String[] dato:datosRevisores){
            listaRevisores.add(new Revisor(dato[0], dato[1], dato[2], dato[3], Integer.parseInt(dato[4]), dato[5], dato[6], Rol.valueOf(dato[7])));
        }
    }
    
    /***
     * Metodo utilizado para rellenar el ArrayList listaEditores
     */
    public static void cargarEditores(){
        ArrayList<String[]> datosEditores = LeerValidando("editores.txt", false);
        for (String[] dato:datosEditores){
            listaEditores.add(new Editor(dato[0], dato[1], dato[2], dato[3], dato[4], dato[5], Rol.valueOf(dato[6])));
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
