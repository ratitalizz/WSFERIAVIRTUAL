
package Clases;

public class Login {
    private String nombre;
    private String correoelectronico;
    private String contrasena;

    public Login() {
    }

    public Login(String nombre, String correoelectronico, String contrasena) {
        this.nombre = nombre;
        this.correoelectronico = correoelectronico;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoelectronico() {
        return correoelectronico;
    }

    public void setCorreoelectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "Login{" + "nombre=" + nombre + ", correoelectronico=" + correoelectronico + ", contrasena=" + contrasena + '}';
    }

    

    
    
    
}
