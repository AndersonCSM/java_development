public class Livro {
    private String titulo;
    private int quantidadePaginas;
    private String categoria;
    private String autor;

    public Livro(String titulo, int quantidadePaginas, String categoria, String autor) {
        this.titulo = titulo;
        this.quantidadePaginas = quantidadePaginas;
        this.categoria = categoria;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getQuantidadePaginas() {
        return quantidadePaginas;
    }

    public void setQuantidadePaginas(int quantidadePaginas) {
        this.quantidadePaginas = quantidadePaginas;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", quantidadePaginas=" + quantidadePaginas +
                ", categoria='" + categoria + '\'' +
                ", autor='" + autor + '\''
                ;
    }
}
