package areasyperimetros;

public class Rectangulo {    
    public double base;
    public double altura;
    
    public Rectangulo(double b, double a){
        base = b;
        altura = a;
    }
    
    public double perimetro(){
        
        double resultado = (base * 2) + (altura * 2 );
        return resultado;
        
    }
    
    public double area(){
        
        double resultado = (base * altura);
        return resultado;
        
    }   
    
    public void imprimirRectangulo(){
        System.out.println("El área del rectangulo con base: " + base + " y altura: " + altura + " es: " + area());
        System.out.println("Y su perimetro es: " + perimetro());
    }
}
