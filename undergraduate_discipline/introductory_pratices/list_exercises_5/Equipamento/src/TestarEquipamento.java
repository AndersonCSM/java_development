public class TestarEquipamento {
    public static void main(String[] args) {
        Equipamento eq1 = new Equipamento("Redes", 2000);
        Computador eq2 = new Computador("Maquina pessoal", 6000, 32, "i7-12700k");

        System.out.println(eq1);
        System.out.println(eq2);

    }
}
