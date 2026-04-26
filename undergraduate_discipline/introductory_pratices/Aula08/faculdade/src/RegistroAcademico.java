public class RegistroAcademico {
    private String nomeAluno;
    private String matricula;
    private String curso;

    public RegistroAcademico(String nomeAluno, String matricula, String curso) {
        this.nomeAluno = nomeAluno;
        this.matricula = matricula;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "nomeAluno='" + nomeAluno + '\'' +
                ", matricula='" + matricula + '\'' +
                ", curso='" + curso + '\'';
    }
}
