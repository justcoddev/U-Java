package _011_conversionestiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author JUSTCODDEV
 */
public class _011_ConversionesTiposPrimitivos {

    public static void main(String[] args) {
        //Convertir tipo String a un tipo int
        var edad = Integer.parseInt("20");
        System.out.println("El valor entero es = " + edad);
        var ex = edad * 2;
        System.out.println("comprobando que es entero : " + ex);

        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);

        //Pedir un valor
        var consola = new Scanner(System.in);
        System.out.println("ingrese un valor");
        edad = Integer.parseInt(consola.nextLine());
        System.out.println("edad= " + edad);
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);

        var caracter = "hola".charAt(3);
        System.out.println("caracter = " + caracter);
        
        System.out.println("Proporciona un caracter");
        caracter = consola.nextLine().charAt(2);
        System.out.println("caracter = " + caracter);
    }

}
