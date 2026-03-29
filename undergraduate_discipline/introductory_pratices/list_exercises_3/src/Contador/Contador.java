package Contador;

public class Contador {
    private int contador;

    public void zerar(){
        this.contador = 0;
    }

    public void incrementar(){
        this.contador ++;
    }

    public void imprimir(){
        System.out.println(contador);
    }
}
