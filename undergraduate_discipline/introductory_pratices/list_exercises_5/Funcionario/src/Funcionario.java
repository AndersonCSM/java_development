public class Funcionario {
    private String nome;
    private float salario;

    Funcionario(String nome, float salario){
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(float percentual){
        salario = salario * (1+percentual);
    }

    public float ganhoAnual(){
        return salario * 13;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString(){
        return "{ "+"nome: "+nome+" , "
                +"salario: "+salario+" ";
    }
}
