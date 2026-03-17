/*
15. Escreva um programa que escreve os 4 primeiros números perfeitos. Um número perfeito
é aquele que é igual à soma dos seus divisores (exceto o próprio número). Exemplos:
6 = 1 + 2 + 3, 28 = 1 + 2 + 4 + 7 + 14.
 * */
public class NumeroPerfeito {
    public static void main(String[] args) {
        int encontrados = 0;
        int numeroAtual = 2;

        while (encontrados < 4) {
            int somaDivisores = 0;

            for (int i = 1; i <= numeroAtual / 2; i++) {
                if (numeroAtual % i == 0) {
                    somaDivisores += i;
                }
            }

            if (somaDivisores == numeroAtual) {
                System.out.printf("O número atual é perfeito: %d\n", numeroAtual);
                encontrados++;
            }

            numeroAtual++;
        }
    }
}
