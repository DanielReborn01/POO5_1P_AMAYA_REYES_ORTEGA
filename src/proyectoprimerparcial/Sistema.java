/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprimerparcial;

import Enums.Rol;
import static Enums.Rol.A;
import ManejoArchivos.ManejoArchivos;
import static ManejoArchivos.ManejoArchivos.LeerValidando;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Sistema {

    static ArrayList<Usuario> listaAutores = new ArrayList<>();
    static ArrayList<Revisor> listaRevisores = new ArrayList<>();
    static ArrayList<Articulo> listaArticulos = new ArrayList<>();
    static ArrayList<Revision> listaRevisiones = new ArrayList<>();
    static ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    static String[] digitos = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
    static Random rd = new Random();

    public static String crearCodigo() {
        String cod = "";
        for (int i = 0; i < 4; i++) {
            int randomNumber = rd.nextInt(36);
            cod += digitos[randomNumber];
        }
        return cod;
    }

    /**
     * *
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cargarArticulos();
        cargarUsuarios();
        mostrarMenu();
    }

    /**
     * *
     *
     * @param correoElectronico
     */
    public void validarAcceso(String correoElectronico) {

    }

    /**
     * *
     *
     * @param user
     * @param code
     */
    public static void iniciarSesion(String user, String code) {

    }

    /**
     * *
     *
     */
    public static void mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Someter articulo\n2. Iniciar sesion\n3. Salir");
        String eleccion = sc.nextLine();
        switch (eleccion) {
            case "1" -> {
                someterArticulo();
                mostrarMenu();
            }
            case "2" -> {
                iniciarSesion();
                mostrarMenu();
            }
            case "3" -> {
                break;
            }
        }

    }

    /**
     * *
     * Metodo utilizado para rellenar el ArrayList listaAutores
     */
    public static void cargarAutores() {
        ArrayList<String[]> datosAutores = LeerValidando("autores.txt", false);
        for (String[] dato : datosAutores) {
            listaAutores.add(new Autor(dato[0], dato[1], dato[2], dato[3], dato[4], dato[5], Rol.valueOf(dato[6])));
        }
    }

    public static void cargarUsuarios() {
        ArrayList<String[]> datosUsuarios = LeerValidando("usuarios.txt", false);
        for (String[] dato : datosUsuarios) {
            switch (dato[6]) {
                case "R" -> {
                    listaRevisores.add(new Revisor(dato[0], dato[1], dato[2], dato[3], Integer.parseInt(dato[4]), dato[5], Rol.valueOf(dato[6])));
                    listaUsuarios.add(new Revisor(dato[0], dato[1], dato[2], dato[3], Integer.parseInt(dato[4]), dato[5], Rol.valueOf(dato[6])));

                }
                case "E" -> {
                    listaUsuarios.add(new Editor(dato[0], dato[1], dato[2], dato[3], dato[4], dato[5], Rol.valueOf(dato[6])));

                }
            }
        }
    }

    /**
     * *
     *
     */
    public static void cargarArticulos() {
        ArrayList<String[]> datosArticulos = LeerValidando("articulos.txt", false);
        for (String[] dato : datosArticulos) {
            listaArticulos.add(new Articulo(dato[0], dato[1], dato[2], dato[3], dato[4], dato[5]));
        }
    }

    /**
     * *
     *
     */
    public static void iniciarSesion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println("BIENVENIDO AL SISTEMA");
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.print("USUARIO: ");
        String user = sc.nextLine();
        System.out.print("CONTRASENIA: ");
        String password = sc.nextLine();
        for (Usuario usuario : listaUsuarios) {
            if (usuario instanceof Revisor) {
                if (((Revisor) usuario).getUser().equals(user) && ((Revisor) usuario).getCode().equals(password)) {
                    System.out.println("Ingreso exitoso");
                    System.out.println("Revisor: Revision del articulo");
                    sc.nextLine();
                    System.out.println("Ingrese el codigo del articulo que desee aprobar");
                    String art = sc.nextLine();
                    for (Articulo arti : listaArticulos) {
                        if (art.endsWith(arti.getCodigo())) {
                            System.out.println(arti);
                        }
                    }
                }else{
                    System.out.println("Datos ingresados incorrectos, pruebe de nuevo");
                    iniciarSesion();
                }
            } else if (usuario instanceof Editor) {
                if (((Editor) usuario).getUser().equals(user) && ((Editor) usuario).getCode().equals(password)) {
                    System.out.println("Ingreso exitoso");
                    sc.nextLine();
                    System.out.println("Editor: Registro de decision final sobre articulo");
                    System.out.println("Ingrese el codigo del articulo que desee aprobar");
                    String art = sc.nextLine(); 
                    for (Articulo arti : listaArticulos) {
                        if (art.endsWith(arti.getCodigo())) {
                            System.out.println(arti);
                        }
                    }
                }else{
                    System.out.println("Datos ingresados incorrectos, pruebe de nuevo");
                    iniciarSesion();
                }
            }
        }
    }

    /**
     * Metodo que permite registrar la revision en el fichero
     *
     * @param revision Revision que se desea guardar
     */
    public static void createRevision(Revision revision) {
        // Código para registrar la revisión en un archivo y guardar la información.
        Revision rev = new Revision(null,null,null,null,null,null,null,null);
        listaRevisiones.add(revision);
        ManejoArchivos.EscribirArchivo("revisiones.txt", revision.toString());
    }

    /**
     * *
     *
     */
    public static void someterArticulo() {
        Scanner sc = new Scanner(System.in);
        String palabras = "";
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
        Autor autor = new Autor(nombre, apellido, correo, instit, campInv, crearCodigo(), A);
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
        sc.nextLine();
        for (int i = 0; i < num; i++) {
            System.out.println("Ingrese una palabra clave");
            String palabraClave = sc.nextLine();
            palabras += palabraClave + " ";
        }
        //Se asignan los revisores al articulo
        Revisor rev1 = asignarRevisor();
        Revisor rev2 = asignarRevisor();
        while (rev2.equals(rev1)) {
            rev2 = asignarRevisor();
        }
        Articulo articulo = new Articulo(titulo, resumen, contenido, palabras, autor.getCodigo(), crearCodigo());
        articulo.setRevisor1(rev1);
        articulo.setRevisor2(rev2);
        listaArticulos.add(articulo);
        ManejoArchivos.EscribirArchivo("articulos.txt", articulo.toString());
        sc.nextLine();
        System.out.println(articulo.getRev1().correoElectronico + "\nSe le escribe con el objetivo de indicarle que se le asigno revisar el articulo con el codigo: " + articulo.getCodigo());
        System.out.println(articulo.getRev2().correoElectronico + "\nSe le escribe con el objetivo de indicarle que se le asigno revisar el articulo con el codigo: " + articulo.getCodigo());
    }

    /**
     * *
     *
     * @return
     */
    public static Revisor asignarRevisor() {
        int randomNumber = rd.nextInt(listaRevisores.size() + 1);
        return listaRevisores.get(randomNumber);
    }
}
