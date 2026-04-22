public class Produto {
    public static void main(String[] args){
        float p1 = produto(new float[]{1f, 1.5f, 3f});
        float p2 = produto(new float[]{2f, 27.3f, 3f});
        float p3 = produto(new float[]{-1f, 15f, 13.334f});

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }

    public static float produto(float ...numeros){
        float aux = 1;
        for (float n: numeros){
            aux *= n;
        }
        return aux;
    }
}
