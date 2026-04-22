public class Main {
    public static void main(String[] args){
        float intermediario[][] = {{1f, 2f}, {3f, 4f}};
        
        Matriz m1 = new Matriz(intermediario);
        Matriz m2 = new Matriz(new float[][]{{1f, 2f}, {3f, 4f}});

        m1.print();
        System.out.println(m1.det());
        
        m2.print();
        System.out.println(m2.det());

    }
}
