public class Governador extends Politico{
    private String estado;

    public Governador(String nome, int idade, String partido, String estado) {
        super(nome, idade, partido);
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return  super.toString()+
                ", estado='" + estado + '\'' + '}';
    }
}
