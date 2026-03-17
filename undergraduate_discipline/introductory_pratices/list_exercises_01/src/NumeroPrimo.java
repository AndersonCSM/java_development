public class NumeroPrimo {

    public static void main(String[] args) {
        System.out.println(ePrimo(10));
    }

    public static boolean ePrimo(int num) {
        return checarDivisibilidade(num, 2);
    }

    public static boolean checarDivisibilidade(int num, int divisor) {
        if ((num <= 1) || ((num % divisor) == 0))
            return false;

        if ((num == 2) || (num == divisor))
            return true;

        return checarDivisibilidade(num, divisor + 1);
    }
}
