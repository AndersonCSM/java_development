public class Cliente {
    private int id;
    private String nome;
    private int idade;
    private String telefone;

    public Cliente(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 0){
            this.idade = idade;
        } else {
            System.out.println("Idade inválida, default - 0");
            this.idade = 0;
        }

    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (telefone.length() <= 9 && telefone.length() > 0){
            this.telefone = telefone;
        } else {
            System.out.println("Número inválido, default - 988887777");
            this.telefone = "988887777";
        }

    }

    @Override
    public String toString(){
        return String.format("id:       %05d |" +
                             "nome:     %-100s |" +
                             "idade:    %02d anos |" +
                             "telefone: %9s |",id, nome, idade, telefone);
    }
}
