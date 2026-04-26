public class Computador extends Equipamento {
    private int capacidadeMemoriaRam;
    private String processador;

    public Computador(String categoria, float preco, int capacidadeMemoriaRam, String processador) {
        super(categoria, preco);
        this.capacidadeMemoriaRam = capacidadeMemoriaRam;
        this.processador = processador;
    }

    public int getCapacidadeMemoriaRam() {
        return capacidadeMemoriaRam;
    }

    public void setCapacidadeMemoriaRam(int capacidadeMemoriaRam) {
        this.capacidadeMemoriaRam = capacidadeMemoriaRam;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    @Override
    public String toString() {
        return super.toString() +
                "capacidadeMemoriaRam=" + capacidadeMemoriaRam +
                ", processador='" + processador;
    }
}
