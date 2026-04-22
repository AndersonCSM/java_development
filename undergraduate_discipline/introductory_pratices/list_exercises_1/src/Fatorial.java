/*
19. Escreva uma função que calcule o fatorial de forma recursiva. Para cada chamada recur-
siva, exiba as saídas em uma linha separada e adicione um nível de recuo (tabulação).
Faça o melhor que você puder para tornar a saída limpa, interessante e significativa. Seu
objetivo aqui é projetar e implementar um formato de saída que facilite o entendimento
da recursão.
Por exemplo, para uma entrada n = 5, o programa deve exibir:
0! = 1
    1! = 1
        2! = 2
            3! = 6
                4! = 24
                    5! = 120
 * */
public class Fatorial {

    public static void main(String[] args) {
        fatorial(5);
    }

    public static int fatorial(int n) {
        int v;
        if (n == 0)
            v = 1;
        else
            v = n * fatorial(n - 1);

        for (int i = 0; i < n; i++)
            System.out.print("    ");


        System.out.printf("%d! = %d\n", n, v);

        return v;
    }
}
