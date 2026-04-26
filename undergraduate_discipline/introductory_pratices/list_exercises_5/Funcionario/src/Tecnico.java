public class Tecnico extends Assistente {
    private float bonusSalarial;

    Tecnico(String nome, float salario, String matricula, float bonus){
        super(nome, salario, matricula);
        this.bonusSalarial = bonus;
    }

    public float getBonusSalarial() {
        return bonusSalarial;
    }

    public void setBonusSalarial(float bonusSalarial) {
        this.bonusSalarial = bonusSalarial;
    }

    @Override
    public float ganhoAnual() {
        return super.ganhoAnual()+bonusSalarial;
    }

    @Override
    public String toString() {
        return super.toString()+
                ", bonusSalarial=" + bonusSalarial +
                '}';
    }
}
