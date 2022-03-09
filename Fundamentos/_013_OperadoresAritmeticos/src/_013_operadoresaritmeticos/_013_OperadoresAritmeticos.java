package _013_operadoresaritmeticos;

/**
 *
 * @author JUSTCODDEV
 */
public class _013_OperadoresAritmeticos {

    public static void main(String[] args) {
        int a = 3, b = 2;
        var resultado = a + b;
        System.out.println("resultado de la suma = " + resultado);

        resultado = a - b;
        System.out.println("resultado de la resta = " + resultado);

        resultado = a * b;
        System.out.println("resultado de lam ultiplicacion = " + resultado);

        var resultado2 = 3D / b;
        System.out.println("resultado de la division = " + resultado2);

        resultado = a % b;
        System.out.println("resultado de modulo = " + resultado);
        if (a % 2 == 0) {
            System.out.println("Es numero par");
        } else {
            System.out.println("Es numero impar");
        }
    }

}
