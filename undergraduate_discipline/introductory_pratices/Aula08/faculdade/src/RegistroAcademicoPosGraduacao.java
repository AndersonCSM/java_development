public class RegistroAcademicoPosGraduacao {
    private RegistroAcademico registro;
    private String tituloTese;
    private String orientador;

    public RegistroAcademicoPosGraduacao(RegistroAcademico registro, String tituloTese, String orientador) {
        this.registro = registro;
        this.tituloTese = tituloTese;
        this.orientador = orientador;
    }

    public RegistroAcademicoPosGraduacao(String nomeAluno, String matricula, String curso, String tituloTese, String orientador) {
        this.registro = new RegistroAcademico(nomeAluno, matricula, curso);
        this.tituloTese = tituloTese;
        this.orientador = orientador;
    }

    @Override
    public String toString() {
        return registro +
                ", tituloTese='" + tituloTese + '\'' +
                ", orientador='" + orientador + '\'';
    }
}
