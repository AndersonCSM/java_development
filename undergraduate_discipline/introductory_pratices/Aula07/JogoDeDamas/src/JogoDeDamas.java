import java.util.Arrays;

public class JogoDeDamas {
    private static final int NUM = 8;
    private static final int TIME_SIZE = 3;
    private char tabuleiro[][];

    public JogoDeDamas() {
        this.tabuleiro = new char[NUM][NUM];
        limparTabuleiro();
        pecasTabuleiro();
    }

    private void limparTabuleiro(){
        for (int i=0; i < NUM;i++){
            for (int j =0; j < NUM; j++){
                tabuleiro[i][j] = '.';

            }
        }
    }

    private void pecasTabuleiro(){
        // inicializa jogador x
        for (int i=0; i < 3;i++){
            int primeiraColuna = ((i%2==0)?1:0);
            for (int j = primeiraColuna; j < NUM; j+=2){
                tabuleiro[i][j] = 'x';
            }
        }

        // inicializa jogador o
        for (int i=NUM-3; i < NUM;i++){
            int primeiraColuna = ((i%2==0)?1:0);
            for (int j = primeiraColuna; j < NUM; j+=2){
                tabuleiro[i][j] = 'o';
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        out.append("_________________________________\n");
        for (int i=0; i < NUM;i++){
            out.append("|");
            for (int j =0; j < NUM; j++){
                out.append(" "+tabuleiro[i][j] + " |");
            }
            out.append("\n|___|___|___|___|___|___|___|___|\n");
        }
        return out.toString();
    }
}
