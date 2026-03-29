package RegistroAcademico;

public class RegistroAcademico {
    private String nome;
    private int matricula;
    private int codigoCurso;
    private double percentualDeCobranca;
    private static int numeroDeMatriculas = 1;

    public void inicializaRegistroAcademico(String n, int cod, double perc) {
        nome = n;
        matricula = numeroDeMatriculas++;
        codigoCurso = cod;
        percentualDeCobranca = perc;

    }

    public double calculaMensalidade() {
        return 100 * codigoCurso * percentualDeCobranca;
    }

    @Override
    public String toString() {
        return "RegistroAcademico{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", codigoCurso=" + codigoCurso +
                ", percentualDeCobranca=" + percentualDeCobranca +
                '}';
    }
}
