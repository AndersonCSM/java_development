public class EventoHeranca extends DataHora{
    private String descricao;

    public EventoHeranca(int dia, int mes, int ano, int hora, String descricao) {
        super(dia, mes, ano, hora);
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "EventoHeranca{" +
                "descricao='" + descricao + '\'' +
                super.toString() + '}';
    }
}
