/*
20. Crie uma função recursiva mdc que retorna o máximo divisor comum de m e n. O mdc de
m e n é definido recursivamente como segue:
• se n > m, retorne mdc(n, m);
• se n = 0, retorne m;
• senão, retorne mdc(n, m%n), onde % é o operador de resto da divisão.
 * */
public class CalcularMDC {
    public static void main(String[] args) {
        System.out.println(mdc(10, 5));
    }

    public static int mdc(int m, int n) {
        if (n > m)
            return mdc(n, m);
        else if (n == 0)
            return m;
        else
            return mdc(n, m % n);

    }
}
