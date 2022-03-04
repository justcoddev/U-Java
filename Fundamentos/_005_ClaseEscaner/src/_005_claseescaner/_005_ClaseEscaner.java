package _005_claseescaner;

import java.util.Scanner;

/**
 *
 * @author JUSTCODDEV
 */
public class _005_ClaseEscaner {

    public static void main(String[] args) {
        System.out.println("Escribe tu nombre:");
        Scanner consola = new Scanner(System.in);
        var usuario = consola.nextLine();
        System.out.println("usuario = " + usuario);
        System.out.println("Escribe el titulo:");
        var titulo = consola.nextLine();
        System.out.println("Resultado: " + titulo + " " + usuario);
    }

}
