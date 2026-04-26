public class EventoDelegacao{
    private String descricao;
    private DataHora dataHora;

    public EventoDelegacao(int dia, int mes, int ano, int hora, String descricao) {
        this.descricao = descricao;
        this.dataHora = new DataHora(dia, mes, ano, hora);
    }

    @Override
    public String toString() {
        return "EventoDelegacao{" +
                "descricao='" + descricao + '\'' +
                dataHora +
                '}';
    }
}
