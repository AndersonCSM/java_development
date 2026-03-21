package esportes;

public class Time {
    String nome;
    String modalidade;
    int classificacao;

    public Time(String nome, String modalidade, int classificacao){
        this.nome = nome;
        this.modalidade = modalidade;
        this.classificacao = classificacao;
    }

    public void exibirTime(){
        System.out.println(nome+" na "+classificacao+" classificação e na modalidade "+modalidade);
    }


}
