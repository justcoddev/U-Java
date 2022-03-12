package _021_ejercicio_rectangulo;

import java.util.Scanner;

/**
 *
 * @author JUSTCODDEV
 */
public class _021_Ejercicio_Rectangulo {

    public static void main(String[] args) {
        int alto;
        int ancho;
        Scanner consola = new Scanner(System.in);

        System.out.println("Proporcione el alto: ");
        alto = consola.nextInt();
        System.out.println("Proporcione el ancho: ");
        ancho = consola.nextInt();

        int area = alto * ancho;

        int perimetro = (alto * ancho) * 2;
        
        System.out.println("Área = " + area);
        System.out.println("Perímetro = " + perimetro);

    }

}
