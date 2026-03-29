package NumerosComplexos;

public class Main {
    public static void main(String[] args){
        NumerosComplexos num1 = new NumerosComplexos();
        System.out.println(num1);

        NumerosComplexos num2 = new NumerosComplexos(5);
        System.out.println(num2);

        NumerosComplexos num3 = new NumerosComplexos(5, -3);
        System.out.println(num3);

        NumerosComplexos num4 = new NumerosComplexos(5, 3);
        System.out.println(num4);
    }
}
