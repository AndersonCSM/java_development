import java.util.Scanner;

/*
3. Escreva um programa que receba um ângulo em graus e o converta para sua representação em radianos. Divulgue também seno, cosseno, tangente, cossecante, secante e
cotangente do ângulo.
* */
public class ConversaoAngulo {
    public static void main(String[] args){
        float degree = 0f;
        double radians= 0f;

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o ângulo em graus");
        degree = input.nextInt();
        radians = Math.toRadians(degree);

        System.out.printf("Graus %.4f\n",degree);
        System.out.printf("Radianos %.4f\n",radians);

        System.out.printf("Seno %.4f\n",Math.sin(radians));
        System.out.printf("Cosseno %.4f\n",Math.cos(radians));
        System.out.printf("Tangente %.4f\n",Math.tan(radians));
        System.out.printf("Cossecante %.4f\n",(1/Math.sin(radians)));
        System.out.printf("Secante %.4f\n",(1/Math.cos(radians)));
        System.out.printf("Cotangente %.4f\n",(1/Math.tan(radians)));

        input.close();
    }
}
