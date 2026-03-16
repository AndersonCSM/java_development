import java.util.Scanner;
import java.util.Arrays;

/*
2. Escreva um programa que calcule a soma e a média aritmética de 3 números. Os 3
valores reais serão informados pelo usuário.
*/
public class Media {
    public static void main(String[] args){
        float soma = 0f;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++){
            System.out.println("Informe a nota "+(i+1));
            soma += input.nextFloat();
        }

        System.out.printf("A média aritmética das notas inseridas é de %.2f ", (soma/3));

        input.close();
    }

}
