package Aplicaciones;
import java.util.Scanner;



public class ejerccio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float largo, ancho, areaT, metrocuadrado, precio ;
        
        System.out.print("Ingrese el largo el terreno: ");
        largo = Float.parseFloat(teclado.nextLine());
        System.out.print("Ingrese el ancho del terreno: ");
        ancho = Float.parseFloat(teclado.nextLine());
        
        areaT = largo * ancho;
        
        System.out.println("El largo del terreno es : " + largo);
        System.out.println("El ancho del terreno es : " + ancho);
        System.out.println("El area del terreno es : " + areaT);
        System.out.println("-------------------------------------");
        
        System.out.print("Ingrese el area del terreno: ");
        
        areaT = Float.parseFloat(teclado.nextLine());
        System.out.print("Ingrese el precio del metro cuadrado: ");
        metrocuadrado = Float.parseFloat(teclado.nextLine());
        
        precio = areaT * metrocuadrado;
        
        System.out.println("El precio del metro cuadrado es : " + metrocuadrado);
        System.out.println("El precio del terreno es : " + precio);
    }
}
