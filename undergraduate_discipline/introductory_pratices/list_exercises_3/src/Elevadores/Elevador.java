package Elevadores;

public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int qtdPessoas;
    
    public Elevador(int capacidade, int totalAndares){
        this.andarAtual = 0;
        this.qtdPessoas = 0;

        if ((capacidade > 0) || (totalAndares > 0)){
            this.capacidade = capacidade;
            this.totalAndares = totalAndares;
        } else {
            this.capacidade = 1;
            this.totalAndares = 1;
        }
    }
    
    public void entra(){
        if (qtdPessoas < capacidade){
            qtdPessoas++;
        }
    }

    public void sai(){
        if (qtdPessoas > 0){
            qtdPessoas--;
        }
    }

    public void sobe(){
        if (andarAtual != totalAndares){
            andarAtual++;
        }
    }

    public void desce(){
        if (andarAtual != 0){
            andarAtual--;
        }
    }

    @Override
    public String toString() {
        return String.format("""
                --------------
                Capacidade: %d
                Quantidade de pessoas: %d
                Andar atual: %d
                Total de andares: %d
                """, capacidade, qtdPessoas, andarAtual, totalAndares);
    }
}
