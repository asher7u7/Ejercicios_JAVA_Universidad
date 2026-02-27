package demo_school_user;

public class School {

    public String school_name;
    
    public School(String name){
        school_name = name;
    }
    
    public void Welcome(){
        System.out.println("Bienvenido(a) a la: " + school_name);
    }
}
