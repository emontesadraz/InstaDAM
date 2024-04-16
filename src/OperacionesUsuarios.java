import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OperacionesUsuarios extends Usuarios {
    Scanner sc = new Scanner(System.in);
    private List<Usuarios> usuariosRegistrados = new ArrayList<>();


    public void registrarUsuario() {
        System.out.println("Introduce tu usuario: ");
        setNombreUsuario(sc.next());
        System.out.println("Introduce tu contraseña: ");
        setContrasena(sc.next());
        usuariosRegistrados.add(new Usuarios(getNombreUsuario(), getContrasena()));
        System.out.println("Usuario registrado exitosamente, bienvenido " + getNombreUsuario());
    }

    public boolean iniciarSesion() {
        System.out.println("Introduce tu usuario: ");
        String nombreUsuario = sc.next();
        System.out.println("Introduce tu contraseña: ");
        String contrasena = sc.next();
        for (Usuarios usuarios : usuariosRegistrados) {
            if (usuarios.getNombreUsuario().equals(nombreUsuario) && usuarios.getContrasena().equals(contrasena)) {
                System.out.println("Inicio de sesión exitoso para el usuario: " + nombreUsuario);
                return true;
            }
        }
        System.out.println("Nombre de usuario o contraseña incorrectos");
        return false;

    }


}


