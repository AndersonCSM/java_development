public class Matriz {
    private float matriz[][];

    public Matriz(float[][] mtx){
        this.matriz = mtx;
    }

    public float det(){
        return ((matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]));
    }

    public void print(){
        for (int i=0; i < matriz.length; i++){
            System.out.print("| ");
            for (int j =0; j < matriz.length; j++){
                System.out.printf("%2.2f |", matriz[i][j]);
            }
            System.out.println("\n--------------");
        }
    }
}
