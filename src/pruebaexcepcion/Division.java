
package pruebaexcepcion;

import java.util.Scanner;

public class Division {
     
    public double dividir() throws Exception{
        Scanner sc = new Scanner(System.in);
    System.out.print("Introduce dos numeros para dividir\nNumero: ");
    
    int entero = sc.nextInt();
     if(entero<10){
            throw new ExcepcionIntervalo("escribir un numero entero mayor que 10");
        }
    System.out.print("Numero: ");
      double divisor = sc.nextInt();
    if(divisor==0){
    try {
             double resultado = entero/divisor;
            System.out.print(resultado);
        } catch (ArithmeticException e) {
            System.out.println("division por cero INDEFINIDA");
        }
    }
    try{
    } catch (NumberFormatException e) {

            System.out.println("No es un número." + e);

        }
     double resultado = entero/divisor;
    System.out.println("La division de "+entero+"/"+divisor+" = " +resultado);
        return resultado;
    }
    public static class ExcepcionIntervalo extends Exception {

        
        public ExcepcionIntervalo(String msg) {
        super(msg);
        }
    }
}
