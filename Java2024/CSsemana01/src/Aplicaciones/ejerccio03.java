package Aplicaciones;
import java.util.Scanner;
public class ejerccio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float base,altura, area,perimetro;
    
        System.out.print("Ingrese base : ");
        base = Float.parseFloat(teclado.nextLine());
        
        System.out.print("Ingrese altura : ");
        altura = Float.parseFloat(teclado.nextLine());
            
        area= base * altura;
        perimetro = 2*(base + altura);
        System.out.println("-----reporte----");
        System.out.println("----------------");
         System.out.println("La base es  :" + base);
        System.out.println("La altura es: " + altura);
        System.out.println("el area  es :" + area);
        System.out.println("el perimetro  es : " + perimetro);
      
    }
    
 
}
