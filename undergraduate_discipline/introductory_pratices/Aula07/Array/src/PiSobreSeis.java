public class PiSobreSeis {
    public static void main(String[] args) {
        double vet[] = new double[1000000];

        for (int i = 0; i < vet.length; i++){
            vet[i] = 1.0/(Math.pow(i+1, 2));
        }

        for (int num = 10; num < vet.length; num*=10){
            calculaEMostraSomatoria(vet, num);
        }
    }

    public static void calculaEMostraSomatoria(double[] arr, int num){
        double soma = 0;
        for (int i = 0; i < num; i++){
            soma += arr[i];
        }

        System.out.println(num+" elementos -> pi²/6 ~= "+soma);
    }
}
