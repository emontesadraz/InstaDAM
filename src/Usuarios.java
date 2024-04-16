import java.util.ArrayList;
import java.util.List;

public class Usuarios {
    private String nombreUsuario;
    private String contrasena;



    public Usuarios() {
    }

    public Usuarios(String nombreUsuario, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }

    public static void usuariosRegistrados(String nombreUsuario, String contrasena) {
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contraseña) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "Usuarios{" +
                "nombreUsuario='" + nombreUsuario + '\'' +
                ", contraseña='" + contrasena + '\'' +
                '}';
    }

}

