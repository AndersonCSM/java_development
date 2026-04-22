import java.util.ArrayList;

public class Extrato{
    private float saldoFinal;
    private ArrayList<Float> transacoes;

    public Extrato() {
        this.transacoes = new ArrayList<>();
        this.saldoFinal = 0f;
    }

    public void transacao(float valor){
        if (saldoFinal + valor <= 0){ // saque
            System.out.println("Saldo insuficiente");
        } else {
            saldoFinal += valor;
            transacoes.add(valor);
        }
    }

    public void visualizar(){
        System.out.println("============");
        for (float valor: transacoes){
            System.out.println(valor);
        }
        System.out.println("============");
        System.out.println("saldo: "+saldoFinal);
    }
}