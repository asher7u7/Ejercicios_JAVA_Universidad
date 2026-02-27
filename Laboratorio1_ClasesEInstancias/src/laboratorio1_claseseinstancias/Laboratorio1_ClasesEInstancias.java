package laboratorio1_claseseinstancias;
import java.util.Scanner;

public class Laboratorio1_ClasesEInstancias {

    public static void main(String[] args) {
        
        double RE = 0;
        double RI = 0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el radio Exterior");
        RE = entrada.nextDouble();

        System.out.println("Ingrese el radio Interior");
        RI = entrada.nextDouble();
        
        Dona dona1 = new Dona(RE,RI);
        dona1.imprimir();
    }
    
}
