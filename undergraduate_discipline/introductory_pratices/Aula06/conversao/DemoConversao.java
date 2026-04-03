package conversao;

public class DemoConversao {
    public static void main(String[] args) {
        double km = ConversaoUnidades.milhasQuilometros(2);
        System.out.println("2 milhas = " + km + " km");

        double cm1 = ConversaoUnidades.pesCentimetros(2);
        System.out.println("2 pes = " + cm1 + " cm");

        double cm2 = ConversaoUnidades.polegadasCentimetros(2);
        System.out.println("2 polegadas = " + cm2 + " cm");

    }
}