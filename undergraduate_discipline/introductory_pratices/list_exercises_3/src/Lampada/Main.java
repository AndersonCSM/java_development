package Lampada;

public class Main {
    public static void main(String[] args){
        Lampada l1 = new Lampada();
        l1.acende();
        l1.acende();
        l1.apaga();

        System.out.println((l1.estaLigada()?"Acesa? Sim":"Acesa? Não"));
        l1.mostraEstado();
    }
}
