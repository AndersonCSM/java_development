import java.util.Scanner;
/*
1. Escreva um programa que calcule a área de um quadrado. O valor do lado de um quadrado deverá
ser informado pelo usuário.
*/
public class QuadradoArea {
    public static void main(String[] args){
        float side = 0F;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o comprimento do lado do quadrado");
        side = input.nextFloat();

        System.out.printf("A área do quadrado é de: %.2f\n", (side*side));
    }
}
