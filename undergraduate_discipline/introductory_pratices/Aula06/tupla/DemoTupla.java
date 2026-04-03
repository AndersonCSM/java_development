package tupla;

public class DemoTupla {
    public static void main(String args[]) {
        Tupla<Integer, String> t1 = new Tupla<Integer, String>(20, "Ufersa");
        System.out.println(t1);

        Tupla<Double, Character> t2 = new Tupla<Double, Character>(3.6, 'c');
        System.out.println(t2);

        Tupla<Float, Float> t3 = new Tupla<Float, Float>(3.6F, 4.5F);
        System.out.println(t3);

    }
}
