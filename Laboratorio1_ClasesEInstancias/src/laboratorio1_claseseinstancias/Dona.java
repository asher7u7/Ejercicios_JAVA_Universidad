package laboratorio1_claseseinstancias;

public class Dona {

    
    public double radio_interior;
    public double radio_exterior;
    
    public Dona(double RE, double RI){
        
        radio_interior = RI;
        radio_exterior = RE;
        
    }
    
    public double area(){
    
        return ((Math.PI * Math.pow(radio_exterior,2)) - ( Math.PI * Math.pow(radio_interior,2)));
        
    }
    
    public void imprimir(){
        System.out.println("El Area de la dona con radio exterior: " + radio_exterior + " y radio interior: " + radio_interior + " es: " + area());
    }
}
