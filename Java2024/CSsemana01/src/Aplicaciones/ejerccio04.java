package Aplicaciones;

import java.util.Scanner;

public class ejerccio04 {
    public static void main(String[] args) {
        double radio, altura, area, volumen;
        final double PI = 3.14;

        Scanner mause = new Scanner(System.in);

        System.out.print("Ingresa el radio del cilindro en metros: ");
        radio = mause.nextDouble();

        System.out.print("Ingresa la altura del cilindro en metros: ");
        altura = mause.nextDouble();

        area = 2 * PI * radio * (radio + altura);
        volumen = PI * Math.pow(radio, 2) * altura;

        System.out.println("----Reporte----");
        System.out.println("pi :" + PI);
        System.out.println("---------------");
        System.out.println("el radio es  :" + radio);
        System.out.println("La altura es: " + altura);
        System.out.println("El AREA es  : " + area);
        System.out.println("El VOLUMEN es  : " + volumen);

        mause.close(); // Cerrar el scanner al finalizar la lectura de entrada
    }
}