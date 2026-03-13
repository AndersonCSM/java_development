import java.util.Scanner;
/*
4. Escreva um programa que receba uma temperatura em graus centígrados e a apresente
em graus Fahrenheit.
*/
public class ConversaoTemperatura {
    public static void main(String[] args){
        float celsius = 0f, fahr = 0f;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe uma temperatura em Celsius para obter a conversão em Fahrenheit");
        celsius = input.nextFloat();

        fahr = (celsius * 9/5) + 32;

        System.out.printf("temperatura em Fahrenheit: %.2f F\n",fahr);
    }
}
