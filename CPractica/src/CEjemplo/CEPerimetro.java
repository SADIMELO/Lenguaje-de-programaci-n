package Aplicaciones;

import java.util.Scanner;

public class CEPerimetro{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la base del rectangulo en metros: ");
        double base = teclado.nextDouble();
        System.out.print("Ingrese la altura del rectangulo en metros: ");
        double altura = teclado.nextDouble();
        double area = base * altura;
        double perimetro = 2 * (base + altura);
        System.out.println("El Area del rectangulo es: " + area + " metros cuadrados");
        System.out.println("El Perimetro del rectangulo es: " + perimetro + " metros");
    }
}

