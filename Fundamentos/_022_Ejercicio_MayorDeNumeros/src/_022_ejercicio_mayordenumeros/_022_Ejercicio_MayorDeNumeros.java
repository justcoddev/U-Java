package _022_ejercicio_mayordenumeros;

import java.util.Scanner;

/**
 *
 * @author JUSTCODDEV
 */
public class _022_Ejercicio_MayorDeNumeros {

    public static void main(String[] args) {
        //variables
        int numero1;
        int numero2;

        Scanner consola = new Scanner(System.in);

        System.out.print("Proporciona el numero 1: ");
        numero1 = consola.nextInt();
        System.out.print("Proporciona el numero 2: ");
        numero2 = consola.nextInt();

        var resultado = (numero1 > numero2) ? "El numero mayor es: " + numero1 : "El numero mayor es: " + numero2;
        System.out.println(resultado);
    }

}
