package Aplicaciones;
import java.util.Scanner;
public class ejerccio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float estatura, peso, IMC;
    
        System.out.print("Ingrese estatura : ");
        estatura = Float.parseFloat(teclado.nextLine());
        
        System.out.print("Ingrese peso : ");
        peso = Float.parseFloat(teclado.nextLine());
        
        IMC= peso/(estatura*estatura);
        System.out.println("-----reporte----");
        System.out.println("----------------");
        System.out.println("la estatura es :" + estatura);
        System.out.println("el peso  es : " + peso);
        System.out.println("el IMC es :" + IMC );
    }
    
 
}
