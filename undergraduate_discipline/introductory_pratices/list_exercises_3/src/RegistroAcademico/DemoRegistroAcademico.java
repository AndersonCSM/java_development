package RegistroAcademico;

public class DemoRegistroAcademico {
    public static void main(String[] args) {
        double mensalidade;
        RegistroAcademico michael = new RegistroAcademico();
        michael.inicializaRegistroAcademico("Michael", 3, 0.5);
        RegistroAcademico roberto2 = new RegistroAcademico();
        roberto2.inicializaRegistroAcademico("Roberto", 3, 0.4);
        RegistroAcademico roberto = new RegistroAcademico();
        roberto.inicializaRegistroAcademico("Roberto", 3, 0.4);
        System.out.println(roberto);
        System.out.println(michael);
    }
}
