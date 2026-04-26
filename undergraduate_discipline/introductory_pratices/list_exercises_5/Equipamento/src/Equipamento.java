public class Equipamento {
    private String categoria;
    private float preco;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "'categoria='" + categoria + '\'' +
                ", preco=" + preco + '\'';
    }

    public Equipamento(String categoria, float preco) {
        this.categoria = categoria;
        this.preco = preco;
    }
}
