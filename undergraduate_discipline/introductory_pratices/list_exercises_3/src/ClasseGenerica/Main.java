package ClasseGenerica;

public class Main {
    public static void main(String[] args) {
        Generico<Integer, String, Integer> obj = new Generico<>(10, "Java", 30);

        obj.tiposAtributos();
        obj.printer();
    }
}
