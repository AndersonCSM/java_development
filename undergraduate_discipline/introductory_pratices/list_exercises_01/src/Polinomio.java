import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

/*
22. Dado um polinômio
Pn (x) = a0xn + a1 xn−1 + · · · + an−1 x + an
 (1)
este pode ser definido recursivamente como
Pn(x) = xPn−1(x) + an
* */
public class Polinomio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> termos = new ArrayList<>();

        System.out.println("""
                P_n (x) = a_0 * x^(n) + a_1 * x^(n−1) + · · · + a_(n−1)*x + a_n
                Para calcular o polinômio insira as informações abaixo:
                """);
        System.out.println("Valor de n: ");
        int n = input.nextInt();
        System.out.println("Valor de x: ");
        int x = input.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.println("Informe o " + i + " termo");
            termos.add(input.nextInt());
        }

        float resultado = calcPolinomio(x, termos, n);
        System.out.println("O resultado da operação é:" + resultado);

        input.close();
    }

    public static float calcPolinomio(int x, ArrayList<Integer> termos, int n) {
        if (n == 0) {
            return termos.getFirst();
        } else {
            return x * calcPolinomio(x, termos, n - 1) + termos.get(n);
        }
    }
}
