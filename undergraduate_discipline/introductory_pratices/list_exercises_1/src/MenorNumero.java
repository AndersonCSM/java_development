import java.util.Scanner;

// 7. Escreva um programa que lê três números e determina qual número é o menor.
public class MenorNumero {
    public static void main(String[] args){
        float n1 ,n2, n3;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        n1 = input.nextFloat();

        System.out.println("Informe o segundo número: ");
        n2 = input.nextFloat();

        System.out.println("Informe o terceiro número: ");
        n3 = input.nextFloat();

        if ((n1 < n2) && (n1 < n3)){
            System.out.printf("%.2f é o menor número\n", n1);
        } else if ((n2 < n1) && (n2 < n3)){
            System.out.printf("%.2f é o menor número\n", n2);
        } else if ((n3 < n1) && (n3 < n2)){
            System.out.printf("%.2f é o menor número\n", n3);
        }

        input.close();
    }
}
