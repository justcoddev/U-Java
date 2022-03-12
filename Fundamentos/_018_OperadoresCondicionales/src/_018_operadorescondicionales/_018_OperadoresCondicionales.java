package _018_operadorescondicionales;

/**
 *
 * @author JUSTCODDEV
 */
public class _018_OperadoresCondicionales {

    public static void main(String[] args) {
        var a = 1;
        var valorMinimo = 0;
        var valorMaximo = 10;

        var resultado = a >= 0 && a <= 10;
        if (resultado) {
            System.out.println("Dentro de rango");
        } else {
            System.out.println("Fuera de rango");
        }

        var vacaciones = true;
        var diaDescanso = false;
        if (vacaciones || diaDescanso) {
            System.out.println("Padre puede asisatir al juego del hijo");
        } else {
            System.out.println("El padre esta ocupado");
        }

    }
}
