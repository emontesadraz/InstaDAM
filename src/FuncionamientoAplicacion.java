import javax.sound.sampled.Line;
import javax.swing.*;
import java.util.Scanner;

public class FuncionamientoAplicacion {
    Scanner sc = new Scanner(System.in);
    int opcion;
    OperacionesUsuarios ou = new OperacionesUsuarios();
    Publicaciones pu = new Publicaciones();
    public void empezar(){

        do {
            System.out.println("Bienvenido a InstaDAM!");
            System.out.println("1. Registrarse \n2. Iniciar Sesión  \n3. Ver publicaciones \n0. Salir");
            System.out.println("Indique lo que quieres hacer");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                   registrarUsuario();
                    break;
                case 2:
                    iniciarSesion();
                    break;
                case 3:
                    mostrarPublicaciones();
                    break;
                case 0:
                    System.out.println("Hasta luego!!");
                    break;
                default:
                    System.out.println("Lo que has introducido no existe");
            }if (ou.usuarioActivoAhora()){
                do {
                    opcionesUsuario();
                }while (ou.usuarioActivoAhora());
            }
        }while (opcion != 0);
    }
    public void iniciarSesion(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre de tu usuario: ");
        String nombreUsuario = sc.next();
        System.out.println("Introduce tu contraseña: ");
        String contrasena = sc.next();
        ou.iniciarSesion(nombreUsuario,contrasena);
    }
    public void registrarUsuario(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre de tu usuario: ");
        String nombreUsuario = sc.next();
        System.out.println("Introduce tu contraseña: ");
        String contrasena = sc.next();
        ou.registrarUsuario(nombreUsuario,contrasena);
    }
    public void mostrarPublicaciones(){
        if (!pu.sinPublicaciones()){
            pu.verPublicaciones();
        }else{
            System.out.println("Aún no hay publicaciones!");
        }
    }
    public void publicarMensaje(){
        String descripcion = JOptionPane.showInputDialog("En que estás pensando?");
        pu.publicarMensaje(descripcion,ou.obtenerUsuarioActual());
    }
    public void opcionesUsuario(){
        System.out.println("Bienvenido "+ou.obtenerUsuarioActual().getNombreUsuario());
        System.out.println("1. Ver Publicaciones \n2. Publicar mensaje \n3. Cerrar sesión");
        System.out.println("Indica lo que quieres hacer: ");
        opcion = sc.nextInt();
        switch (opcion){
            case 1:
                mostrarPublicaciones();
                break;
            case 2:
                publicarMensaje();
                break;
            case 3:
                ou.cerrarSesion();
                break;
            default:
                System.out.println("No hay ninguna opcion para el numero escogido");
                break;
        }
    }
}

