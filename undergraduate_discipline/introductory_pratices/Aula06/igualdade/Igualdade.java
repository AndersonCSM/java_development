package igualdade;

public class Igualdade {
    public static void main(String[] args) {
        System.out.println("String: " + ehIgual("UFERSA", "UFERSA"));
        System.out.println("Float: " + ehIgual(2.5F, 3.5F));
        System.out.println("Double: " + ehIgual(1.5, 1.5));
        System.out.println("String: " + ehIgual("a", "c"));

    }

    public static <T> boolean ehIgual(T valor1, T valor2) {
        return valor1.equals(valor2);
    }
}
