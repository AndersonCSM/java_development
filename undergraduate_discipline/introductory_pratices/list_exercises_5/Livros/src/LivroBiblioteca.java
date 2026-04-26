public class LivroBiblioteca extends Livro{
    private int codigoLivro;
    private int codigoBiblioteca;

    public LivroBiblioteca(String titulo, int quantidadePaginas, String categoria, String autor, int codigoLivro, int codigoBiblioteca) {
        super(titulo, quantidadePaginas, categoria, autor);
        this.codigoLivro = codigoLivro;
        this.codigoBiblioteca = codigoBiblioteca;
    }

    public int getCodigoLivro() {
        return codigoLivro;
    }

    public void setCodigoLivro(int codigoLivro) {
        this.codigoLivro = codigoLivro;
    }

    public int getCodigoBiblioteca() {
        return codigoBiblioteca;
    }

    public void setCodigoBiblioteca(int codigoBiblioteca) {
        this.codigoBiblioteca = codigoBiblioteca;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", codigoLivro=" + codigoLivro +
                ", codigoBiblioteca=" + codigoBiblioteca +
                '}';
    }
}
