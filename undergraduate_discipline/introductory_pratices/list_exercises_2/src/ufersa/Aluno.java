package ufersa;

public class Aluno {
    int matricula;
    String nome;
    float p1 = 0, p2 = 0, t = 0;

    public float media(){
        return (float)((2.5*p1)+(2.5*p2)+(t*2))/7;
    }

    public double provaFinal(){
        float mp = media();
        if ((mp < 3) || (mp >= 7))
            return 0;
        else
        {
            // MF = (MP * 6 + EF * 4) / 10
            // MF >= 5
            // 5 >= (MP * 6 + EF * 4) / 10
            // (50 - MP * 6) / 4 = EF
            //# EF >= (5 * 10 - MP * 6) / 4
            return (50 - mp * 6) / 4;
        }
    }

    public void mediaFinal(){
        double ef = provaFinal();
        float mp = media();

        if (provaFinal() == 0) {
            System.out.println("Não se aplica prova final");
            if (mp < 3)
                System.out.println("Reprovado");
            else if (mp >= 7)
                System.out.println("Aprovado");
        }
        else
            System.out.printf("Recuperação precisado de %.2f\n",ef);
    }

}
