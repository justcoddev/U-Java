package _006_tiposprimitivos;

/**
 *
 * @author JUSTCODDEV
 */
public class _006_TiposPrimitivos {

    public static void main(String[] args) {
        /*
            tipos primitivos enteros: byte, short, int, long
         */

        byte numeroByte = (byte) 129;
        System.out.println("Valor byte: " + numeroByte);
        System.out.println("valor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("valor maximo byte: " + Byte.MAX_VALUE);

        short numeroShort = (short) 32768;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("valor minimo short: " + Short.MIN_VALUE);
        System.out.println("valor maximo short: " + Short.MAX_VALUE);

        int numeroInt = (int) 2147483647L;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("valor minimo int: " + Integer.MIN_VALUE);
        System.out.println("valor maximo int: " + Integer.MAX_VALUE);

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("valor minimo long: " + Long.MIN_VALUE);
        System.out.println("valor maximo long: " + Long.MAX_VALUE);
    }
}
