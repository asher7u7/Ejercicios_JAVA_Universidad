package demoejemplofigurasgeometricas;
import java.util.Scanner;
public class DemoEjemploFigurasGeometricas {

    public static void main(String[] args) {
        System.out.println("Digite el nombre de la figura (circulo, rectangulo, cuadrado, triangulo");
        Scanner entrada = new Scanner(System.in);
        String figura_geometrica = entrada.nextLine();
        
        /*if figura_geometrica.equals("circulo"){
            
        }
        else if figura_geometrica.equals("rectangulo"){
            
        }
        else if figura_geometrica.equals("Cuadrado"){
            
        }*/
        double radio;
        double perimetro = 0, area = 0;
        switch(figura_geometrica){
            case "circulo":
                System.out.println("Ingrese el radio del circulo: ");
                radio = entrada.nextDouble();
                perimetro = perimetro_del_circulo(radio);
                area = area_del_circulo(radio);
                break;
        }
        System.out.println("La figura geometrica " + figura_geometrica
                + " el perimetro es: " + perimetro 
                + " el área es: " + area);
    }
    public static double area_del_circulo(double radio){
        double resultado = Math.PI * Math.pow(radio,2);
        return resultado;
    }
    
    public static double perimetro_del_circulo(double radio){
        //double perimetro = 2 * 3.1415 * radio;
        double perimetro = 2 * Math.PI * radio;
        return perimetro;
    }
}
