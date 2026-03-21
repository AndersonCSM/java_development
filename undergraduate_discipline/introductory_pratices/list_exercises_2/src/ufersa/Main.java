package ufersa;

public class Main {
    public static void main(String[] args) {
        Aluno n1 = new Aluno();
        n1.nome = "Anderson";
        n1.matricula = 1;
        n1.p1 = 7;
        n1.p2 = 7;
        n1.t = 6;

        System.out.printf("A sua média é %.2f\n", n1.media());
        n1.mediaFinal();
    }
}
