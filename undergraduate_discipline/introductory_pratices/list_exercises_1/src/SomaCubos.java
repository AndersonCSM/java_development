/*
16. Escreva um programa que determine quais são todos os números de 3 algarismos cuja
soma dos cubos de seus algarismos sejam iguais ao próprio número.
• Exemplo: 153 = 13 + 53 + 33 = 1 + 125 + 27.
* */
public class SomaCubos {
    public static void main(String[] args) {
        int numeros = 0;
        int numeroBusca = 100;
        while ((numeros < 3) && (numeroBusca < 1000)) {
            int[] retornoNumero = UDC(numeroBusca);

            int somaBusca = (int) (Math.pow(retornoNumero[0], 3) + Math.pow(retornoNumero[1], 3) + Math.pow(retornoNumero[2], 3));
            if (somaBusca == numeroBusca) {
                System.out.println("Check - " + numeroBusca);
                numeros++;
            }
            numeroBusca++;
        }
    }

    public static int[] UDC(int numero) {
        int c = (int) numero / 100;
        int d = (numero - (c * 100)) / 10;
        int u = (numero - (c * 100) - (d * 10));

        return new int[]{c, d, u};
    }
}
