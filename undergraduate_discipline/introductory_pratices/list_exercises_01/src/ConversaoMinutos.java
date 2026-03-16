import java.util.Scanner;

/*
6. Escreva um programa que recebe um valor inteiro representando um intervalo em minutos
e imprime o equivalente a esse período expresso em valores inteiros para dias, horas e
minutos. Ex.: 9257 minutos = 6 dias, 10 horas e 17 minutos.
*/
public class ConversaoMinutos {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int mm = 0, hh, dd = 0, inp = 0, resto = 0;

        System.out.println("Informe o tempo em minutos");
        inp = input.nextInt();

        dd = inp / 1440;
        hh = (inp % 1440) / 60;
        mm = inp % 60;

        System.out.printf("%d dias, %d horas e %d minutos.", dd, hh, mm);

        input.close();
    }
}
