import java.util.ArrayList;

public class Agenda {
    private ArrayList<EntradaEmAgenda> agenda;

    public Agenda(){
        this.agenda = new ArrayList<>();
    }

    public void addCompromisso(EntradaEmAgenda compromisso){
        agenda.add(compromisso);
        System.out.println("Compromisso adicionado!");
    }

    public void listaDia(int dd, int mm, int yy){
        for (EntradaEmAgenda compromissoDia: agenda){
            if (compromissoDia.getDd() == dd &&
            compromissoDia.getMm() == mm &&
            compromissoDia.getYy() == yy){
                System.out.println(compromissoDia);
            }
        }
    }

    public void listaDia2(int dd, int mm, int yy) {
    agenda.stream()
          .filter(e -> e.getDd() == dd && e.getMm() == mm && e.getYy() == yy)
          .forEach(System.out::println);
}
}
