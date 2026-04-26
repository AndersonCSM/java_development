public class Assistente extends Funcionario{
    private String matricula;

    Assistente(String nome, float salario, String matricula){
        super(nome, salario);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return super.toString() +
                "matricula: " + matricula + " ";
    }
}
