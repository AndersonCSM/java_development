package Elevadores;

public class Main {
    public static void main(String[] args){
        Elevador elevador = new Elevador(3, 4);

        System.out.println(elevador);
        elevador.entra();
        System.out.println(elevador);
        elevador.sobe();
        System.out.println(elevador);
        elevador.desce();
        System.out.println(elevador);
    }
}
