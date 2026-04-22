import jdk.swing.interop.SwingInterOpUtils;

import java.util.Random;

public class Main {
    public static void main(String[] args){
        final int LANCAMENTOS = 36_000_000;

        Random role = new Random();
        int[] arraySoma = new int[11];

        for(int i = 0; i < LANCAMENTOS; i++){
            int dice1 = role.nextInt(1, 7); // 1 até 6
            int dice2 = role.nextInt(1, 7);

            int soma = dice1 + dice2;
             // A soma varia de 2 até 12, logo se fizer -2 temos os indices
            // 0 até 11;
            arraySoma[soma - 2] += 1;
        }

        for (int i = 0; i < arraySoma.length; i++){
            System.out.printf("Valor %02d: contagem: %07d\n", (i+2), arraySoma[i]);
        }
    }

}
