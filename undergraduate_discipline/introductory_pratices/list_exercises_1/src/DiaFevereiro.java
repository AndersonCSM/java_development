import java.util.Scanner;

/*
12. O mês de fevereiro de 2015 começou em um domingo. Escreva um programa que, dado
o número de um dia do mês de fevereiro de 2015 (um valor entre 1 e 28), imprime o dia
da semana correspondente.
• Exemplo de entrada: 10
• Exemplo de saída: O dia 10 será uma terça-feira.
*/
public class DiaFevereiro {
    public static void main(String[] args) {
        int dia = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Informe qual dia (inteiro)");
        dia = input.nextInt();

        String stringDia = null;
        stringDia = switch (dia) {
            case 1, 8, 15, 22 -> "Domingo";
            case 2, 9, 16, 23 -> "Segunda-feira";
            case 3, 10, 17, 24 -> "Terça-feira";
            case 4, 11, 18, 25 -> "Quarta-feira";
            case 5, 12, 19, 26 -> "Quinta-feira";
            case 6, 13, 20, 27 -> "Sexta-feira";
            case 7, 14, 21, 28 -> "Sábado";
            default -> stringDia;
        };

        System.out.printf("O dia %d será uma %s", dia, stringDia);

        input.close();
    }
}
