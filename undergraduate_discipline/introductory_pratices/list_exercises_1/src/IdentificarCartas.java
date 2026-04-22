import java.util.Scanner;

/*
9. Escreva um programa que lê um número que representa o valor da carta, de um (ás) a
treze (rei), e outro número correspondente ao naipe (1 = ouros, 2 = paus, 3 = copas e 4 =
espadas). O programa deve imprimir o nome da carta por extenso.
*/
public class IdentificarCartas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero = 0, naipe = 0;

        System.out.println("Informe o número da carta");
        numero = input.nextInt();
        System.out.println("Informe o naipe da carta");
        naipe = input.nextInt();

        String stringCarta = null;
        String stringNaipe = null;

        if (((0 < numero) && (numero < 14)) && ((0 < naipe) && (naipe < 5))) {
            stringCarta = switch (numero) {
                case 1 -> "ás";
                case 2 -> "dois";
                case 3 -> "três";
                case 4 -> "quatro";
                case 5 -> "cinco";
                case 6 -> "seis";
                case 7 -> "sete";
                case 8 -> "oito";
                case 9 -> "nove";
                case 10 -> "dez";
                case 11 -> "valete";
                case 12 -> "rainha";
                case 13 -> "rei";
                default -> stringCarta;
            };

            switch (naipe) {
                case 1:
                    stringNaipe = "ouros";
                    break;
                case 2:
                    stringNaipe = "paus";
                    break;
                case 3:
                    stringNaipe = "copas";
                    break;
                case 4:
                    stringNaipe = "espadas";
                    break;
            }
        } else {
            System.out.println("Valor inserido inválido");
        }

        System.out.printf("Carta informada: %s de %s\n", stringCarta, stringNaipe);
        input.close();

    }
}
