public class Main {
    public static void main(String[] args) {
        LivroBiblioteca b1 = new LivroBiblioteca("E não sobrou nenhum",
                300, "Investigação",
                "Agatha Christie", 1234, 53493);

        LivroLivraria b2 = new LivroLivraria("E não sobrou nenhum",
                300, "Investigação",
                "Agatha Christie", 100, false);

        System.out.println(b1);
        System.out.println(b2);
    }

}
