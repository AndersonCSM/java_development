public class Main {
    public static void main(String[] args) {
        EventoDelegacao ev1 = new EventoDelegacao(14, 3, 2003, 12, "Festa");
        EventoHeranca ev2 = new EventoHeranca(16, 5, 2025, 15, "prova");

        System.out.println(ev1);
        System.out.println(ev2);
    }
}
