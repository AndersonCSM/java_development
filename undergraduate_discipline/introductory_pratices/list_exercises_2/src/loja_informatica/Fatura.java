package loja_informatica;

public class Fatura {
    int identificacao;
    String descricao;
    int qtd_comprada;
    double preco_unitario;

    public Fatura(int identificacao, String descricao, int qtd_comprada, double  preco_unitario){
        this.identificacao = identificacao;
        this.descricao = descricao;

        if ( qtd_comprada < 0){
            this.qtd_comprada = 0;
        } else {
            this.qtd_comprada = qtd_comprada;
        }

        this.preco_unitario = (preco_unitario > 0) ? preco_unitario : 0.0;
    }

    public double calculaTotal(){
        return this.qtd_comprada * this.preco_unitario;
    }
}
