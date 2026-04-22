import java.util.Scanner;

public class TrianguloPascal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int linhas, col;

        System.out.println("Linhas: ");
        linhas = input.nextInt();

        int[][] triangulo = new int[linhas][];

        for (int linha=0; linha < linhas; linha++){
            // seta as colunas
            col = linha + 2;
            triangulo[linha] = new int[col];

            // seta os valores de 1
            triangulo[linha][0] = 1;
            triangulo[linha][col - 1] = 1;

            // preenchendo o triangulo interno, pulando a primeira e ultima coluna
            for (int c = 1; c < triangulo[linha].length-1; c++){
                // soma do valor da linha acima mais o da linha acima e coluna anterior
                triangulo[linha][c] = triangulo[linha-1][c] + triangulo[linha-1][c-1];
            }
        }

        for (int i = 0; i < triangulo.length; i++){
            for (int j=0; j < triangulo[i].length; j++){
                System.out.print(triangulo[i][j] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}
