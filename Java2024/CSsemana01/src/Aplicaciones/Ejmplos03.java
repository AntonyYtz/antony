package Aplicaciones;
import java.util.Scanner;

public class Ejmplos03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float base, altura,area;
    
        System.out.print("Ingrese base :");
        base = Float.parseFloat(teclado.nextLine());
        
        System.out.print("Ingrese altura :");
        altura = Float.parseFloat(teclado.nextLine());
        
        area= base*altura;
        System.out.println("-----reporte----");
        System.out.println("----------------");
        System.out.println("la base es :" + base);
        System.out.println("la altura es :" + altura);
        System.out.println("el area es :" + area );
    }
    
 
}
