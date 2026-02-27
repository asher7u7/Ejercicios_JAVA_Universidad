package demo_school_user;

public class User {

    public String name;
    public String email;
    public int id;
    public int age;
    
    public User(String nombre, String correo, int codigo, int edad){
        name = nombre;
        email = correo;
        id = codigo;
        age = edad;
    }
    
    public void info(){
        
        System.out.println("Nombre: " + name);
        System.out.println("Correo: " + email);
        System.out.println("Codigo: " + id);
        System.out.println("Edad: " + age);
        
    }
}
