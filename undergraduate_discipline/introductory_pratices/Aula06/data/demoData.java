package data;

public class demoData {
    public static void main(String args[]) {
        Data d1 = new Data(27, 03, 2026);
        System.out.println(d1);
        Data d2 = Data.criaData(-5, 6, 3);

        if (d2 == null) {
            System.out.println("instancia nao foi criada");
        } else {
            System.out.println(d2);
        }

        Data natal1 = Data.criaNatal(2026);
        System.out.println(natal1);
    }
}
