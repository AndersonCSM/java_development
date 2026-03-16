import java.util.Scanner;

/*
5. Escreva um programa que receba um número de 3 dígitos no formato CDU (Centena,
Dezena e Unidade) e, utilizando operadores aritméticos, armazene cada dígito em uma
variável de tipo inteiro. Por fim, reescreva o número no formato U CD em outra variável
de tipo inteiro e o imprima. Exemplo: 123 deve ser reescrito como 312.
*/
public class CodificacaoNumero {
    public static void main(String[] args){
        int u = 0, d = 0, c = 0;
        int inp = 0, out = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Informe o número de entrada até a casa das centenas");
        inp = input.nextInt();

        c = inp / 100;
        d = (inp - (c * 100)) / 10;
        u = (inp - (c * 100) - (d * 10));

        out = (u * 100) + (c * 10) + d;
        System.out.printf("%d \n%d \n%d \n",c, d, u);
        System.out.printf("Remontando: %d\n", out);

        input.close();
    }
}
