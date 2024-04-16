import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Publicaciones{
    Scanner sc = new Scanner(System.in);
    private String descripcion;
    private String nombreUsuario;
    private List<Publicaciones> publicacion = new ArrayList<>();

    public Publicaciones() {
    }

    public Publicaciones(String descripcion, String nombreUsuario) {
        this.descripcion = descripcion;
        this.nombreUsuario = nombreUsuario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    @Override
    public String toString() {
        return "Publicaciones{" +
                "descripcion='" + descripcion + '\'' +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                '}';
    }
    public void publicarMensaje() {
        Usuarios usuarios = new Usuarios();
        System.out.println("En que estás pensando?");
        String mensaje = sc.nextLine();
        Publicaciones publicaciones = new Publicaciones(getNombreUsuario(), mensaje);
        publicacion.add(publicaciones);
        System.out.println("Mensaje publicado por el usuario " + getNombreUsuario() + ": " + mensaje);
    }

    public void verPublicaciones() {
        for (Publicaciones publicaciones : publicacion) {
            System.out.println(publicaciones.getNombreUsuario() + ": " + publicaciones.getDescripcion());
        }
    }

}
