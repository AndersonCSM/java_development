package Comparador;

public class main {
    public static void main(String[] args) {

        System.out.println("--- TESTES COM INT ---");
        System.out.println("Maior de 2: " + Comparador.maior(15, 30));
        System.out.println("Maior de 3: " + Comparador.maior(10, 5, 8));
        System.out.println("Maior de 4: " + Comparador.maior(1, 9, 4, 6));
        System.out.println("Maior de 5: " + Comparador.maior(50, 20, 90, 10, 40));

        System.out.println("\n--- TESTES COM DOUBLE ---");
        System.out.println("Maior de 2: " + Comparador.maior(1.5, 1.2));
        System.out.println("Maior de 3: " + Comparador.maior(2.2, 8.9, 4.5));
        System.out.println("Maior de 4: " + Comparador.maior(0.1, 0.5, 0.9, 0.2));
        System.out.println("Maior de 5: " + Comparador.maior(10.1, 10.9, 10.5, 10.2, 10.0));
    }
}
