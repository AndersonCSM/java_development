package outros;

public class Programa {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.depositar(1000);
        Conta c2 = c1; // criou-se um objeto que aponta para o mesmo objeto c1
        c1.sacar(500);
        System.out.println(c2.saldo);
    }
}
