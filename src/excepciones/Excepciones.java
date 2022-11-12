package excepciones;

import java.util.Scanner;

public class Excepciones {

    public static void main(String[] args) throws Exception {
        formatoNumero();
        desborde();
        aritmetico();
        division();
    }

    public static void formatoNumero() {
        int numero;
        String cadena = "   1";
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
        System.out.println("");

    }

    public static float division() throws Exception {
        System.out.println("5.punto division: ");
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.print("digite primer numero: ");

        int entero = sc.nextInt();
        if (entero < 10) {
            throw new ExcepcionIntervalo("error, digite un entero mas grande al numero 10");
        }
        System.out.print("digite segundo numero: ");
        int divisor = sc.nextInt();
        if (divisor == 0) {
            try {
                float resultado = entero / divisor;
                System.out.print(resultado);
            } catch (ArithmeticException e) {
                System.out.println("division por cero INDEFINIDA");
            }
        }
        try {
        } catch (NumberFormatException e) {

            System.out.println("No es un número." + e);

        }
        float resultado = entero / divisor;
        System.out.println("el resunlato es " + entero + "/" + divisor + " = " + resultado);
        return resultado;
    }

    public static class ExcepcionIntervalo extends Exception {

        public ExcepcionIntervalo(String msg) {
            super(msg);
        }
    }
}
