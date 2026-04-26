import java.util.Locale;

public class Administrativo extends Assistente{
    private String turno;
    private final int ADICIONALNOTURNO = 100;

    Administrativo(String nome, float salario, String matricula, String turno){
        super(nome, salario, matricula);
        this.turno = turno;
    }

    @Override
    public float ganhoAnual() {
        int adicional = 0;
        if (turno.toLowerCase().equals("s")) {
            adicional = ADICIONALNOTURNO;
        }

        return super.ganhoAnual() + (12*adicional);
    }

    @Override
    public String toString(){
        return super.toString()+
                " Adicional: "+(turno.equals("N")?ADICIONALNOTURNO:"não")
                + " }";
    }

}
