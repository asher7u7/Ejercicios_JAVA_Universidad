package demo_school_user;

public class Demo_school_user {

    public static void main(String[] args) {
        
        School escuela1 = new School("Escuela de Ingenieria de Sistemas e informatica - EISI");
        escuela1.Welcome();
        
        
        School escuela2 = new School("Escuela de Ingenieria Civil - EIC");
        escuela2.Welcome();
        
        User usuario1 = new User("Fulanito Perencejito", "fulanito@gmail.com", 123456, 41);
        usuario1.info();
        
        
        User usuario2 = new User("Pepeito", "pepito@uis.edu.com", 987, 18);
        usuario2.info();
    }
    
}
