/*
18. Crie uma função recursiva potencia(base,expoente) que, quando chamada, retorna baseexpoente .
Por exemplo, potencia(3,4) deve ser implementado como 3 ∗ 3 ∗ 3 ∗ 3. (A saída é apenas
81 nesse exemplo)
Assuma que expoente é um inteiro maior ou igual a 1.
* */
public class RecursivaPotencia {
    public static void main(String[] args) {
        System.out.println(potencia(2, -2));

    }

    public static float potencia(int base, int expoente) {
        if (expoente == 0) {
            return 1;
        } else if (expoente < 0) {
            return 1 / (potencia(base, expoente * (-1)));
        } else
            return base * potencia(base, expoente - 1);
    }
}
