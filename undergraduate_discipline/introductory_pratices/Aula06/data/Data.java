package data;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    Data(int d, int m, int a) {
        if (d <= 0 || d > 30 || m <= 0 || m > 12 || a <= 0) {
            this.dia = 01;
            this.mes = 01;
            this.ano = 1971;
            System.out.println("Data invalida");
        } else {
            this.dia = d;
            this.mes = m;
            this.ano = a;
        }
    }

    @Override
    public String toString() {
        return "Data [dia=" + dia + ", mes=" + mes + ", ano=" + ano + "]";
    }

    // Fábrica de instância
    public static Data criaData(int d, int m, int a) {
        if (d <= 0 || d > 30 || m <= 0 || m > 12 || a <= 0) {
            return null;
        } else {
            return new Data(d, m, a);
        }
    }

    public static Data criaNatal(int a) {
        return new Data(25, 12, a);
    }

}