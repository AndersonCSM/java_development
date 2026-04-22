import java.util.Scanner;

/*
14. Escreva um programa que apresente a série de Fibonacci até o n-ézimo termo. Assuma
que n > 0.
*/
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        int sucessor = 1;

        System.out.println("Informe o n-ézimo termo de FIbonacci que deseja visualizar");
        num = input.nextInt();

        int atual = 1, anterior = 0;


        for (int i = 1; i <= num; i++) {
            System.out.printf("%d ", atual);

            sucessor = atual + anterior;

            anterior = atual;
            atual = sucessor;
        }

    }
}
