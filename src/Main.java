import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        OperacionesUsuarios ou = new OperacionesUsuarios();
        Publicaciones pu = new Publicaciones();
        do {
            System.out.println("Bienvenido a InstaDAM!");
            System.out.println("1. Registrarse \n2.Iniciar Sesión \n3. Publicar mensaje \n4. Ver publicaciones \n0. Salir");
            System.out.println("Indique lo que quiere hacer");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    ou.registrarUsuario();
                    break;
                case 2:
                    ou.iniciarSesion();
                    break;
                case 3:
                    pu.publicarMensaje();
                    break;
                case 4:
                    pu.verPublicaciones();
                    break;
                case 0:
                    System.out.println("Hasta luego!!");
                    break;
                default:
                    System.out.println("Lo que has introducido no existe");
            }

        }while (opcion != 0);
    }
}