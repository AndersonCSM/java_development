public class Politico extends Pessoa{
    private String partidoPolitico;

    public Politico(String nome, int idade, String partido){
        super(nome, idade);
        this.partidoPolitico = partido;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public String toString(){
        return super.toString() +
                ", partido=" + partidoPolitico;
    }
}
