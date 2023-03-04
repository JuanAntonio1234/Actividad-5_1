import java.util.*;
 
public class Persona {

    //Atributos

    private int id;
    private String nombre;
    private String apellidos;
    private int añoNac;
    private String correo;
    private int edad;

    //Métodos
       
    public Persona(){

    }

    private int calcularEdad(int añoNac){
        Calendar now = Calendar.getInstance();
        int age = now.get(Calendar.YEAR) - añoNac;
        return age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getAñoNac() {
        return añoNac;
    }

    public void setAñoNac(int añoNac) {
        this.añoNac = añoNac;
        this.edad = calcularEdad(añoNac);
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }
}