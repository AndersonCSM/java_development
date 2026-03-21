package loja_informatica;

public class Main {
    public static void main(String[] args){
        Fatura f1 = new Fatura(1, "Resmas de papeis", 53, 50.50);

        System.out.println("O valor total foi de R$ "+f1.calculaTotal());
    }
}
