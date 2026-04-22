import java.util.Scanner;

/*
11. Escreva um programa que lê dois pontos no plano cartesiano com coordenadas x e y e
informa se o segundo ponto está acima, abaixo, à esquerda e/ou à direita do primeiro.
*/
public class PosicaoPlano {
    public static void main(String[] args) {
        int[] pontoA = new int[2];
        int[] pontoB = new int[2];

        Scanner input = new Scanner(System.in);

        System.out.println("Digite as coordenadas x e y para o ponto A \n(separada por espaço ou enter)");
        pontoA[0] = input.nextInt();
        pontoA[1] = input.nextInt();

        System.out.println("Digite as coordenadas x e y para o ponto B \n(separada por espaço ou enter)");
        pontoB[0] = input.nextInt();
        pontoB[1] = input.nextInt();

        String posicao = "Ponto A está a ";
        if (pontoA[0] < pontoB[0]) {
            posicao += "esquerda";
        } else if (pontoA[0] > pontoB[0]) {
            posicao += "direita";
        } else {
            posicao += "sobre";
        }
        posicao += " e ";

        if (pontoA[1] < pontoB[1]) {
            posicao += "abaixo";
        } else if (pontoA[1] > pontoB[1]) {
            posicao += "acima";
        } else {
            posicao += "igual";
        }
        posicao += " do ponto B";

        System.out.println(posicao);

        input.close();
    }
}
