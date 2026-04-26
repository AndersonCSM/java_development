public class Main {
    public static void main(String[] args) {
        Tecnico t1 = new Tecnico("Carlos", 2400, "0242141", 50);
        Administrativo a1 = new Administrativo("Samira", 1800, "000449", "s");

        System.out.println("Ganho anual de t1: R$"+t1.ganhoAnual());
        System.out.println("Ganho anual de a1: R$"+a1.ganhoAnual());
    }
}
