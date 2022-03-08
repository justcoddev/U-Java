package _012_ejercicio_tiendalibros;

import java.util.Scanner;

/**
 *
 * @author JUSTCODDEV
 */
public class _012_Ejercicio_TiendaLibros {

    public static void main(String[] args) {
        String nombre;
        int id;
        double precio;
        boolean envioGratuito;
        String envio;
        Scanner consola = new Scanner(System.in);
        System.out.println("Proporciona el nombre del libro:");
        nombre = consola.nextLine();
        System.out.println("Proporciona el id:");
        id = consola.nextInt();
        System.out.println("Proporciona el precio:");
        precio = consola.nextInt();
        System.out.println("Proporciona el envio gratuito:");
        envioGratuito = consola.nextBoolean();
        if (envioGratuito) {
            envio = "Si";
        } else {
            envio = "No";
        }
        System.out.println("Libro: " + nombre + " #" + id);
        System.out.println("Precio: $" + precio);
        System.out.println("Envio Gratuito: " + envio);
    }

}
