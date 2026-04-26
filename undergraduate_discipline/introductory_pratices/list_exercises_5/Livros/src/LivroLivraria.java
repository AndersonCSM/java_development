public class LivroLivraria extends Livro{
        private float preco;
        private boolean usado;

    public LivroLivraria(String titulo, int quantidadePaginas, String categoria, String autor, float preco, boolean usado) {
        super(titulo, quantidadePaginas, categoria, autor);
        this.preco = preco;
        this.usado = usado;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public boolean isUsado() {
        return usado;
    }

    public void setUsado(boolean usado) {
        this.usado = usado;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", preco=" + preco +
                ", usado=" + usado +
                '}';
    }
}
