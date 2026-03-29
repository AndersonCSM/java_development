package Comparador;

public class Comparador{

    public static <T> T maior(T valor1, T valor2) {
        return (((Comparable<T>) valor1).compareTo(valor2) > 0) ? valor1 : valor2;
    }

    public static <T> T maior(T v1, T v2, T v3) {
        return maior(maior(v1, v2), v3);
    }

    public static <T> T maior(T v1, T v2, T v3, T v4) {
        return maior(maior(v1, v2, v3), v4);
    }

    public static <T> T maior(T v1, T v2, T v3, T v4, T v5) {
        return maior(maior(v1, v2, v3, v4), v5);
    }
}
