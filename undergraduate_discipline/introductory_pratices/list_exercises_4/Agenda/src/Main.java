public class Main {
    public static void main(String[] args){
        Agenda agenda1 = new Agenda();

        EntradaEmAgenda evento = new EntradaEmAgenda(4,20, 5, 2025, "ECOP");
        EntradaEmAgenda evento2 = new EntradaEmAgenda(20, 5, 2025, "Avaliacao");
        EntradaEmAgenda evento3 = new EntradaEmAgenda(20, 5, 2025, "Trabalho");
        EntradaEmAgenda evento4 = new EntradaEmAgenda(1, 6, 2025, "Dormir");

        agenda1.addCompromisso(evento);
        agenda1.addCompromisso(evento2);
        agenda1.addCompromisso(evento3);
        agenda1.addCompromisso(evento4);

        agenda1.listaDia(20, 5, 2025);
    }

}
