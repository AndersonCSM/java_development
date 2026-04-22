/*
13. Escreva um programa para imprimir uma versão aproximada de um cartão da Mega-Sena
(somente com os números, respeitando o número de linhas e a distribuição dos números
nas linhas).
* */
public class CartaoMegaSena {
    public static void main(String[] args) {

        int count = 1;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("[%02d] ", count);
                count++;
            }
            System.out.println();
        }
    }
}
