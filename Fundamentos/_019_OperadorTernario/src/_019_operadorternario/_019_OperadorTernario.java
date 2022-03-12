package _019_operadorternario;

/**
 *
 * @author JUSTCODDEV
 */
public class _019_OperadorTernario {

    public static void main(String[] args) {
        var resultado = (1 > 2) ? "verdad" : "falso";
        System.out.println("resultado = " + resultado);

        var numero = 8;
        resultado = (numero % 2 == 0) ? "numero par" : "numero impar";
        System.out.println("resultado = " + resultado);
    }

}
