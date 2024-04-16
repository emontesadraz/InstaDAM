import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OperacionesUsuarios extends Usuarios {
    Scanner sc = new Scanner(System.in);
    private List<Usuarios> usuariosRegistrados = new ArrayList<>();
    private Usuarios usuarioActivo = null;


    public void registrarUsuario(String nombreUsuario, String contrasena ) {
        if (usuarioEscogido(nombreUsuario)) {
            System.out.println("Nombre de usuario ya escogido, por favor introduzca otro");
            return;
        }
        Usuarios nuevoUsuario = new Usuarios(nombreUsuario,contrasena);
        usuariosRegistrados.add(nuevoUsuario);
        usuarioActivo = nuevoUsuario;
        }
    public void iniciarSesion(String nombreUsuario, String contrasena) {
        for (Usuarios usuarios : usuariosRegistrados) {
            if (usuarios.getNombreUsuario().equals(nombreUsuario) && usuarios.getContrasena().equals(contrasena)) {
                System.out.println("Inicio de sesión exitoso para el usuario: " + nombreUsuario);
                usuarioActivo = usuarios;
                return;
            }
        }
        System.out.println("Nombre de usuario o contraseña incorrectos");
    }
    public void cerrarSesion(){
        usuarioActivo = null;
    }
    public boolean usuarioActivoAhora(){
        return usuarioActivo != null;
    }

    public Usuarios obtenerUsuarioActual(){
        return usuarioActivo;
    }
    public boolean usuarioEscogido(String nombreUsuario){
        for (Usuarios usuarios : usuariosRegistrados){
            if (usuarios.getNombreUsuario().equals(nombreUsuario)) {
                return true;
            }
        }
        return false;
    }
}



