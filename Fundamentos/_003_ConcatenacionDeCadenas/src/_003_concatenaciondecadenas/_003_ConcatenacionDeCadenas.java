package _003_concatenaciondecadenas;

/**
 *
 * @author JUSTCODDEV
 */
public class _003_ConcatenacionDeCadenas {

    public static void main(String[] args) {
        var usuario = "Teddy";
        var titulo = "Ingeniero";

        var union = titulo + " " + usuario;
        System.out.println("union = " + union);

        var i = 3;
        var j = 4;
        System.out.println(i + j);//se realiza la suma de numeros
        System.out.println(i + j + " " + usuario);//izq a der se evaluan als expresiones
        System.out.println(usuario + i + j);//al iniciar con una cadena, lo demas lo toma como cadena
        System.out.println(usuario + (i + j));//con parentesis evalua y toman la maxima prioridad, luego vuelve a evaluar y concatena
        
    }

}
