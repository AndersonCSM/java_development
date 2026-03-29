package ClasseGenerica;

public class Generico<F, S, T> {
    private F first;
    private S second;
    private T third;

    public Generico(F v1, S v2, T v3){
        this.first = v1;
        this.second = v2;
        this.third = v3;
    }

    public void tiposAtributos(){
        int cont = 0;
        if (first.getClass() == second.getClass() && first.getClass() == third.getClass()) {
            cont = 3; // Todos os três são do mesmo tipo
        } else if (first.getClass() == second.getClass() ||
                first.getClass() == third.getClass() ||
                second.getClass() == third.getClass()) {
            cont = 2; // Apenas dois são do mesmo tipo
        }

        System.out.println("Quantidade de tipos iguais: " + cont);
    }

    public void printer(){
        // Substituímos F, S e T por .getClass().getSimpleName() para pegar o nome do tipo (ex: "Integer", "String")
        System.out.printf("""
                Primeiro: tipo %s | valor %s
                Segundo: tipo %s | valor %s
                Terceiro: tipo %s | valor %s
                """,
                first.getClass().getSimpleName(), first,
                second.getClass().getSimpleName(), second,
                third.getClass().getSimpleName(), third);
    }

}
