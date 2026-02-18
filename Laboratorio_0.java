package laboratorio_0;
import java.util.Scanner;

public class Laboratorio_0 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Indique la cantidad de productos que vende: ");
        int NumProductos = entrada.nextInt();
        String[] Productos;
        Productos = new String[NumProductos];
        for (int i=0; i<NumProductos; i++){
           System.out.println("Ingrese el nombre del producto " + (i+1));
           Productos[i] = entrada.nextLine();
        }
        }
    
}
