package calculadora;

import java.util.Scanner;

public class Operaciones {
    static int a = 0;
    static int b = 0;
    public static void menu() {
        System.out.println("Elige una opción de la lista\n"
                + "\t1. Sumar\n"
                + "\t2. Restar\n"
                + "\t3. Multiplicar\n"
                + "\t4. Dividir\n"
                + "\t0. Salir");
    }

    public static void intNum() {
        introduccionTexto(a, "el primer número");
        introduccionTexto(b, "el segundo número");
    }
    
    public static void opcion() {
        int opcion = 0;
        boolean continuar = false;
        do {
            opcion = introduccionTexto(opcion, "una opción");
            switch (opcion) {
                case 0 -> {
                    System.out.println("¡Adiós!");
                    continuar = false;
                }
                case 1 -> {
                    sumar(a, b);
                }
                case 2 -> {
                    restar(a, b);
                }
                case 3 -> {
                    multiplicar(a, b);
                }
                case 4 -> {
                    if (a != 0 || b != 0) {
                        dividir(a, b);
                    } else {
                        System.err.println("¡No se puede dividir entre cero!");
                    }
                }
                default -> System.err.println("¡Número no válido!");
            }
        } while (!continuar);
    }
    
    private static int introduccionTexto(int valor, String texto) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe " + texto + " : ");
        if (!sc.hasNextInt()) {
            System.out.println("Tiene que ser un número");
        } else if (valor < 0) {
            System.out.println("Tiene que ser entero y positivo");
        }
        valor = sc.nextInt();
        return valor;
    }
    
    private static int sumar (int a, int b) {
        return a+b;
    }
    private static int restar (int a, int b) {
        return a-b;
    }
    private static int multiplicar (int a, int b) {
        return a*b;
    }
    private static int dividir (int a, int b) {
        return a/b;
    }
}
