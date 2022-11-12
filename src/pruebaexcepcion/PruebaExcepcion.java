package pruebaexcepcion;

public class PruebaExcepcion {

    public static void main(String[] args) throws Exception {
        formatoNumero();
        desborde();
        aritmetico();
        Division objC = new Division();
        objC.dividir();
    }

    public static void formatoNumero() {
        int numero;
        String cadena = " 1";
        try {

            numero = Integer.parseInt(cadena);

        } catch (NumberFormatException e) {

            System.out.println("No es un número, es una cadena de texto." + e);

        }
    }

    public static void desborde() {

        try {
            int v[] = new int[3];
            for (int i = 0; i < 5; i++) {
                v[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }

    public static void aritmetico() {

        int numero = 5, resultado;
        try {
            resultado = numero / 0;
            System.out.print(resultado);
        } catch (ArithmeticException e) {
            System.out.println("division por cero INDEFINIDA");
        }
    }

}
