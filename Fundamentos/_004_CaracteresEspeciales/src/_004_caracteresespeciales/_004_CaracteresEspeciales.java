package _004_caracteresespeciales;

/**
 *
 * @author JUSTCODDEV
 */
public class _004_CaracteresEspeciales {

    public static void main(String[] args) {
        var nombre = "Cristina";

        System.out.println("Nueva linea: \n" + nombre);//cacter salto de linea
        System.out.println("Tabulador: \t" + nombre);//caracter de tabulacion
        System.out.println("Retroceso: \b\b" + nombre); //caracter de retroceso
        System.out.println("Comilla simple: \'" + nombre + "\'"); //comilla simple
        System.out.println("Comilla doble: \"" + nombre + "\""); //comilla doble

    }

}
