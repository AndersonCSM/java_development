public class Main {
    public static void main(String[] args) {
        RegistroAcademico reg1 = new RegistroAcademico("Maria", "111222", "arquitetura");
        RegistroAcademicoPosGraduacao reg2 = new RegistroAcademicoPosGraduacao(reg1, "Arquitetura persistente no semi árido", "Atilson");

        RegistroAcademicoPosGraduacao reg3 = new RegistroAcademicoPosGraduacao("João Lucas", "222333", "Engenharia de computação",
                "Administração em projetos de eletrônica", "Samuel");

    }
}
