public class Media{
    public static void main(String[] args){

        double[] vet1 = {1, 2, 3};

        System.out.println(media(vet1));

    }

    public static double media(double... valores){
        double soma = 0;
        for(double val: valores){
            soma += val;
        }
        return soma / valores.length;

    }
}