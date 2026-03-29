package Lampada;

import Contador.Contador;

public class Lampada {
    private boolean estadoDaLampada;
    private Contador cont = new Contador();

    public void acende(){
        estadoDaLampada = true;

        cont.incrementar();
        System.out.println("A lâmpada está acesa");

    }

    public void apaga(){
        estadoDaLampada = false;
        System.out.println("A lâmpada está apagada");
    }

    public void mostraEstado(){
        System.out.println("estado: "+estadoDaLampada);
        cont.imprimir();
    }

    public boolean estaLigada(){
        return estadoDaLampada;
    }
}
